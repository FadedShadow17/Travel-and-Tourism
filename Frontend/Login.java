
package travel.management.system;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class Login extends JFrame{
    Login(){
        setSize(1600,850);
        setLocation(0,0);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JPanel p1 = new  JPanel ();
        p1.setBackground(new Color (131, 193, 233));
        p1.setBounds (0, 0, 800,850);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel (i3);
        image.setBounds(100, 220, 500, 500);
        p1.add(image);
        
        JPanel p2 = new  JPanel ();
        
//        p2.setBackground(new Color (131, 193, 233));
        p2.setBounds (800, 0, 800,850);
        p2.setLayout(null);
        add(p2);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(150, 200, 200, 25);
        lblusername.setFont(new Font ("SAN SERIF", Font.PLAIN, 30));
        p2.add(lblusername);
        
        JTextField tfusername = new JTextField();
        tfusername.setBounds(150, 240, 400, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(150, 300, 200, 25);
        lblpassword.setFont(new Font ("SAN SERIF", Font.PLAIN, 30));
        p2.add(lblpassword);
        
        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(150, 340, 400, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);
        
        JButton login = new JButton("Login");
        login.setBounds(150, 400, 100, 30);
        login.setBackground(new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(login);
        
        JButton signup = new JButton("Signup");
        signup.setBounds(450, 400, 100, 30);
        signup.setBackground(new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(signup);
        
        JButton password = new JButton("Forgot Password");
        password.setBounds(150, 450, 200, 30);
//        password.setBackground(new Color(133, 193, 233));
//        password.setForeground(Color.WHITE);
        password.setBorder(new LineBorder(new Color(133, 193, 233)));
        p2.add(password);
        
        JLabel text = new JLabel("Trouble in login................");
        text.setBounds(400, 455, 150, 20);
        text.setForeground(Color.RED);
        p2.add(text);
        
        
        
        
        
        setVisible(true);
        
    }
    
    public static void main (String [] args){
        new Login();
    }
    
}
