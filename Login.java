package bank.management.system;
import javax.swing.*; /* import all swing packages */
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{ /* Inheritence concetp and interface */
    /*Globally defind Button*/
    JButton login, Signup, Clear;
    JTextField CardTextField;
    JPasswordField PinTextField;
    Login(){ /* create constructor */
        setTitle("AUTOMATED TELLER MACHINE"); /*set for frame title*/
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));/*make a imageicon object */
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); /*create a image icon object*/ 
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100); /*using setBound function*/
        add(label); /* using add function and place imageicon(i) on jFrame*/
        JLabel text = new JLabel("Welcome To ATM"); /*write content on JFrame*/
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40); /*Define Location*/
        add(text);
        JLabel Cardno = new JLabel("CARD NO:"); /*write Card No. on JFrame*/
        Cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        Cardno.setBounds(120, 150, 150, 40); /*Define Location*/
        add(Cardno);
        CardTextField = new JTextField(); /*user entry for uses texfield*/
        CardTextField.setBounds(300, 150, 230, 30);
        CardTextField.setFont(new Font("Arial", Font.BOLD, 14)); /*change card font color and size*/
        add(CardTextField);
        
        JLabel Pin = new JLabel("Pin:"); /*write Pin No. on JFrame*/
        Pin.setFont(new Font("Raleway", Font.BOLD, 28));
        Pin.setBounds(120, 220, 230, 30); /*Define Location*/
        add(Pin);
        
        PinTextField = new JPasswordField(); /*user entry for uses texfield*/
        PinTextField.setBounds(300, 220, 230, 30);
        PinTextField.setFont(new Font("Arial", Font.BOLD, 14));/*change password font color and size*/
        add(PinTextField);
        
        login = new JButton("SIGN IN"); /*user sign in */
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);/*call the function for  addactionlistener*/
        add(login);
        
        Clear = new JButton("CLEAR"); /*user click clear */
        Clear.setBounds(430, 300, 100, 30);
        Clear.setBackground(Color.black);
        Clear.setForeground(Color.white);
        Clear.addActionListener(this);
        add(Clear);
        
        Signup = new JButton("SIGN UP"); /*user click signup*/
        Signup.setBounds(300, 350, 230, 30);
        Signup.setBackground(Color.black);
        Signup.setForeground(Color.white);
        Signup.addActionListener(this);
        add(Signup);
        
        getContentPane().setBackground(Color.white);
        setSize(800, 480); /* uses set size function */
        setVisible(true); /*function call */
        setLocation(350, 180); /*uses setlocaion function for change location */
    }
    public void actionPerformed(ActionEvent ae) 
    { 
        if(ae.getSource() == Clear) { /*uses of actioneven class and getsources function */
           CardTextField.setText(""); /* call the cardtextfield */
           PinTextField.setText(""); /* call the pintextfield */
        }else if(ae.getSource() == login) {
            conn c = new conn();
            String card_number = CardTextField.getText();
            String pin_detail = PinTextField.getText();
            String query1 = " select * from login where card_number = '"+card_number+"' and pin_detail = '"+pin_detail+"'"; //* user pin and cardno match database *//   
            try {
               ResultSet rs =   c.s.executeQuery(query1);
               if (rs.next()) {
                   setVisible(false);
                   new Transaction(pin_detail).setVisible(true);
               }else {
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");
                   
               }
            }catch (Exception e) {
                System.out.println(e);
            }
            
            
        }else if(ae.getSource() == Signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Login();
    }
    
}
