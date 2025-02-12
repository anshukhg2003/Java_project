package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back; 
    String pin_detail;
    BalanceEnquiry(String pin_detail) {
        this.pin_detail = pin_detail;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(990, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 990, 800);
        add(image);
        
        back = new JButton("BACK");
        back.setBounds(430, 430, 130, 28);
        back.addActionListener(this);
        image.add(back);
        
         conn c = new conn();
         int balance = 0;
          try {
              ResultSet rs =  c.s.executeQuery("Select * from bank where pin_detail = '"+pin_detail+"'");
              while(rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }  
              }
          }catch (Exception e) {
          System.out.println(e);
 
              
          }
        
          JLabel text = new JLabel("Your Current Account balance is RS " + balance);
          text.setForeground(Color.white);
          text.setFont(new Font("System", Font.BOLD, 14));
          text.setBounds(215, 260, 400, 30);
          image.add(text);
          
        setSize(990, 800);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pin_detail).setVisible(true);           
    }
    public static void main(String args[]){
        new BalanceEnquiry("");
    }
}
