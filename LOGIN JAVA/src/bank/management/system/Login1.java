package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
 import javax.swing.* ;
import java.awt.event.*;
import java.sql.*;

public class Login1 extends JFrame implements ActionListener {
   JButton login, CLEAR ,SIGNUP ;
   JTextField cardTextField  ;
   JPasswordField pinTextField;
    Login1(){
        setTitle("AUTOMATED TELLER MACINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/t3rasi.png"));
        Image i2 = i1.getImage().getScaledInstance(100 ,100 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Label = new JLabel(i3);
        Label.setBounds(70,10,100,100);
        add(Label);
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("osward", Font.BOLD, 38 ));
        add (text);  
        text.setBounds(200,40,400,40);
        JLabel Cardno = new JLabel("Card No:");
        Cardno.setFont(new Font("raleway", Font.BOLD, 18 ));
        add (Cardno);  
        Cardno.setBounds(120,150,350,40);
        
        
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250 ,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(cardTextField);
        
         pinTextField = new JPasswordField();
        pinTextField.setBounds(300,210,250 ,30);
        pinTextField.setFont(new Font("Arial",Font.BOLD, 14));
        add(pinTextField);
        
        login = new JButton ("Sign In");
        login.setBounds(300, 300, 100, 30);
        login.setBackground( Color.BLACK );
        login.setForeground( Color.WHITE );
        login.addActionListener(this);
        add(login);
        
        CLEAR = new JButton ("CLEAR");
        CLEAR.setBounds(430, 300, 100, 30);
        CLEAR.setBackground( Color.BLACK );
        CLEAR.setForeground( Color.WHITE );
        CLEAR.addActionListener(this);
        add(CLEAR);
        
         SIGNUP = new JButton ("SIGNUP");
        SIGNUP.setBounds(300, 350, 230, 30);
        SIGNUP.setBackground( Color.BLACK );
        SIGNUP.setForeground( Color.WHITE );
        SIGNUP.addActionListener(this);
        add(SIGNUP);
        
        
        
         JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway", Font.BOLD, 18 ));
        add (pin); 
        pin.setBounds(120,200,350,40);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setVisible(true);
        setLocation(350,200);
        
    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == CLEAR){
           cardTextField.setText(null);
           pinTextField.setText(null);
            
        } else if (ae.getSource()== login){
            conn conn = new conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = new String(pinTextField.getPassword());
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'"; 
            try{
               ResultSet rs = conn.s.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);


                    
                    
                } else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Numbe or Pin");
                }
            }catch (Exception e){
                System.out.println(e);
            }
            
           
            
        } else if (ae.getSource() == SIGNUP){
            setVisible(false);
            new SignupOne().setVisible(true);
        
    }
    }
 public static void main(String args []){
       
       new Login1();
    }

}