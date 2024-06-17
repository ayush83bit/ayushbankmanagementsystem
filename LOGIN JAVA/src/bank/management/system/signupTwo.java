
package bank.management.system;

import javax.swing.*;
import java.awt.*;
//import java.util.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utkar
 */
public class signupTwo extends JFrame implements ActionListener  {
    
    JRadioButton syes , sno , eyes , eno;
    JTextField pan , aadhar;
    JComboBox religion ,category , occupation ,education , income;
    String formno;
    signupTwo(String formno){

    this.formno=formno;
    setLayout(null);
   setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
    
    
    
    JLabel additionaldetails = new JLabel("Page 2 : Additional Details" );
    additionaldetails.setFont(new Font ("raleway",Font.BOLD,22));
    additionaldetails.setBounds(290,80,400,30);
    add(additionaldetails);
    
    JLabel name = new JLabel("Religion:" );
    name.setFont(new Font ("raleway",Font.BOLD,22));
    name.setBounds(100,140,100,30);
    add(name);
   
    
   String valReligion[] = { "Hindu" , "Muslim" , "Sikh","Christian","Others" };
   religion = new JComboBox(valReligion);
   religion.setBounds(300,140,400,30);
   religion.setBackground(Color.WHITE);
   add (religion);
   

    
    
    
    JLabel fname = new JLabel("Category:" );
    fname.setFont(new Font ("raleway",Font.BOLD,22));
    fname.setBounds(100,190,200,30);
    add(fname);
    
    String valCategory[] = {"General" , "OBC", "SC" ,"ST","Other"};
    category = new JComboBox(valCategory);
    category.setBounds (300,190,400,30);
    category.setBackground(Color.WHITE);
    add(category);
    
    
 
    
     JLabel dob = new JLabel("Income:" );
    dob.setFont(new Font ("raleway",Font.BOLD,22));
    dob.setBounds(100,240,200,30);
    add(dob);
    
    String incomeCategory[] = {"Null" , "<1,50,000", "<2,50,000" ,"<5,00,000","upto 10,00,000"};
    income = new JComboBox(incomeCategory);
    income.setBounds (300,240,400,30);
    income.setBackground(Color.WHITE);
    add(income);
    
    
  
    
    
    
    JLabel gender = new JLabel("Educational" );
   gender.setFont(new Font ("raleway",Font.BOLD,22));
  gender.setBounds(100,290,200,30);
    add(gender);
    
   
    
    
    
    
     JLabel emailaddress = new JLabel("Qualification:" );
   emailaddress.setFont(new Font ("raleway",Font.BOLD,22));
  emailaddress.setBounds(100,315,200,30);
    add(emailaddress);
    
    String educationvalues[] = {"non graduation" ,"graduate", "post Graduation" ,"doctrate","Others"};
    
    education = new JComboBox(educationvalues);
    education.setBounds (300,315,400,30);
    education.setBackground(Color.WHITE);
    add(education);
  
    
    JLabel mstatus = new JLabel("Occupation:" );
   mstatus.setFont(new Font ("raleway",Font.BOLD,22));
  mstatus.setBounds(100,390,600,30);
    add(mstatus);
    
     String occupationvalues[] = {"salaried" , "Self-Employed", "Buisness" ,"Student","Retired"};
    occupation = new JComboBox(occupationvalues);
    occupation.setBounds (300,390,400,30);
    occupation.setBackground(Color.WHITE);
    add(occupation);

    
    JLabel address = new JLabel("PAN Number:" );
   address.setFont(new Font ("raleway",Font.BOLD,22));
  address.setBounds(100,440,200,30);
    add(address);
    
    pan = new JTextField();
   pan.setFont(new Font ("raleway",Font.BOLD,22));
  pan.setBounds (300,440,400,30);
  add(pan);
    
    JLabel city = new JLabel("Aadhar number:" );
   city.setFont(new Font ("raleway",Font.BOLD,22));
  city.setBounds(100,490,200,30);
    add(city);
    
    aadhar = new JTextField();
   aadhar.setFont(new Font ("raleway",Font.BOLD,22));
  aadhar.setBounds (300,490,400,30);
  add(aadhar);
    
    JLabel pincode = new JLabel("Senior Citizen:" );
   pincode.setFont(new Font ("raleway",Font.BOLD,22));
  pincode.setBounds(100,540,200,30);
    add(pincode);
     
  syes = new JRadioButton("YES");
  syes.setBounds(300,540,100,30);
  syes.setBackground(Color.white);
  add(syes);
  
  sno= new JRadioButton("NO");
  sno.setBounds(450,540,100,30);
  sno.setBackground(Color.white);
  add(sno);
  
  ButtonGroup maritalgroup = new ButtonGroup();
  maritalgroup.add(syes);
  maritalgroup.add(sno);
  
  
    
  
  
 
    
    JLabel state = new JLabel("Exisiting Account" );
   state.setFont(new Font ("raleway",Font.BOLD,22));
  state.setBounds(100,590,200,30);
    add(state);
    
     eyes = new JRadioButton("YES");
  eyes.setBounds(300,590,100,30);
  eyes.setBackground(Color.white);
  add(eyes);
  
  eno= new JRadioButton("NO");
  eno.setBounds(450,590,100,30);
  eno.setBackground(Color.white);
  add(eno);
  
  ButtonGroup emaritalgroup = new ButtonGroup();
  emaritalgroup.add(eyes);
  emaritalgroup.add(eno);
    
   
    
    
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
        
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation =(String) education.getSelectedItem();
        String soccupation=(String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()){
            seniorcitizen= "Yes";
        }
        else if (sno.isSelected()){
            seniorcitizen   = "NO";
        }
        
        String exisitingaccount = null;
        if(eyes.isSelected()){
            exisitingaccount = "YES";
        } else if (eno.isSelected()){
        exisitingaccount = "NO";
    }
        
        
         String span = pan.getText();
         
         String saadhar = aadhar.getText();
         
         

        try{ 
            conn c = new conn();
            String query = "insert into signuptwo3 values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+seniorcitizen+"','"+exisitingaccount+"','"+span+"','"+saadhar+"' )";
            c.s.executeUpdate(query);  
            setVisible(false);
            new SignupThree(formno).setVisible(true);


            
        }
        catch (Exception e) {
            System.out.println(e);
        }
    
    }
    public static void  main(String args[]) {
        new signupTwo("");
    
}
}
