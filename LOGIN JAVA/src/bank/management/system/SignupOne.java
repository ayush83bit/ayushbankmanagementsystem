
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author utkar
 */
public class SignupOne extends JFrame implements ActionListener  {
    long random;
    JDateChooser dateChooser;
    JRadioButton male , female , other ,married , unmarried;
    JTextField nameTextField, fnameTextField, stateTextField  , emailTextField,ADDRESSTextField , CITYTextField,pinTextField;
SignupOne(){
    setLayout(null);
    Random ran = new Random ();
    long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
    
    JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
    formno.setFont(new Font ("raleway",Font.BOLD,38));
    formno.setBounds(140,20,600,40);
    add(formno);
    
    JLabel personaldetails = new JLabel("Page 1 : Personal Details" );
    personaldetails.setFont(new Font ("raleway",Font.BOLD,22));
    personaldetails.setBounds(290,80,400,30);
    add(personaldetails);
    
    JLabel name = new JLabel("NAME:" );
    name.setFont(new Font ("raleway",Font.BOLD,22));
    name.setBounds(100,140,100,30);
    add(name);
    
   nameTextField = new JTextField();
    nameTextField.setFont(new Font ("raleway",Font.BOLD,22));
  nameTextField.setBounds (300,140,400,30);
  add(nameTextField);

    
    
    
    JLabel fname = new JLabel("FATHER'S NAME:" );
    fname.setFont(new Font ("raleway",Font.BOLD,22));
    fname.setBounds(100,190,200,30);
    add(fname);
    
    fnameTextField = new JTextField();
   fnameTextField.setFont(new Font ("raleway",Font.BOLD,22));
  fnameTextField.setBounds (300,190,400,30);
  add(fnameTextField);
    
     JLabel dob = new JLabel("DATE OF BIRTH :" );
    dob.setFont(new Font ("raleway",Font.BOLD,22));
    dob.setBounds(100,240,200,30);
    add(dob);
    
    
    dateChooser = new JDateChooser();
    dateChooser.setBounds(300,240,400,30);
    dateChooser.setForeground(new Color (105,105,105));
    add(dateChooser);
    
    
    
    JLabel gender = new JLabel("GENDER:" );
   gender.setFont(new Font ("raleway",Font.BOLD,22));
  gender.setBounds(100,290,200,30);
    add(gender);
    
    male = new JRadioButton("MALE");
    male.setBounds(300,290,60,30);
    male.setForeground(Color.black);
    male.setBackground(Color.white);
    add (male);
    
    female = new JRadioButton("FEMALE");
    female.setBounds(450,290,120,30);
    female.setForeground(Color.black);
    female.setBackground(Color.white);
    add (female);
    
    ButtonGroup gendergroup = new ButtonGroup ();
    gendergroup.add(male);
    gendergroup.add(female);
    
    
    
    
     JLabel emailaddress = new JLabel("EMAIL ADDRESS:" );
   emailaddress.setFont(new Font ("raleway",Font.BOLD,22));
  emailaddress.setBounds(100,340,200,30);
    add(emailaddress);
    
    emailTextField = new JTextField();
   emailTextField.setFont(new Font ("raleway",Font.BOLD,22));
  emailTextField.setBounds (300,340,400,30);
  add(emailTextField);
  
    
    JLabel mstatus = new JLabel("MARITAL STATUS :" );
   mstatus.setFont(new Font ("raleway",Font.BOLD,22));
  mstatus.setBounds(100,390,600,30);
    add(mstatus);
    
    married = new JRadioButton("MARRIED");
    married.setBounds(350,390,100,30);
    married.setBackground(Color.white);
    add(married);
    
 unmarried = new JRadioButton("UNMARRIED");
    unmarried.setBounds(490,390,100,30);
    unmarried.setBackground(Color.white);
    add(unmarried);
    
    other = new JRadioButton("OTHERS");
    other.setBounds(630,390,100,30);
    other.setBackground(Color.white);
    add(other);
    
    ButtonGroup maritalgroup = new ButtonGroup ();
    maritalgroup.add(married);
    maritalgroup.add(unmarried);
    maritalgroup.add(other);
    
    JLabel address = new JLabel("ADDRESS:" );
   address.setFont(new Font ("raleway",Font.BOLD,22));
  address.setBounds(100,440,200,30);
    add(address);
    
    ADDRESSTextField = new JTextField();
   ADDRESSTextField.setFont(new Font ("raleway",Font.BOLD,22));
  ADDRESSTextField.setBounds (300,440,400,30);
  add(ADDRESSTextField);
    
    JLabel city = new JLabel("CITY :" );
   city.setFont(new Font ("raleway",Font.BOLD,22));
  city.setBounds(100,490,200,30);
    add(city);
    
    CITYTextField = new JTextField();
   CITYTextField.setFont(new Font ("raleway",Font.BOLD,22));
  CITYTextField.setBounds (300,490,400,30);
  add(CITYTextField);
    
    JLabel pincode = new JLabel("PIN CODE :" );
   pincode.setFont(new Font ("raleway",Font.BOLD,22));
  pincode.setBounds(100,540,200,30);
    add(pincode);
    
    pinTextField  = new JTextField();
   pinTextField.setFont(new Font ("raleway",Font.BOLD,22));
  pinTextField.setBounds (300,540,400,30);
  add(pinTextField);
    
  
  
 
    
    JLabel state = new JLabel("STATE" );
   state.setFont(new Font ("raleway",Font.BOLD,22));
  state.setBounds(100,590,200,30);
    add(state);
    
   stateTextField  = new JTextField();
   stateTextField.setFont(new Font ("raleway",Font.BOLD,22));
  stateTextField.setBounds (300,590,400,30);
  add(stateTextField);
    
    
   JButton next = new JButton("NEXT");
   next.setBackground(Color.BLACK);
   next.setForeground(Color.white);
   next.setFont(new Font("Raleway", Font.BOLD,14));
   next.setBounds(620,660,80,30);
   next.addActionListener(this);
   add(next);
   
   
   
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
 
  
  
  
    
    
    
    getContentPane().setBackground(Color.WHITE);
    setSize(1000,900);
    setLocation(350,10);
    setVisible(true);
}

 
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()){
            gender = "MALE";
}
            else if (female.isSelected()){
                    gender = "FEMALE";
                    
                    }
        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "MARRIED";
        } else if (unmarried.isSelected()){
        marital = "UNMARRIED";
    }
        else if (other.isSelected()){
            marital = "OTHER";
        }
        
         String add = ADDRESSTextField.getText();
         
         String city = CITYTextField.getText();
         String State = stateTextField.getText();
         String pin = pinTextField.getText();
         
         try{

if (name.equals("")){
JOptionPane.showMessageDialog(null,"name is required");
}else {
    conn c = new conn();
    String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+add+"','"+city+"','"+pin+"','"+State+"' )";
       c.s.executeUpdate(query);
       
       setVisible(false);
       new signupTwo(formno).setVisible(true);
       
       
}

             
         }catch (Exception e){
             System.out.println(e);
         }
         
         
}
      
        
                
        
            
            
        
        


    public static void main(String args[]) {
       new SignupOne();
    }
}
