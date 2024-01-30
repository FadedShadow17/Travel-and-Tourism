
package travel.management.system;
import javax.swing.*;
import java.awt.*; 
import javax.swing.border.LineBorder;


public class Signup extends JFrame {
    
    Signup() {
        setBounds (350, 200, 900, 330);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image  = new JLabel (i3);
        image.setBounds(970, 200, 500, 500);
        add(image);
        
        JPanel p1 = new  JPanel ();
        p1.setBackground(new Color (131, 193, 233));
        p1.setBounds (0, 0, 800,850);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(150, 200, 200, 25);
        lblusername.setFont(new Font ("TOHAMA", Font.BOLD, 20));
        p1.add(lblusername);
        
        JTextField tfusername = new JTextField();
        tfusername.setBounds(400, 200, 270, 30);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(150, 280, 200, 25);
        lblname.setFont(new Font ("TOHAMA", Font.BOLD, 20));
        p1.add(lblname);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(400, 280, 270, 30);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
        JLabel lblpassword = new JLabel("Password ");
        lblpassword.setBounds(150, 360, 200, 25);
        lblpassword.setFont(new Font ("TOHAMA", Font.BOLD, 20));
        p1.add(lblpassword);
        
        JTextField tfpassword = new JTextField();
        tfpassword.setBounds(400, 360, 270, 30);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
        JLabel lblsecurity = new JLabel("Security Question");
        lblsecurity.setBounds(150, 440, 200, 25);
        lblsecurity.setFont(new Font ("TOHAMA", Font.BOLD, 20));
        p1.add(lblsecurity);
        
        
        Choice security = new Choice();
        security.add("Fav Characeter From the boys");
        security.add("Fav Marvel Superhero");
        security.add("Your Lucky Number");
        security.add("Your Child Superhero");
        security.setBounds(400, 440, 270, 30);
        p1.add(security);
        
        
        JLabel lblanswer = new JLabel("Answer ");
        lblanswer.setBounds(150, 520, 200, 25);
        lblanswer.setFont(new Font ("TOHAMA", Font.BOLD, 20));
        p1.add(lblanswer);
        
        JTextField tfanswer = new JTextField();
        tfanswer.setBounds(400, 520, 270, 30);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);
        
        
        JButton create = new JButton("Create");
        create.setBounds(150, 600, 100, 30);
//        create.setBackground(new Color(133, 193, 233));
//        create.setForeground(Color.WHITE);
        create.setBorder(new LineBorder(new Color(133, 193, 233)));
        p1.add(create);
        
        JButton back = new JButton("Back");
        back.setBounds(578, 600, 100, 30);
        back.setBorder(new LineBorder(new Color(133, 193, 233)));
        p1.add(back);
        
        setVisible(true);
       
        
        
    }
    
    public static void main (String [] args){
        new Signup();
    }
    
}
