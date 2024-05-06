package secondProgram;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class welcomePage {
	
		JFrame frame = new JFrame();
		JLabel welcomeLabel = new JLabel("Welcome to Instagram!");
		
		welcomePage(String userId){
			
			welcomeLabel.setBounds(0,0,200,30);
			welcomeLabel.setFont(new Font(null,Font.PLAIN,16));
			welcomeLabel.setText("Hello "+userId);
			frame.add(welcomeLabel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(400,400);
			frame.setLayout(null);
			frame.setVisible(true);
		}
		
}
