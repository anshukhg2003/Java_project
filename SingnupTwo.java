package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SingnupTwo extends JFrame implements ActionListener {
    //*Globally define*//
    JComboBox religon1, category1, income1, qualification1, occupation1;
    JTextField pan_no1, aadhaar_no1;
    JRadioButton yes_senior_citizen, no_senior_citizen, yes_exist_account, no_exist_account;
    JButton next;
    String Formno;
    SingnupTwo(String Formno){
        this.Formno = Formno;
        setLayout(null);
        setTitle("New Account Application Form page 2");
        JLabel additionaldetails = new JLabel("Page 2: Additional Details");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetails.setBounds(290, 80, 400, 30);
        add(additionaldetails);
        JLabel religon = new JLabel("Religon:");
        religon.setFont(new Font("Raleway", Font.BOLD, 20));
        religon.setBounds(100, 140, 100, 30);
        add(religon);
        //  array initialization for combo box
        String valReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
      // Create JComboBox using the array valReligion
        religon1 = new JComboBox(valReligion);
        religon1.setBounds(300, 140, 400, 30);
        religon1.setBackground(Color.white);
        add(religon1);
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        String valCategory[] = {"General", "OBC", "EBC", "SC/ST", "Other"};
        category1 = new JComboBox(valCategory);
        category1.setBounds(300, 190, 400, 30);
        category1.setBackground(Color.white);
        add(category1);
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);
        String valIncome[] = {"null", "<1,50,000", "<2,50,000","<5,00,000","upto 10,00,000"};
        income1 = new JComboBox(valIncome);
        income1.setBackground(Color.white);
        income1.setBounds(300, 240, 400, 30);
        add(income1);
        JLabel educational = new JLabel("Educational:");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        String valQualification[] = {"Non-Graduate", "Graudate", "Post-Grauduate", "Other"};
        qualification1 = new JComboBox(valQualification);
        qualification1.setBackground(Color.white);
        qualification1.setBounds(300, 315, 400, 30);
        add(qualification1);
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        String valOccupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        occupation1 = new JComboBox(valOccupation);
        occupation1.setBackground(Color.white);
        occupation1.setBounds(300, 390, 400, 30);
        add(occupation1);
        JLabel pan_no = new JLabel("PAN Number:");
        pan_no.setFont(new Font("Raleway", Font.BOLD, 20));
        pan_no.setBounds(100, 440, 200, 30);
        add(pan_no);
        pan_no1 = new JTextField();
        pan_no1.setFont(new Font("Raleway", Font.BOLD, 14));
        pan_no1.setBounds(300, 440, 400, 30);
        add(pan_no1);
        JLabel aadhaar_no = new JLabel("Aadhaar Number:");
        aadhaar_no.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhaar_no.setBounds(100, 490, 200, 30);
        add(aadhaar_no);
        aadhaar_no1 = new JTextField();
        aadhaar_no1.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhaar_no1.setBounds(300, 490, 400, 30);
        add(aadhaar_no1);
        JLabel senior_citizen = new JLabel("Senior Citizen:");
        senior_citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        senior_citizen.setBounds(100, 540, 200, 30);
        add(senior_citizen);
        
        yes_senior_citizen = new JRadioButton("Yes");
        yes_senior_citizen.setBackground(Color.white);
        yes_senior_citizen.setBounds(300, 540, 100, 30);
        add(yes_senior_citizen);
        
        no_senior_citizen = new JRadioButton("No");
        no_senior_citizen.setBackground(Color.white);
        no_senior_citizen.setBounds(450, 540, 100, 30);
        add(no_senior_citizen);
        
        ButtonGroup yes_no = new ButtonGroup();
        yes_no.add(yes_senior_citizen);
        yes_no.add(no_senior_citizen);
        
        JLabel existing_account = new JLabel("Existing Account:");
        existing_account.setFont(new Font("Raleway", Font.BOLD, 20));
        existing_account.setBounds(100, 590, 200, 30);
        add(existing_account);
        
        yes_exist_account = new JRadioButton("Yes");
        yes_exist_account.setBounds(300, 590, 100, 30);
        yes_exist_account.setBackground(Color.white);
        add(yes_exist_account);
        
        no_exist_account = new JRadioButton("No");
        no_exist_account.setBounds(450, 590, 100, 30);
        no_exist_account.setBackground(Color.white);
        add(no_exist_account);
        
        ButtonGroup yesno_exist_account = new  ButtonGroup();
        yesno_exist_account.add(yes_exist_account);
        yesno_exist_account.add(no_exist_account);
     
        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,5);
        setVisible(true);
           
    }
    public void actionPerformed(ActionEvent ae){
        String religon = (String)religon1.getSelectedItem(); /*typecast string*/
        String category = (String)category1.getSelectedItem();
        String income = (String) income1.getSelectedItem();
        String qualification = (String) qualification1.getSelectedItem();
        String occupation = (String) occupation1.getSelectedItem();
        String Senior_Citizen = null;
        if(yes_senior_citizen.isSelected()){
            Senior_Citizen = "Yes";
        }else if (no_senior_citizen.isSelected()){
            Senior_Citizen = "No";
        }
        String Exist_Account = null;
        if(yes_exist_account.isSelected()){
            Exist_Account = "Yes";
        }else if(no_exist_account.isSelected()){
            Exist_Account = "No";
        }
        String pan = pan_no1.getText();
        String aadhaar = aadhaar_no1.getText();
        try{
            conn c = new conn();
            String query = "insert into SingnupTwo values('"+Formno+"', '"+religon+"', '"+category+"', '"+income+"', '"+qualification+"', '"+occupation+"', '"+pan+"', '"+aadhaar+"', '"+Exist_Account+"', '"+Senior_Citizen+"')";
            c.s.executeUpdate(query);
            
            //signuptwo object *//
            setVisible(false);
            new SignupThree(Formno).setVisible(true);
        }catch (Exception e ){
          System.out.println(e);
        }
            
    }
    public static void main(String args[])
    {
       new  SingnupTwo(" ");
    }
    
}

