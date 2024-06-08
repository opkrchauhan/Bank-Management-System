package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {
    JButton button1,button2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin =pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,1550,830);
        add(l1);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430,180,400,35);
        l1.add(label1);


        JLabel label2 = new JLabel("New PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430,220,150,25);
        l1.add(label2);



        p1 = new JPasswordField ();
        p1.setBackground (new Color (24, 173, 193));
        p1.setForeground (new Color (255, 255, 255, 255));
        p1.setBounds (600,220,200,25);
        p1.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.add (p1);

        JLabel label3 = new JLabel("Re-Enter New PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setBounds(430,250,400,25);
        l1.add(label3);

        p2 = new JPasswordField ();
        p2.setBackground (new Color (24, 173, 193));
        p2.setForeground (new Color (255, 255, 255, 255));
        p2.setBounds (600,250,200,25);
        p2.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.add (p2);



        button1 = new JButton ("CHANGE");
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


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==button1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p2.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Con c = new Con();
                String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update signupthird set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new Transaction (pin);

            } else if (e.getSource()==button2) {
                new Transaction (pin);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }



    }

    public static void main(String[] args) {
        new Pin("");
    }
}