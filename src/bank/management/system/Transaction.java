package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {
    String pin;

    JButton button1, button2,button3,button4,button5,button6,button7;
    Transaction(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/atm2.png"));
        Image i2 = i1.getImage ().getScaledInstance (1550,800,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);

        JLabel l1 = new JLabel (i3);
        l1.setBounds (0,0,1550,830);
        add (l1);


        JLabel l2 = new JLabel ("Please Select Your Transaction");
        l2.setBounds (430,180,700,35);
        l2.setForeground (Color.WHITE);
        l2.setFont (new Font ("System",Font.BOLD,28));
        l1.add (l2);

        button1 = new JButton ("DEPOSIT");
        button1.setForeground (Color.WHITE);
        button1.setBackground (new Color (65,125,128));
        button1.setBounds (410,274,150,35);
        button1.addActionListener (this);
        l1.add (button1);

        button2 = new JButton ("CASH WITHDRAWAL");
        button2.setForeground (Color.WHITE);
        button2.setBackground (new Color (65,125,128));
        button2.setBounds (700,274,150,35);
        button2.addActionListener (this);
        l1.add (button2);

        button3 = new JButton ("FAST CASH");
        button3.setForeground (Color.WHITE);
        button3.setBackground (new Color (65,125,128));
        button3.setBounds (410,320,150,35);
        button3.addActionListener (this);
        l1.add (button3);

        button4 = new JButton ("MINI STATEMENT");
        button4.setForeground (Color.WHITE);
        button4.setBackground (new Color (65,125,128));
        button4.setBounds (700,320,150,35);
        button4.addActionListener (this);
        l1.add (button4);

        button5 = new JButton ("PIN CHANGE");
        button5.setForeground (Color.WHITE);
        button5.setBackground (new Color (65,125,128));
        button5.setBounds (410,365,150,35);
        button5.addActionListener (this);
        l1.add (button5);

        button6 = new JButton ("BALANCE INQUIRY");
        button6.setForeground (Color.WHITE);
        button6.setBackground (new Color (65,125,128));
        button6.setBounds (700,365,150,35);
        button6.addActionListener (this);
        l1.add (button6);

        button7 = new JButton ("EXIT");
        button7.setForeground (Color.WHITE);
        button7.setBackground (new Color (65,125,128));
        button7.setBounds (700,410,150,35);
        button7.addActionListener (this);
        l1.add (button7);


        setLayout (null);
        setSize(1550,1080);
        setLocation (0,0);
        setVisible (true);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
        if(e.getSource ()==button1){
            new Deposit (pin);
            setVisible (false);
        } else if (e.getSource ()==button7) {
            System.exit (0);
        } else if (e.getSource ()==button2) {
            new Withdrawal (pin);
            setVisible (false);
        }
        else if(e.getSource ()==button6){
            new BalanceInquiry (pin);
            setVisible (false);
        } else if (e.getSource ()==button3) {
            new FastCash (pin);
        }
        else if(e.getSource ()==button5){
            new Pin(pin);
            setVisible (false);
        }

        else if (e.getSource ()==button4){
            new MiniStatement (pin);
            setVisible (false);
        }

    }

    public static void main ( String[] args ) {
        new Transaction ("");
    }
}
