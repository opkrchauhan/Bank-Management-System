package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField;

    JButton button1,button2;
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/atm2.png"));
        Image i2 = i1.getImage ().getScaledInstance (1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);

        JLabel l1 = new JLabel (i3);
        l1.setBounds (0,0,1550,830);
        add (l1);


        JLabel l2 = new JLabel ("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l2.setFont (new Font ("System",Font.BOLD,16));
        l2.setBounds (460,180,400,35);
        l2.setForeground (Color.WHITE);
        l1.add (l2);

        textField = new JTextField ();
        textField.setBackground (new Color (24, 173, 193));
        textField.setForeground (new Color (255, 255, 255, 255));
        textField.setBounds (460,230,320,35);
        textField.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.add (textField);

        button1 = new JButton ("DEPOSIT");
        button1.setBounds (700,350,150,35);
        button1.setBackground (new Color (24, 173, 193));
        button1.setForeground (Color.WHITE);
        button1.addActionListener (this);
        l1.add (button1);


        button2 = new JButton ("BACK");
        button2.setBounds (700,395,150,35);
        button2.setBackground (new Color (24, 173, 193));
        button2.setForeground (Color.WHITE);
        button2.addActionListener (this);
        l1.add (button2);

        setLayout (null);
        setSize (1550,1080);
        setLocation (0,0);
        setVisible (true);

    }

    @Override
    public void actionPerformed ( ActionEvent e ) {

        try {
            String amount = textField.getText ();
            Date date = new Date ();
            if (e.getSource ()==button1){
                if(textField.getText ().equals ("")){
                    JOptionPane.showMessageDialog (null,"Please Enter the amount you want deposit");
                }
                else {
                    Con c3 = new Con ();
                    String query = "insert into bank values ('"+pin+"','"+date+"','Deposit','"+amount+"')";
                    c3.statement.executeUpdate (query);
                    JOptionPane.showMessageDialog (null, "Rs. "+amount+" Deposit Successfully");
                    setVisible (false);
                    new Transaction (pin);
                }
            }

            else if(e.getSource ()==button2){
                setVisible (false);
                new Transaction (pin);

            }
        }
        catch (Exception E){
            E.printStackTrace ();
        }
    }

    public static void main ( String[] args ) {
        new Deposit ("");
    }
}
