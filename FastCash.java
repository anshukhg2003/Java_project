package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;
public class FastCash extends JFrame implements ActionListener {
  JButton one_hundred, five_hundred, one_thousand, two_thousand, five_thousand, ten_thousand, back;
  String pin_detail;
  FastCash(String pin_detail){
      this.pin_detail = pin_detail;
      setLayout(null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
      Image i2 = i1.getImage().getScaledInstance(990, 830, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      
      JLabel image = new JLabel(i3);
      image.setBounds(0, 0, 920, 750);
      add(image);
      
      JLabel text = new JLabel("Select Withdrawl Amount ");
      text.setForeground(Color.white);
      text.setFont(new Font("System", Font.BOLD, 16));
      text.setBounds(215, 230, 680, 35);
      image.add(text);
      
      one_hundred = new JButton("Rs 100");
      one_hundred.setBounds(145, 344, 130, 30);
      one_hundred.addActionListener(this);
      image.add(one_hundred);
      
      five_hundred = new JButton("RS 500");
      five_hundred.setBounds(395, 344, 130, 28);
      five_hundred.addActionListener(this);
      image.add(five_hundred);
      
      one_thousand = new JButton("RS 1000");
      one_thousand.setBounds(145, 377, 130, 28);
      one_thousand.addActionListener(this);
      image.add(one_thousand);
      
      two_thousand = new JButton("Rs 2000");
      two_thousand.setBounds(395, 375, 130, 28);
      two_thousand.addActionListener(this);
      image.add(two_thousand);
      
      five_thousand = new JButton("Rs 5000");
      five_thousand.setBounds(145, 408, 130, 28);
      five_thousand.addActionListener(this);
      image.add(five_thousand);
      
      ten_thousand= new JButton("Rs 10000");
      ten_thousand.setBounds(395, 406, 130, 28);
      ten_thousand.addActionListener(this);
      image.add(ten_thousand);
      
      back = new JButton("BACK");
      back.setBounds(395, 437, 130, 28);
      back.addActionListener(this);
      image.add(back);
      
      setSize(920, 900);
      setLocation(240, 0);
      setUndecorated(true);
      setVisible(true);
      
         
  }
  public void actionPerformed(ActionEvent ae) {
      if(ae.getSource() == back) {
          setVisible(false);
          new Transaction(pin_detail).setVisible(true);
      }else  {
          String amount = ((JButton)ae.getSource()).getText().substring(3); //*Rs 200*//
          conn c = new conn();
          try {
              ResultSet rs =  c.s.executeQuery("Select * from bank where pin_detail = '"+pin_detail+"'");
              int balance =0;
              while(rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }  
                if (ae.getSource()!= back && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance" );
                    return;
                    
                }
                Date date = new Date();
                String query = "Insert into bank values('"+ pin_detail +"', '" + date + "', 'withdrawl', '"+ amount+ "')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, " Rs "+ amount + " Debited Successfully");
               
                setVisible(false);
                new Transaction(pin_detail).setVisible(true);
              }
              
          }catch (Exception e){
              System.out.println(e);
          }
      }
          
  }
  public static void main(String args[]){
   new FastCash("");   
  }
}