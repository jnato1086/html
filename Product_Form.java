package Product_Form;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Product_Form implements ActionListener 
{
    JFrame f;
    JLabel l1,l2,l3,l4;
    JButton button_save;

    public Product_Form(){

       // Save_Button
        f=new JFrame("Product Form");
        button_save=new JButton("Save");
        button_save.setBounds(250,300,95,30);
        f.add(button_save);
        button_save.addActionListener(this);
    
        // Product Name
        l1=new JLabel("Product Name: ");  
        l1.setBounds(50,50, 250,30);  
        f.add(l1);
        
        final JTextField t1 = new JTextField();
        t1.setBounds(150,50, 250,30);
        f.add(t1);
       

        // Quantity
        l2=new JLabel("Quantity: ");  
        l2.setBounds(50,100, 250,30);
        f.add(l2);
        
        final JTextField t2 = new JTextField();
        t2.setBounds(150,100, 250,30);
        f.add(t2);
      

        // Time
        l3=new JLabel("Time: ");  
        l3.setBounds(50,150, 250,30);
        f.add(l3); 

        final JTextField t3 = new JTextField();
        t3.setBounds(150,150, 250,30);
        f.add(t3);       

        // Date
        l4=new JLabel("Date: ");  
        l4.setBounds(50,200, 250,30);
        f.add(l4);
        
        final JTextField t4 = new JTextField();
        t4.setBounds(150,200, 250,30);
        f.add(t4);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,400); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_save){
            SetSave();
        } 
    }
    private void SetSave() {
        JOptionPane.showMessageDialog(f,"Successfully Save.");
    }
    public static void main(String[]args) 
    { 
        
        new Product_Form();

    }

    public void setVisible(boolean b) {
    }

}