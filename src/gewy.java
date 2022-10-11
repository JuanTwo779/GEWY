import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class gewy implements ActionListener{

    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passlabel;
    private static JPasswordField passText;
    private static JButton button; 
    private static JLabel success;

    public static void main(String[] args) {
        
        JPanel panel = new JPanel(); //the invisible layout
        JFrame frame = new JFrame(); //the window

        frame.setSize(500, 500); //size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when close, exit program
        frame.add(panel); //adds panel to the window

        panel.setLayout(null);

        userlabel = new JLabel("Username: "); //the label, uneditable thing on panel
        userlabel.setBounds(25, 20, 80, 25);
        panel.add(userlabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passlabel = new JLabel("Password: ");
        passlabel.setBounds(25, 60, 165, 25);
        panel.add(passlabel);

        passText = new JPasswordField();
        passText.setBounds(100, 60, 165, 25);
        panel.add(passText);

        button = new JButton("Login");
        button.setBounds(25, 100, 80, 25);
        button.addActionListener((ActionListener) new gewy());
        panel.add(button);


        success = new JLabel("");
        success.setBounds(25, 140, 300, 25);
        panel.add(success);
        success.setText(null);

        frame.setVisible(true); //makes it show, given true
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String user = userText.getText();
        String password = passText.getText();
        System.out.println(user + ", " + password);

        if(user.equals("Juan") && password.equals("Hansosjsneia-09"))
        {
            success.setText("Login success");
        }
        
    }
    
}
