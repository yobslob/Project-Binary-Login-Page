package secondProgram;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.*;

public class loginpage2 implements ActionListener{
		
		JFrame frame =new JFrame("Login Page");
		
		JButton loginButton = new JButton("Login");
		JButton resetButton = new JButton("Reset");
		
		JTextField userIdField = new JTextField();
		JPasswordField userPassField = new JPasswordField();
		
		JLabel userIdLabel = new JLabel("Username");
		JLabel userPassLabel = new JLabel("Password");
		JLabel returnLabel = new JLabel("");
		
		HashMap<String,String> logininfo = new HashMap<String,String>();
		loginpage2(HashMap<String,String> loginInfoOriginal){
			
			logininfo =loginInfoOriginal;
			
			userIdLabel.setBounds(25,40,75,30);
			userIdLabel.setFont(new Font(null,Font.BOLD,14));
			userPassLabel.setBounds(25,100,75,30);
			userPassLabel.setFont(new Font(null,Font.BOLD,14));
			
			returnLabel.setBounds(110,225,225,30);
			returnLabel.setFont(new Font(null,Font.PLAIN,14));
			
			userIdField.setBounds(120,45,170,25);
			userIdField.setFont(new Font("corbel",Font.PLAIN,12));
			userPassField.setBounds(120,105,170,25);
			userPassField.setFont(new Font("corbel",Font.PLAIN,12));
			
			loginButton.setBounds(75,180,75,25);
			loginButton.setFocusable(false);
			loginButton.addActionListener(this);
			
			resetButton.setBounds(180,180,75,25);
			resetButton.setFocusable(false);
			resetButton.addActionListener(this);
			
			frame.add(userIdLabel);
			frame.add(userPassLabel);
			frame.add(returnLabel);
			frame.add(userIdField);
			frame.add(userPassField);
			frame.add(loginButton);
			frame.add(resetButton);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(350,300);
			frame.getContentPane().setBackground(new Color(240, 248, 255));
			frame.setLayout(new BorderLayout());
			frame.setVisible(true);
			
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {

				if(e.getSource() == resetButton) {
					userIdField.setText("");
					userPassField.setText("");
					returnLabel.setText("");
				}
				
				if(e.getSource()==loginButton) {
					String userId = userIdField.getText();
					String password = String.valueOf(userPassField.getPassword());
				
					if(logininfo.containsKey(userId)) {
							if(logininfo.get(userId).equals(password)) {
								returnLabel.setForeground(Color.green);
								returnLabel.setText("Login successful");
								frame.dispose();
								new welcomePage(userId);
							}
							else {
								returnLabel.setForeground(Color.red);
								returnLabel.setText("Incorrect username/password");
							}
					}
					else {
						returnLabel.setForeground(Color.red);
						returnLabel.setText("User does not exists.");
					}
				
				}
		}
}
