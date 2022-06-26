package Registration_Form;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Inventory_System.Inventory_System;

public class Registration_Form implements ActionListener
{
    JFrame f;
    JTextField t1,t2,t3; 
    JLabel l1,l2,l3,l4;
    JButton button_save;
    JComboBox cb;
    String Ad= "Admin";
    String St= "Staff";
    // char option;
    // String R_name, R_user, R_pass, R_type;

    public Registration_Form(){

       // Save_Button
        f=new JFrame("Registration Form");
        button_save=new JButton("Save");
        button_save.setBounds(250,300,95,30);
        f.add(button_save);
        button_save.addActionListener(this);

        // Name
        l1=new JLabel("Name: ");  
        l1.setBounds(50,50, 250,30);  
        f.add(l1);
        
        final JTextField t1 = new JTextField();
        t1.setBounds(130,50, 250,30);
        f.add(t1);

        //Username
        l2=new JLabel("User Name: ");  
        l2.setBounds(50,100, 250,30);
        f.add(l2);
        
        final JTextField t2 = new JTextField();
        t2.setBounds(130,100, 250,30);
        f.add(t2);

        //Password
        l3=new JLabel("Password: ");  
        l3.setBounds(50,150, 250,30);
        f.add(l3); 

        final JTextField t3 = new JTextField();
        t3.setBounds(130,150, 250,30);
        f.add(t3);

        // User Type
        l4=new JLabel("User Type: ");  
        l4.setBounds(50,200, 250,30);
        f.add(l4);

        String[] options_UserType = {"Admin","Staff"};                     // Please Choose your USER_TYPE
        // JComboBox<String> 
        cb = new JComboBox<>(options_UserType);   
        cb.setBounds(130,200, 250,30);    
        f.add(cb);       

        f.setLayout(null); 
        f.setVisible(true);
        f.setSize(500,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
     
        if(e.getSource()== button_save){
            String strname = t1.getText();
            String strUsername = t2.getText();
            String strpass = t3.getText();
            // String strtype = cb.getToolTipText();
          
        if(strname.equals("Joanna") & strUsername.equals("JaNa05") & strpass.equals("0987")){
                Inventory_System in = new Inventory_System();
                in.setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(f,"Invalid !!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
        }else if(e.getSource() != button_save){
            JOptionPane.showMessageDialog(f,"Invalid !!!","Alert",JOptionPane.WARNING_MESSAGE);

        }
    }
    
    public static void main(String[]args) 
    { 
        
        new Registration_Form();

    }

    public void setVisible(boolean b) {
    }
}