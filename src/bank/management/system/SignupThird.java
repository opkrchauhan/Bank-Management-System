package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThird extends JFrame implements ActionListener {

    JRadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    JTextField textCard;
    JCheckBox checkBox1, checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    JButton button,cancelButton;
    String formNo;
    SignupThird(String formNo){

        this.formNo = formNo;
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/bank.png"));
        Image i2 = i1.getImage ().getScaledInstance (100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel image = new JLabel (i3);
        image.setBounds (150,5,100,100);
        add(image);

        JLabel l1 = new JLabel ("Account Details :");
        l1.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.setBounds (280,40,400,40);
        add (l1);

        JLabel l2 = new JLabel ("Page 3 :");
        l2.setFont (new Font ("Raleway",Font.BOLD,22));
        l2.setBounds (280,70,400,40);
        add (l2);

        JLabel l3 = new JLabel ("Account Type :");
        l3.setFont (new Font ("Raleway",Font.BOLD,18));
        l3.setBounds (100,140,200,30);
        add (l3);

        radioButton1 = new JRadioButton ("Saving Account");
        radioButton1.setBounds (100,180,150,30);
        radioButton1.setFont (new Font ("Raleway",Font.BOLD,16));
        radioButton1.setBackground (new Color (215,252,252));
        add (radioButton1);

        radioButton2 = new JRadioButton ("Fixed Deposit Account");
        radioButton2.setBounds (350,180,300,30);
        radioButton2.setFont (new Font ("Raleway",Font.BOLD,16));
        radioButton2.setBackground (new Color (215,252,252));
        add (radioButton2);

        radioButton3 = new JRadioButton ("Current Account");
        radioButton3.setBounds (100,220,250,30);
        radioButton3.setFont (new Font ("Raleway",Font.BOLD,16));
        radioButton3.setBackground (new Color (215,252,252));
        add (radioButton3);

        radioButton4 = new JRadioButton ("Recurring Deposit Account");
        radioButton4.setBounds (350,220,350,30);
        radioButton4.setFont (new Font ("Raleway",Font.BOLD,16));
        radioButton4.setBackground (new Color (215,252,252));
        add (radioButton4);

        ButtonGroup buttonGroup = new ButtonGroup ();
        buttonGroup.add (radioButton1);
        buttonGroup.add (radioButton2);
        buttonGroup.add (radioButton3);
        buttonGroup.add (radioButton4);


        JLabel l4 = new JLabel ("Card Number : ");
        l4.setBounds (100,280, 200,30);
        l4.setFont (new Font ("Raleway",Font.BOLD,22));
        add (l4);


        JLabel l5 = new JLabel ("(Your 16 - Digit Card Number)");
        l5.setBounds (100,320, 200,20);
        l5.setFont (new Font ("Raleway",Font.BOLD,12));
        add (l5);

        JLabel l6 = new JLabel ("XXXX-XXXX-XXXX-5607");
        l6.setBounds (300,280, 300,30);
        l6.setFont (new Font ("Raleway",Font.BOLD,22));
        add (l6);

        JLabel l7 = new JLabel ("(It would be appears on the card / Cheque Book and Statements)");
        l7.setBounds (300,320, 500,20);
        l7.setFont (new Font ("Raleway",Font.BOLD,12));
        add (l7);

        JLabel l8 = new JLabel ("PIN : ");
        l8.setBounds (100,370, 200,30);
        l8.setFont (new Font ("Raleway",Font.BOLD,22));
        add (l8);

        JLabel l9 = new JLabel ("XXXX");
        l9.setBounds (300,370, 200,30);
        l9.setFont (new Font ("Raleway",Font.BOLD,22));
        add (l9);


        JLabel l10 = new JLabel ("(4-digit password)");
        l10.setBounds (100,400, 200,20);
        l10.setFont (new Font ("Raleway",Font.BOLD,12));
        add (l10);

        JLabel l11 = new JLabel ("Services Required : ");
        l11.setBounds (100,430, 300,30);
        l11.setFont (new Font ("Raleway",Font.BOLD,22));
        add (l11);

        checkBox1 = new JCheckBox ("ATM Card");
        checkBox1.setBackground (new Color (215,252,252));
        checkBox1.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox1.setBounds (100,480,200,30);
        add (checkBox1);

        checkBox2 = new JCheckBox ("Check Book");
        checkBox2.setBackground (new Color (215,252,252));
        checkBox2.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox2.setBounds (350,480,200,30);
        add (checkBox2);

        checkBox3 = new JCheckBox ("Internet Banking");
        checkBox3.setBackground (new Color (215,252,252));
        checkBox3.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox3.setBounds (100,530,200,30);
        add (checkBox3);

        checkBox4 = new JCheckBox ("Mobile Banking");
        checkBox4.setBackground (new Color (215,252,252));
        checkBox4.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox4.setBounds (350,530,200,30);
        add (checkBox4);


        checkBox5 = new JCheckBox ("Email Alerts");
        checkBox5.setBackground (new Color (215,252,252));
        checkBox5.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox5.setBounds (100,580,200,30);
        add (checkBox5);


        checkBox6 = new JCheckBox ("E-Statements");
        checkBox6.setBackground (new Color (215,252,252));
        checkBox6.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox6.setBounds (350,580,200,30);
        add (checkBox6);

        Checkbox checkBox7 = new Checkbox ("I here by declare that the above entered details are correct to the best of my knowledge.");
        checkBox7.setBackground (new Color (215,252,252));
        checkBox7.setFont (new Font ("Raleway",Font.BOLD,16));
        checkBox7.setBounds (100,630,800,20);
        add (checkBox7);


        JLabel l12 = new JLabel ("Form No : ");
        l12.setFont (new Font ("Raleway",Font.BOLD,14));
        l12.setBounds (700,10,100,30);
        add (l12);

        JLabel l13 = new JLabel (formNo);
        l13.setFont (new Font ("Raleway",Font.BOLD,14));
        l13.setBounds (760,10,100,30);
        add (l13);

       button = new JButton ("Submit");
       button.setForeground (Color.WHITE);
       button.setBackground (Color.BLACK);
       button.setFont (new Font ("Raleway",Font.BOLD,16));
       button.setBounds (220,670,100,30);
       button.addActionListener (this);
       add (button);


        cancelButton  = new JButton ("Cancel");
        cancelButton.setForeground (Color.WHITE);
        cancelButton.setBackground (Color.BLACK);
        cancelButton.setFont (new Font ("Raleway",Font.BOLD,16));
        cancelButton.setBounds (450,670,100,30);
        cancelButton.addActionListener (this);
        add (cancelButton);




        setLayout (null);
        setSize (850,800);
        setLocation (450,80);
        getContentPane ().setBackground (new Color (215,252,252));
        setVisible (true);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
          String atype =null;
          if(radioButton1.isSelected ()){
              atype="Saving Account";
          } else if (radioButton2.isSelected ()) {
              atype="Fixed Deposit Account";
          }
          else if(radioButton3.isSelected ()){
              atype="Current Account";
          }
          else if(radioButton4.isSelected ()){
              atype="Recurring Deposit Account";
          }

        Random ran = new Random ();
        long first7 = (ran.nextLong () % 90000000L)+1409963000000000L;
        String cardno = ""+Math.abs (first7);

        long first3 = (ran.nextLong() % 9000L)+1000L;
        String pin = ""+Math.abs(first3);

        String fac = "";
        if(checkBox1.isSelected ()){
            fac = fac + "ATM Card";
        }
        else if(checkBox2.isSelected ()){
            fac = fac + "Check Book";
        }
        else if(checkBox3.isSelected ()){
            fac = fac + "Internet Banking";
        }
        else if(checkBox4.isSelected ()){
            fac = fac + "Mobile Banking";
        }

        else if(checkBox5.isSelected ()){
            fac = fac + "Email Alerts";
        }
        else if(checkBox6.isSelected ()){
            fac = fac + "E-Statements";
        }

        try{
                if(e.getSource ()==button){
                    if(atype.equals ("")){
                        JOptionPane.showMessageDialog (null,"Fill all the fields");
                    }
                    else{
                        Con c2 = new Con ();
                        String query= "insert into signupthird values('"+formNo+"','"+atype+"', '"+cardno+"','"+pin+"','"+fac+"')";
                        String query2 = "insert into login values ('"+formNo+"','"+cardno+"','"+pin+"')";
                        c2.statement.executeUpdate (query);
                        c2.statement.executeUpdate (query2);
                        JOptionPane.showMessageDialog (null,"Card Number : "+cardno+"\n Pin : "+pin);
                        new Deposit (pin);
                        setVisible (false);
                    }
                }
                else if(e.getSource ()==cancelButton){
                    System.exit (0);
                }

        }
        catch (Exception E){
            E.printStackTrace ();
        }

    }
    public static void main ( String[] args ) {
        new SignupThird ("");
    }

}
