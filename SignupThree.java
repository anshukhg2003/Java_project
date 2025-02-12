package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
    
    //*Gloabally decalare*//
    JRadioButton saving_account, fixed_deposite_account, current_account, recurring_account;
    JCheckBox atm_card, internet_banking, mobile_banking, check_book, email_sms_alert, e_statement, here_declare;
    JButton submit, cancel;
    String Formno;
    
    SignupThree(String Formno){ //*create construction*//
     this.Formno = Formno;
     setLayout(null);
     JLabel l1 = new JLabel("Page 3: Account Details "); 
     l1.setFont(new Font("Raleway",Font.BOLD, 22));
     l1.setBackground(Color.BLACK);
     l1.setBounds(280, 40, 400, 40);
     add(l1);
     JLabel account_type = new JLabel("Account Type:");
     account_type.setFont(new Font("Raleway", Font.BOLD, 22));
     account_type.setBounds(100, 140, 200, 30);
     add(account_type);
     
     saving_account = new JRadioButton("Saving Account");
     saving_account.setFont(new Font("Raleway", Font.BOLD, 16));
     saving_account.setBackground(Color.white);
     saving_account.setForeground(Color.black);
     saving_account.setBounds(100, 180, 230, 20);
     add(saving_account);
     
     fixed_deposite_account = new JRadioButton("Fixed Deposite Account");
     fixed_deposite_account.setFont(new Font("Raleway", Font.BOLD, 16));
     fixed_deposite_account.setBackground(Color.white);
     fixed_deposite_account.setForeground(Color.black);
     fixed_deposite_account.setBounds(350, 180, 230, 20);
     add(fixed_deposite_account);
     
     current_account = new JRadioButton("Current Account");
     current_account.setFont(new Font("Raleway", Font.BOLD, 16));
     current_account.setBounds(100, 220, 230, 20);
     current_account.setBackground(Color.white);
     current_account.setForeground(Color.black);
     add(current_account);
     
     recurring_account = new JRadioButton("Recurring Account");
     recurring_account.setFont(new Font("Raleway", Font.BOLD, 16));
     recurring_account.setBackground(Color.WHITE);
     recurring_account.setForeground(Color.BLACK);
     recurring_account.setBounds(350, 220, 230, 20);
     add(recurring_account);
     
     ButtonGroup buttongroup = new ButtonGroup();
     buttongroup.add(saving_account);
     buttongroup.add(fixed_deposite_account);
     buttongroup.add(current_account);
     buttongroup.add(recurring_account);
     
     JLabel card_number = new JLabel("Card Number");
     card_number.setFont(new Font("Raleway", Font.BOLD,22));
     card_number.setBounds(100, 280, 200, 30);
     add(card_number);
     
     JLabel number = new JLabel ("XXXX-XXXX-XXXX-0468");
     number.setFont(new Font("Raleway", Font.BOLD,22));
     number.setBounds(330, 280, 300, 30);
     add(number);
     
     JLabel card_detail = new JLabel("Your 16 Digit Card Number");
     card_detail.setFont(new Font("Raleway", Font.BOLD, 12));
     card_detail.setBounds(100, 310, 300, 20);
     add(card_detail);
     
     JLabel pin_detail = new JLabel("PIN:");
     pin_detail.setFont(new Font("Raleway", Font.BOLD, 22));
     pin_detail.setBounds(100, 350, 200, 30);
     add(pin_detail);
     
     JLabel pin_num = new JLabel("XXXX");
     pin_num.setFont(new Font("Raleway", Font.BOLD, 22));
     pin_num.setBounds(330, 350, 200, 30);
     add(pin_num);
      
     
     JLabel pin_user = new JLabel("Your 4 digit Password");
     pin_user.setFont(new Font("Raleway", Font.BOLD, 12));
     pin_user.setBounds(100, 380, 300, 20);
     add(pin_user);
     
    JLabel services = new JLabel("Services Required");
    services.setFont(new Font("Raleway", Font.BOLD, 22));
    services.setBounds(100, 420, 200, 30);
    add(services);
    
    atm_card = new JCheckBox("ATM CARD");
    atm_card.setFont(new Font("Raleway", Font.BOLD, 16));
    atm_card.setBackground(Color.white);
    atm_card.setBounds(100, 470, 200, 30);
    add(atm_card);
    
    internet_banking = new JCheckBox("Internet Banking");
    internet_banking.setFont(new Font("Raleway", Font.BOLD, 16));
    internet_banking.setBackground(Color.white);
    internet_banking.setBounds(350, 470, 200, 30);
    add(internet_banking);
    
    mobile_banking = new JCheckBox("Mobile Banking");
    mobile_banking.setFont(new Font("Raleway",Font.BOLD, 16));
    mobile_banking.setBackground(Color.white);
    mobile_banking.setBounds(100, 520, 200, 30);
    add(mobile_banking);
    
    check_book = new JCheckBox("Cheque Book");
    check_book.setFont(new Font("Raleway", Font.BOLD, 16));
    check_book.setBackground(Color.white);
    check_book.setBounds(350, 520, 200, 30);
    add(check_book);
    
    email_sms_alert = new JCheckBox("EMAIL & SMS Alerts");
    email_sms_alert.setFont(new Font("Raleway", Font.BOLD, 16));
    email_sms_alert.setBackground(Color.white);
    email_sms_alert.setBounds(100, 570, 200, 30);
    add(email_sms_alert);
    
    e_statement = new JCheckBox("E Statement");
    e_statement.setFont(new Font("Raleway", Font.BOLD, 16));
    e_statement.setBackground(Color.white);
    e_statement.setBounds(350, 570, 200, 30);
    add(e_statement);
    
    here_declare = new JCheckBox("I here by declares that above the entered details are correct to the best of my knowledge");
    here_declare.setFont(new Font("Raleway", Font.BOLD, 12));
    here_declare.setBackground(Color.white);
    here_declare.setBounds(100, 620, 600, 30);
    add(here_declare);
    
    submit = new JButton("Submit");
    submit.setFont(new Font("Raleway", Font.BOLD, 14));
    submit.setBackground(Color.black);
    submit.setForeground(Color.white);
    submit.setBounds(250, 660, 100, 30);
    submit.addActionListener(this);
    add(submit);
    
    cancel = new JButton("Cancel");
    cancel.setFont(new Font("Raleway", Font.BOLD, 14));
    cancel.setBackground(Color.BLACK);
    cancel.setForeground(Color.white);
    cancel.setBounds(420, 660, 100, 30);
    cancel.addActionListener(this);
    add(cancel);
     //*create a Frame*//
     setSize(850, 820);
     setLocation(350,0);
     getContentPane().setBackground(Color.WHITE);
     setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) /*funtion override*/
    {
        if(ae.getSource() == submit){
            String account_type = null;
            if(saving_account.isSelected()){
                account_type = "Saving Account";
            }else if (fixed_deposite_account.isSelected()){
                account_type = "Fixed Deposite Account";
            }else if (current_account.isSelected()){
                account_type = "Current Account";
            }else if (recurring_account.isSelected()){
                account_type = "Recurring Account";  
        }
            Random random = new Random();
            String card_number = "" + (Math.abs(random.nextLong()) % 9000000000000000L + 1000000000000000L);
            String pin_detail = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility = "";
            if(atm_card.isSelected()){
                facility = facility + " ATM Card";
            }else if(internet_banking.isSelected()){
                facility = facility + " Internet Banking";
            }else if(mobile_banking.isSelected()){
                facility = facility + " Mobile Banking";
            }else if(check_book.isSelected()){
                facility = facility + " Checque Book";
            }else if(email_sms_alert.isSelected()){
                facility = facility + " Email & SMS Alert";
            }else if(e_statement.isSelected()){
                facility = facility + " E Statement";
            }
            try {
                if (account_type.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else{
                    conn c = new conn();
                    String query = "insert into SignupThree values('"+Formno+"', '"+account_type+"', '"+card_number+"', '"+pin_detail+"', '"+facility+"')";
                    String query1 = "insert into login values('"+Formno+"', '"+card_number+"', '"+pin_detail+"')"; 
                    c.s.executeUpdate(query);
                    c.s.executeUpdate(query1);
                    
                    JOptionPane.showMessageDialog(null, "card_number:" + card_number + "\n Pin: " + pin_detail ); {
                    
                }    
                    setVisible(false);
                    new Deposit(pin_detail).setVisible(false);
                }
                
            }catch (Exception e){
                System.out.println(e);
            }
           
         } else if(ae.getSource() == cancel){
           setVisible(false);
           new Login().setVisible(true);
         }
    }
    public static void main(String args[]){
        new SignupThree("");
    }
    
}
