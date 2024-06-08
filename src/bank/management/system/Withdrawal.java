package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {

    JTextField textField;
    JButton button1,button2;
    String pin;
    Withdrawal(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/atm2.png"));
        Image i2 = i1.getImage ().getScaledInstance (1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);

        JLabel l1 = new JLabel (i3);
        l1.setBounds (0,0,1550,830);
        add (l1);


        JLabel l2 = new JLabel ("MAXIMUM WITHDRAWAL IS Rs. 10,000");
        l2.setFont (new Font ("System",Font.BOLD,16));
        l2.setBounds (460,160,400,35);
        l2.setForeground (Color.WHITE);
        l1.add (l2);


        JLabel l3 = new JLabel ("PLEASE ENTER YOUR AMOUNT");
        l3.setFont (new Font ("System",Font.BOLD,16));
        l3.setBounds (460,200,400,35);
        l3.setForeground (Color.WHITE);
        l1.add (l3);



        textField = new JTextField ();
        textField.setBackground (new Color (24, 173, 193));
        textField.setForeground (new Color (255, 255, 255, 255));
        textField.setBounds (460,240,320,35);
        textField.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.add (textField);

        button1 = new JButton ("WITHDRAWAL");
        button1.setBounds (700,360,150,35);
        button1.setBackground (new Color (24, 173, 193));
        button1.setForeground (Color.WHITE);
        button1.addActionListener (this);
        l1.add (button1);


        button2 = new JButton ("BACK");
        button2.setBounds (700,410,150,35);
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
        if (e.getSource ()==button1) {
            try {
                String amount = textField.getText ();
                Date date = new Date ();
                if (textField.getText ().equals ("")) {
                    JOptionPane.showMessageDialog (null, "Please Enter The Amount You Want to Withdraw ");
                } else {
                    Con c2 = new Con ();
                    ResultSet resultSet = c2.statement.executeQuery ("select * from bank where pin = '" + pin + "' ");
                    int balance = 0;
                    while (resultSet.next ()) {
                        if (resultSet.getString ("type").equals ("Deposit")) {
                            balance += Integer.parseInt (resultSet.getString ("amount"));
                        } else {
                            balance -= Integer.parseInt (resultSet.getString ("amount"));
                        }
                    }
                    if (balance < Integer.parseInt (amount)) {
                        JOptionPane.showMessageDialog (null, "Insufficient Balance");
                        return;
                    }

                    c2.statement.executeUpdate ("insert into bank values ('" +pin+ "','"+date+"',  'Withdrawal','"+amount+"')");
                    JOptionPane.showMessageDialog (null, "Rs." + amount + " Debited Successfully");
                    setVisible (false);
                    new Transaction (pin);
                }
            } catch (Exception E) {

            }

        } else if (e.getSource ()==button2) {
            setVisible (true);
            new Transaction (pin);
        }
    }

    public static void main ( String[] args ) {
        new Withdrawal ("");
    }
}
