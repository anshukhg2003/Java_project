package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*; /*util package for random class */
import com.toedter.calendar.JDateChooser; /*import package for calender*/
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
    /* Defin declare globally */
    long random;
    JTextField nametextfield, Fnametextfield,dob,emailtextfield,addresstextfield,citytextfield,statetextfield,pincodetextfield;
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;
    SignupOne(){ /* create a constructor */
        setLayout(null); /* set layout is border layout so, null */
        Random ran = new Random(); /* create object random */
        random = Math.abs((ran.nextLong() % 9000L) + 1000L); /*rondom number uses on form*/
        JLabel Formno = new JLabel("Application Form No. "+ random);
        Formno.setFont(new Font("Raleway", Font.BOLD, 38)); /*use of setfont function of change font */
        Formno.setBounds(140, 20, 600, 40);
        add(Formno);
        JLabel PersonalDetails = new JLabel("Page 1:  Personal Details");
        PersonalDetails.setFont(new Font("Raleway", Font.BOLD, 22)); /*use of setfont function of change font */
        PersonalDetails.setBounds(250, 80, 400, 30);
        add(PersonalDetails);
        JLabel Name = new JLabel("Name:");
        Name.setFont(new Font("Raleway", Font.BOLD, 20));
        Name.setBounds(100, 140, 100, 30);
        add(Name);
        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        nametextfield.setBounds(300, 140, 400, 30);
        add(nametextfield);
        JLabel Fname = new JLabel("Father's Name:");
        Fname.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Fname.setBounds(100, 190, 200, 30);
        add(Fname);
        Fnametextfield = new JTextField();
        Fnametextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        Fnametextfield.setBounds(300, 190, 400, 30);
        add(Fnametextfield);
        JLabel Dob = new JLabel("Date Of Birth:");
        Dob.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Dob.setBounds(100, 240, 200, 30);
        add(Dob);
        dateChooser = new JDateChooser(); /*create object jdatechooser*/
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);
        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Gender.setBounds(100, 290, 200, 30);
        add(Gender);
        male = new JRadioButton("Male"); /*create radio button for select gender*/
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.white);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup(); /* create a object button group any one select */
        gendergroup.add(male);
        gendergroup.add(female);
        JLabel Email = new JLabel("Email Address:");
        Email.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Email.setBounds(100, 340, 200, 30);
        add(Email);
        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtextfield.setBounds(300, 340, 400, 30);
        add(emailtextfield);
        JLabel Marital = new JLabel("Marital Status:");
        Marital.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Marital.setBounds(100, 390, 200, 30);
        add(Marital);
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.white);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.white);
        add(other);
        ButtonGroup marritalgroup = new ButtonGroup();
        marritalgroup.add(married);
        marritalgroup.add(unmarried);
        marritalgroup.add(other);
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        address.setBounds(100, 440, 200, 30);
        add(address);
        addresstextfield = new JTextField();
        addresstextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        addresstextfield.setBounds(300, 440, 400, 30);
        add(addresstextfield);
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        city.setBounds(100, 490, 200, 30);
        add(city);
        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        citytextfield.setBounds(300, 490, 400, 30);
        add(citytextfield);
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        state.setBounds(100, 540, 200, 30);
        add(state);
        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.BOLD, 14));
        statetextfield.setBounds(300, 540, 400, 30);
        add(statetextfield);
        JLabel Pincode = new JLabel("Pin Code:");
        Pincode.setFont(new Font("Raleway", Font.BOLD, 20)); /*use of setfont function of change font */
        Pincode.setBounds(100, 590, 200, 30);
        add(Pincode);
        pincodetextfield = new JTextField();
        pincodetextfield.setFont(new Font("RAleway", Font.BOLD, 14));
        pincodetextfield.setBounds(300, 590, 400, 30);
        add(pincodetextfield);
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.white);
        setSize(850,800); /*create a frame */
        setLocation(350, 5); /*setlocation on a frame */
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ae){
        String Formno = "" + random; //long
        String name = nametextfield.getText(); /* get a name text value */
        String Fname = Fnametextfield.getText(); /* get fathers nametext value */
        String Dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        } 
        String email = emailtextfield.getText();
        String Marital = null;
        if (married.isSelected()){
            Marital = "Married";
        }else if(unmarried.isSelected()){
            Marital = "Unmarried";
        } else if(other.isSelected()){
            Marital = "Other";
        }
        String address = addresstextfield.getText();
        String city = citytextfield.getText();
        String state = statetextfield.getText();
        String pincode = pincodetextfield.getText();
        
        try
        {
            if (name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                conn c = new conn(); /*connection established*/
                String query = "insert into signup values('"+Formno+"', '"+name+"', '"+Fname+"', '"+Dob+"', '"+gender+"', '"+email+"', '"+Marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                c.s.executeUpdate(query); /*Execute mysql query with the help conn*/
                setVisible(false);
                new SingnupTwo(Formno).setVisible(true);
            }  
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        new SignupOne(); /*create a object*/
    }
    
}
