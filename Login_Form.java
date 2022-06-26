import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

//import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Registration_Form.Registration_Form;
import Inventory_System.Inventory_System;


public class Login_Form implements ActionListener 
{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JButton button_login, button_acc;
    ImageIcon logoName;
    JTextField user, pass;
  // JPasswordField  pass;

    Login_Form(){
        f=new JFrame("Login");

        // milk tea name
        JPanel logo_name = new JPanel(); 
        JLabel l_name =new JLabel();
        // logo_name.setBackground(Color.white);
        logoName = new ImageIcon(new ImageIcon("name.png").getImage().getScaledInstance(280, 170, Image.SCALE_DEFAULT));
        l_name.setIcon(logoName);
        logo_name.add(l_name);
        logo_name.setBounds(50,0, 350,130);
        f.add(logo_name);
    
        // Username
        l1=new JLabel("UserName: ");  
        l1.setBounds(50,130, 250,30);  
        f.add(l1);
        
        user = new JTextField();
        user.setBounds(150,130, 250,30);
        f.add(user);
       
        // password
        l2=new JLabel("Password: ");  
        l2.setBounds(50,180, 250,30);
        f.add(l2);
        
        // pass = new JPasswordField();
        pass = new JTextField();
        pass.setBounds(150,180, 250,30);
        f.add(pass);

        // Login
        button_login=new JButton("Login");
        button_login.setBounds(100,230,95,30);
        f.add(button_login);
        
        // Create Acc.
        button_acc=new JButton("Create Account");
        button_acc.setBounds(230,230,150,30);
        f.add(button_acc);

        button_login.addActionListener(this);
        button_acc.addActionListener(this);
      
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(480,350); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){    
        if(e.getSource()== button_login){
            String strUsername = user.getText();
            String strPass = pass.getText();
                if (strUsername.equals("JaNa05") & (strPass.equals("0987jana"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                }
                else if(strUsername.equals("Rico08") & (strPass.equals("9090"))){ 
                        JOptionPane.showMessageDialog(f,"Successfully Login.");
                        Inventory_System in = new Inventory_System();
                        in.setVisible(true);
                }
                else if(strUsername.equals("Rico08") & (strPass.equals("R9090"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else if(strUsername.equals("JoSHnato") & (strPass.equals("Josh54321"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else if(strUsername.equals("JoshRita") & (strPass.equals("JoshR3333"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else if(strUsername.equals("Ann") & (strPass.equals("Ann1122"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else if(strUsername.equals("MaJoy") & (strPass.equals("MJ2222"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else if(strUsername.equals("Ruzz") & (strPass.equals("R9090"))){ 
                    JOptionPane.showMessageDialog(f,"Successfully Login.");
                    Inventory_System in = new Inventory_System();
                    in.setVisible(true);
                } 
                else{
                    JOptionPane.showMessageDialog(f,"Invalid Username or Password \n PLEASE CREATE ACCOUNT!!!","Alert",JOptionPane.WARNING_MESSAGE);
                }
        }else if(e.getSource() == button_acc){
            Registration_Form register = new Registration_Form();
            register.setVisible(true);
        }
    }
    public static void main(String[]args) 
    { 
        
    new Login_Form();

    }

}