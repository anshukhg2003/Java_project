package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PinChange extends JFrame implements ActionListener {
    JPasswordField pin, repin;
    JButton change, back;
    String pin_detail;

PinChange(String pin_detail){
    this.pin_detail = pin_detail;
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2 = i1.getImage().getScaledInstance(990, 830, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 920, 750);
    add(image);
    
    JLabel text = new JLabel("CHANGE YOUR PIN");
    text.setForeground(Color.white);
    text.setBounds(280, 225, 680, 35);
    text.setFont(new Font("System", Font.BOLD, 16));
    image.add(text);
    
    JLabel pin_text = new JLabel("New Pin:");
    pin_text.setForeground(Color.white);
    pin_text.setFont(new Font("System", Font.BOLD, 16));
    pin_text.setBounds(180, 270, 180, 25);
    image.add(pin_text);
    
    pin = new JPasswordField();
    pin.setFont(new Font("Raleway", Font.BOLD, 25));
    pin.setBounds(372, 270, 180, 25);
    image.add(pin);
    
    JLabel re_pintext = new JLabel("Re-Enter New PIN:");
    re_pintext.setForeground(Color.white);
    re_pintext.setFont(new Font("System", Font.BOLD, 16));
    re_pintext.setBounds(180, 310, 180, 25);
    image.add(re_pintext);
    
    repin = new JPasswordField();
    repin.setFont(new Font("Raleway", Font.BOLD, 16));
    repin.setBounds(372, 310, 180, 25);
    image.add(repin);
    
    change = new JButton("CHANGE");
    change.setBounds(420, 405, 130, 28);
    change.addActionListener(this);
    image.add(change);
    
    back = new JButton("BACK");
    back.setBounds(420, 437, 130, 28);
    back.addActionListener(this);
    image.add(back);
    
    setSize(990, 830);
    setLocation(300, 0);
    setUndecorated(true);
    setVisible(true);
}
public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == change) {
    try {
        String npin = pin.getText();
        String rpin = repin.getText();
        
        if(!npin.equals(rpin)){
          JOptionPane.showMessageDialog(null, "Entered PIN does not match");
          return;
        }
        
        if(npin.equals("")){
         JOptionPane.showMessageDialog(null, "Please enter new PIN");
         return;
        }
        
        if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Please re-enter new PIN");
            return;
        }
        conn c = new conn();
        String query1 = "Update bank set pin_detail = '"+rpin+"' where pin_detail ='"+pin_detail+"'";
        String query2 = "Update login set pin_detail = '"+rpin+"' where pin_detail ='"+pin_detail+"'";
        String query3 = "Update SignupThree set pin_detail = '"+rpin+"' where pin_detail='"+pin_detail+"'";
        c.s.executeUpdate(query1);
        c.s.executeUpdate(query2);
        c.s.executeUpdate(query3);
        JOptionPane.showMessageDialog(null, "Pin Changed Successfully");
        setVisible(false);
        new Transaction(rpin).setVisible(true);
              
    }catch (Exception e) {
        System.out.println(e);
    }
    }else {
       setVisible(false);
       new Transaction(pin_detail).setVisible(true);
    }
    
}

public static void main(String args[]) {
     new PinChange("").setVisible(true);
} 
}
