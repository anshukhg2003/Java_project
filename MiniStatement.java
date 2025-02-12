package bank.management.system;

import java.awt.Color;
import javax.swing.*;
import java.sql.*;
public class MiniStatement extends JFrame {
    
    MiniStatement(String pin_detail) {
        setTitle("Mini Statement");
        
        setLayout(null);
        
        JLabel balance = new JLabel();
        balance.setBounds(20, 395, 395, 20);
        add(balance);
        
        JLabel mini = new JLabel();
        mini.setBounds(16, 140, 400, 160);
        add(mini);
             
        JLabel  bank = new JLabel(" Our National Bank ");
        bank.setBounds(140, 18, 180, 20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);
        
        try {
            
            conn c = new conn();
           ResultSet rs = c.s.executeQuery("select * from login where Pin_detail ='" +pin_detail+"'");
           while(rs.next()) {
               card.setText("Card Number: " + rs.getString("card_number").substring(0, 4)+ "XXXXXXXX" + rs.getString("card_number").substring(12) );
           }
            
            
        }catch (Exception e){
         System.out.println(e);
        }
        
        try {
            int bal =0;
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin_detail = '"+pin_detail+"'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; " + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><br><html>");
                if (rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                }else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }  
            }
            balance.setText("Your current account balance is Rs: " + bal);
        }catch (Exception e) {
            System.out.println(e);
        }
        
        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public static void main(String args[]){
         new MiniStatement("");
    }
   
    
}
