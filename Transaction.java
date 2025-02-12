package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transaction extends JFrame implements ActionListener {
    
    JButton deposit, withdrawl, fastcash, mini_statement, pin_change, balance_enquiry, exit;
    String pin_detail;
    Transaction(String pin_detail){ //*uses construction//
        this.pin_detail = pin_detail;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(990, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 920, 750);
        add(image);
        
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(215, 230, 680, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text); //* add text on image  help of add function with image *//
      
        deposit = new JButton("Deposit");
        deposit.setBounds(145, 344, 130, 30);
        deposit.addActionListener(this);
        image.add(deposit);
       
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(395, 344, 130, 28);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(145, 377, 130, 28);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        mini_statement = new JButton("Mini Statement");
        mini_statement.setBounds(395, 375, 130, 28);
        mini_statement.addActionListener(this);
        image.add(mini_statement);
        
        pin_change = new JButton("Pin Change");
        pin_change.setBounds(145, 408, 130, 28);
        pin_change.addActionListener(this);
        image.add(pin_change);
        
        balance_enquiry = new JButton("Balance Enquiry");
        balance_enquiry.setBounds(395, 406, 130, 28);
        balance_enquiry.addActionListener(this);
        image.add(balance_enquiry);
        
        exit = new JButton("EXIT");
        exit.setBounds(395, 437, 130, 28);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(920, 900);
        setLocation(240, 0);
        setUndecorated(true);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit) {
            System.exit(0);
        }else if(ae.getSource() == deposit) {
            setVisible(false);
            new Deposit(pin_detail).setVisible(true);
            
        }else if (ae.getSource() == withdrawl) {
            setVisible(false);
            new Withdrawl(pin_detail).setVisible(true);
        }else if(ae.getSource() == fastcash){
            setVisible(false);
            new FastCash(pin_detail).setVisible(true);
        }else if(ae.getSource() == pin_change) {
            setVisible(false);
            new PinChange(pin_detail).setVisible(true);
        }else if(ae.getSource() == balance_enquiry) {
            setVisible(false);
            new BalanceEnquiry(pin_detail).setVisible(true);
        }else if(ae.getSource() == mini_statement) {
            new MiniStatement(pin_detail).setVisible(true);
                    
        }
    }
    public static void main(String args[]) {
    new Transaction("");
    }
}
