import javax.swing.*;
import java.awt.event.*;

public class artCalc implements ActionListener{

	JTextField textFieldOne, textFieldTwo, textFieldThree;
	JButton btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven;

	artCalc() {
		JFrame frameMain = new JFrame();
		textFieldOne = new JTextField();
		textFieldOne.setBounds(50, 50, 100, 20);
		textFieldTwo = new JTextField();
		textFieldTwo.setBounds(50, 100, 100, 20);
		textFieldThree = new JTextField();
		textFieldThree.setBounds(50, 150, 100, 20);
		textFieldThree.setEditable(false);

		btnOne = new JButton ("+");
		btnOne.setBounds(60, 200, 50, 50);
		btnTwo = new JButton ("-");
		btnTwo.setBounds(120, 200, 50, 50);
		btnThree = new JButton ("x");
		btnThree.setBounds(180, 200, 50, 50);
		btnFour = new JButton ("÷");
		btnFour.setBounds(240, 200, 50, 50);
		btnFive = new JButton ("AVE");
		btnFive.setBounds(300, 200, 70, 50);
		btnSix = new JButton ("CLR");
		btnSix.setBounds(360, 200, 70, 50);
		btnSeven = new JButton ("EXT");
		btnSeven.setBounds(420, 200, 70, 50);
		
		btnOne.addActionListener(this);
		btnTwo.addActionListener(this);
		btnThree.addActionListener(this);
		btnFour.addActionListener(this);
		btnFive.addActionListener(this);
		btnSix.addActionListener(this);
		btnSeven.addActionListener(this);
		
		frameMain.add(textFieldOne);
		frameMain.add(textFieldTwo);
		frameMain.add(textFieldThree);
		frameMain.add(btnOne);
		frameMain.add(btnTwo);
		frameMain.add(btnThree);
		frameMain.add(btnFour);
		frameMain.add(btnFive);
		frameMain.add(btnSix);
		frameMain.add(btnSeven);
		frameMain.setLayout(null);
		frameMain.setVisible(true);
		frameMain.setSize(1200, 500);
	}

	public void actionPerformed(ActionEvent e) {
		String inputOne = textFieldOne.getText();
		String inputTwo = textFieldTwo.getText();

		int a = Integer.parseInt(inputOne);
		int b = Integer.parseInt(inputTwo);
		int c = 0;

		if (e.getSource() == btnOne) {
			c = a + b;
		}
		else if (e.getSource() == btnTwo) {
			c = a - b;
		}
		else if (e.getSource() == btnThree) {
			c = a * b;
		}
		else if (e.getSource() == btnFour) {
			c = a / b;
		}
		else if (e.getSource() == btnFive) {
			c = (a + b) / 2;
		}
		else if (e.getSource() == btnSix) {
			textFieldTwo.setText("");
			textFieldOne.setText("");
		}
		else if (e.getSource() == btnSeven) {
			System.exit(0);
		}

		String result = String.valueOf(c);
		textFieldThree.setText(result);
	}
	
	public static void main(String []args) {
		new artCalc();
	}
}
