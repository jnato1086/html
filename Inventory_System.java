package Inventory_System;

import javax.swing.*;
import javax.swing.border.TitledBorder;

// import Logout.Logout;
import Product_Form.Product_Form;
import Registration_Form.Registration_Form;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inventory_System implements ActionListener{

    JFrame f; 
    JButton button_User,button_Product,button_Report,button_logOut, button_New, button_Add, b_update, b_delete, b_save, b_Print;
    JPanel p1, p2, p3;
    ImageIcon logo;
    JPanel user, product, report, out;
    JPanel Inven_System;
    
    public Inventory_System(){

        f= new JFrame("MilkTea Shop Inventory ");
        // Panel 1 
        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(0,0, 600,600);
        
        // logo
        JPanel P_logo = new JPanel(); 
        JLabel l1 =new JLabel();
        logo = new ImageIcon(new ImageIcon("logo.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
        l1.setIcon(logo);
        P_logo.add(l1);
        P_logo.setBounds(50,0, 300, 200);
        f.add(P_logo);

        // button of (USER, PRODUCTS, REPORT, LOGOUT)
        button_User=new JButton("User");                                        // USER BUTTON 
        button_User.setBounds(150,100, 90,30);
        button_User.addActionListener(this);
        button_User.getSelectedObjects();
        p1.add(button_User);

        button_Product=new JButton("Product");                                  // PRODUCT BUTTON
        button_Product.setBounds(150,200, 90,30);
        button_Product.addActionListener(this);
        p1.add(button_Product);

        button_Report =new JButton("Report");                                   // REPORT BUTTON 
        button_Report.setBounds(150,300, 90,30);
        button_Report.addActionListener(this);
        p1.add(button_Report);
    
        button_logOut=new JButton("Logout");                                     // LOGOUT BUTTON
        button_logOut.setBounds(150,400, 90,30);
        button_logOut.addActionListener(this);
        p1.add(button_logOut);

        //p1.setLayout(new BorderLayout(2,0));
        p1.setLayout(new GridLayout(4, 0, 5, 5));
        p1.setBounds(100,200, 200,300); 
        f.add(p1);

        // Panel 2
        Inven_System =new JPanel();
        Inven_System.setBackground(Color.white);
        Inven_System.setBounds(350,20, 950,550);
        f.add(Inven_System);

        // Panel3
        JPanel p3 = new JPanel();
        p3.setBackground(Color.lightGray);
        p3.setBounds(0,600, 1500, 100);

        String strname = "JOANNA MAE";
        JTextArea Jtf = new JTextArea(strname);
        Jtf.setBounds(350,800, 1000, 150);
        Jtf.setEditable(false);
        p3.add(Jtf);
        f.add(p3);

        //ActionListener
        button_User.addActionListener(this);
        button_Product.addActionListener(this);
        button_Report.addActionListener(this);
        button_logOut.addActionListener(this);


        f.setSize(1500, 980); 
        f.setLayout(null); 
        f.setVisible(true); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button_User){
            GetTable_User();
        } else if (e.getSource() == button_Product){
            GetTable_Product();
        } else if (e.getSource() == button_Report){
            GetTable_Report();
        } else if (e.getSource() == button_logOut){
            GetLogOut();
        } else if (e.getSource() == button_New){
            Registration_Form in = new Registration_Form();
            in.setVisible(true);
        } else if (e.getSource() == button_Add){
            Product_Form Pro = new Product_Form();
            Pro.setVisible(true);
        } else if (e.getSource() == b_delete){
            GetDelete();
        } else if (e.getSource() == b_update){
            GetUpdate();
        } else if (e.getSource() == b_save){
            GetSave();
        }         
    }
    private void GetSave() {
        JOptionPane.showMessageDialog(f,"Successfully Saved.");
    }
    private void GetUpdate() {
        JOptionPane.showMessageDialog(f,"Successfully Updated.");
    }
    private void GetDelete() {
        JOptionPane.showMessageDialog(f,"Successfully Deleted.");   
    }
    private void GetLogOut() {
        JOptionPane.showConfirmDialog(null, "Are you sure you want to Log out?", "Log out",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
    }
    private void GetTable_Report() {

        report =new JPanel();
        report.setBackground(Color.white);
        report.setBounds(0,600, 1500, 100);
        report.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "INVENTORY REPORT", TitledBorder.CENTER, TitledBorder.TOP));

        String[][] rep_row = {{ "Cup ", "20","30", "12:00 pm","06/08/22"}};            
        String[] rep_header = { "Product", "Qty on Hand","Qty Sold", "Time", "Date" };
        JTable rep_table = new JTable(rep_row, rep_header);
        report.add(new JScrollPane(rep_table));
    
        JTable b3 = new JTable();                                                  // TABLE
        b3.setBounds(400,50,1000,450);          
        JScrollPane sp_report=new JScrollPane(b3);
        report.add(sp_report);
        report.add(b3);

        JPanel button_panel3 = new JPanel();
        button_panel3.setLayout(new GridLayout(1, 0, 10, 10));
        button_panel3.setBounds(1200,1100,95,30); 

        b_Print = new JButton("PRINT");                             // ADD BUTTON 
        button_panel3.add(b_Print );

        report.add(button_panel3);

        Inven_System.removeAll();
        Inven_System.repaint();
        Inven_System.revalidate();

        Inven_System.add(report);
        Inven_System.repaint();
        Inven_System.revalidate();
    }
    private void GetTable_Product() {
        product =new JPanel();
        product.setBackground(Color.white);
        product.setBounds(0,600, 1500, 100);
        product.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "PRODUCT TABLE", TitledBorder.CENTER, TitledBorder.TOP));

        String[][] pro_row = {{ "Cup ", "50", "12:00 pm", "06/08/22"},{"Straw", "50", "10:00 pm", "06/12/22"}};            
        String[] pro_header = { "Product", "Quantity", "Time", "Date"  };
        JTable pro_table = new JTable(pro_row, pro_header);
        product.add(new JScrollPane(pro_table));
    
        JTable b2 = new JTable();                                                  // TABLE
        b2.setBounds(400,50,900,450);          
        JScrollPane sp_product=new JScrollPane(b2);
        product.add(sp_product);
        product.add(b2);

        JPanel button_panel2 = new JPanel();
        button_panel2.setLayout(new GridLayout(4, 0, 10, 10));
        button_panel2.setBounds(1200,1100,95,30); 

        button_Add = new JButton("ADD ");                                // ADD BUTTON 
        button_panel2.add(button_Add  );
        button_Add.addActionListener(this);

        b_delete = new JButton("DELETE");                            // DELETE BUTTON 
        button_panel2.add(b_delete);
        b_delete.addActionListener(this);

        b_update = new JButton("UPDATE");                             // UPDATE BUTTON
        button_panel2.add(b_update);
        b_update.addActionListener(this);

        b_save = new JButton("SAVE");                                  // SAVE BUTTON 
        button_panel2.add(b_save);
        b_save.addActionListener(this);

        product.add(button_panel2);

        Inven_System.removeAll();
        Inven_System.repaint();
        Inven_System.revalidate();

        Inven_System.add(product);
        Inven_System.repaint();
        Inven_System.revalidate();

        
    }
    
    private void GetTable_User() {
        user =new JPanel();
        user.setBackground(Color.white);
        user.setBounds(0,600, 1500, 100);
        user.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "USER TABLE", TitledBorder.CENTER, TitledBorder.TOP));
           
        String[][] user_row = {{ "Joanna Mae ", "JaNa05", "jana12345","Admin"},
            {"Joshua", "JoSHnato","Josh54321","Admin"},
            {"Josh","JoshRita","JoshR3333","User"},
            {"Mary Joy", "MaJoy", "MJ2222", "User"},
            {"Rico", "Rico", "R9090", "Admin"},
            {"Mary Ann", "Ann", "Ann1122", "User"},
            {"Ruzzel", "Ruzz", " Ruzz2211", "Admin"}};      
        String[] header = { "Name", "Username", "Password", "User Type" };
        JTable table = new JTable(user_row, header);
        user.add(new JScrollPane(table));

        JTable b1 = new JTable();                                                  // TABLE
        b1.setBounds(400,50,1000,600);          
        JScrollPane sp_user=new JScrollPane(b1);
        user.add(sp_user);
        user.add(b1);

        JPanel button_panel = new JPanel();
        button_panel.setLayout(new GridLayout(4, 0, 10, 10));
        button_panel.setBounds(1200,1100,95,30); 

        button_New = new JButton("NEW ");                             // NEW BUTTON
        button_panel.add(button_New);
        button_New.addActionListener(this);

        b_delete = new JButton("DELETE");                            // DELETE BUTTON 
        button_panel.add(b_delete);
        b_delete.addActionListener(this);

        b_update = new JButton("UPDATE");                             // UPDATE BUTTON
        button_panel.add(b_update);
        b_update.addActionListener(this);

        b_save = new JButton("SAVE");                                  // SAVE BUTTON 
        button_panel.add(b_save);
        b_save.addActionListener(this);

        user.add(button_panel);
        
        Inven_System.removeAll();
        Inven_System.repaint();
        Inven_System.revalidate();

        Inven_System.add(user);
        Inven_System.repaint();
        Inven_System.revalidate();
    }
    public static void main(String [] args) {
        new Inventory_System();
        
    }
    public void setVisible(boolean b) {
    }
}
