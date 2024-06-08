package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceInquiry extends JFrame implements ActionListener {
    JLabel l3;
    JButton button1;

    String pin;
    BalanceInquiry(String  pin){

        this.pin = pin;
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/atm2.png"));
        Image i2 = i1.getImage ().getScaledInstance (1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);

        JLabel l1 = new JLabel (i3);
        l1.setBounds (0,0,1550,830);
        add (l1);


        JLabel l2 = new JLabel ("YOUR CURRENT BALANCE IS :");
        l2.setFont (new Font ("System",Font.BOLD,16));
        l2.setBounds (430,160,400,35);
        l2.setForeground (Color.WHITE);
        l1.add (l2);


        l3 = new JLabel ();
        l3.setFont (new Font ("System",Font.BOLD,16));
        l3.setBounds (430,200,400,35);
        l3.setForeground (Color.WHITE);
        l1.add (l3);



        button1 = new JButton ("BACK");
        button1.setBounds (700,406,150,35);
        button1.setBackground (new Color (24, 173, 193));
        button1.setForeground (Color.WHITE);
        button1.addActionListener (this);
        l1.add (button1);


        int balance = 0;
        try{
            Con c = new Con ();
            ResultSet resultSet = c.statement.executeQuery ("Select * from bank where pin = '"+pin+"' ");
            while (resultSet.next ()){
                if(resultSet.getString ("type").equals ("Deposit")){
                    balance +=Integer.parseInt (resultSet.getString ("amount"));
                }
                else{
                    balance -=Integer.parseInt (resultSet.getString ("amount"));
                }
            }
        }
        catch (Exception E){
            E.printStackTrace ();
        }

        l3.setText (""+balance);

        setLayout (null);
        setSize (1550,1080);
        setLocation (0,0);
        setVisible (true);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
         setVisible (false);
         new Transaction (pin);
    }

    public static void main ( String[] args ) {
        new BalanceInquiry ("");
    }
}
