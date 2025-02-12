
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JTextField amount;
    JButton withdrawl, back;
    String pin_detail;
    Withdrawl(String pin_detail){
        this.pin_detail = pin_detail;
        
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(990, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 920, 750);
        add(image);
        
        JLabel text = new JLabel("Enter the amount  you want to Withdrawl");
        text.setForeground(Color.white);
        text.setFont(new Font("system", Font.BOLD, 16));
        text.setBounds(180, 230, 680, 35);
        image.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(180, 300, 320, 25);
        image.add(amount);
        
        withdrawl = new JButton("withdrawl");
        withdrawl.setBounds(388, 405, 130, 28);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        back = new JButton("Back");
        back.setBounds(388, 437, 130, 28);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(920, 900);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == withdrawl) {
           String withdrawl_amount = amount.getText();
           Date date = new Date();
           if(withdrawl_amount.equals("")){
               JOptionPane.showMessageDialog(null, "Please enter the amoun tyou want to withdrawl ");
           }else{
               try{
                   conn c = new conn();
                   String query = "Insert into bank values('"+pin_detail+"', '"+date+"', 'Withdrawl', '"+withdrawl_amount+"')";
                   c.s.executeUpdate(query);
                   JOptionPane.showMessageDialog(null, "Rs " +withdrawl_amount+  " Withdrawl Succuessfully");
                   setVisible(false);
                   new Transaction(pin_detail).setVisible(true);
               }catch (Exception e){
                   System.out.println(e);
               }
           }
        }else if(ae.getSource() == back){
            setVisible(false);
            new Transaction(pin_detail).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Withdrawl("");
          
    }
    
}
