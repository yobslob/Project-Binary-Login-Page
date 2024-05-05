package Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;


public class loginPage implements ActionListener{

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JTextField userId = new JTextField();
    JPasswordField userPass = new JPasswordField();
    

    HashMap<String,String> loginInfo = new HashMap<String,String>();
    
    loginPage(HashMap<String,String> originalLogin){
        loginInfo = originalLogin;
    }

    @Override
    public void actionPerformed(ActonEvent e)
}
