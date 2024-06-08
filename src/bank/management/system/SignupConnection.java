package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;

public class SignupConnection  extends JFrame implements ActionListener {

    String formNo;
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAdhar;
    JRadioButton button1, button2,button3,button4;
    JButton nextButton;
    SignupConnection(String formNo){

        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource ("icon/bank.png"));
        Image i2 = i1.getImage ().getScaledInstance (100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon (i2);
        JLabel image = new JLabel (i3);
        image.setBounds (150,5,100,100);
        add(image);

        this.formNo = formNo;

        JLabel l1 = new JLabel ("Page 2:-");
        l1.setFont (new Font ("Raleway",Font.BOLD,22));
        l1.setBounds (300,30,600,40);
        add (l1);

        JLabel l2 = new JLabel ("Additional Details");
        l2.setFont (new Font ("Raleway",Font.BOLD,22));
        l2.setBounds (300,60,600,40);
        add (l2);


        JLabel l3 = new JLabel ("Religion :");
        l3.setFont (new Font ("Raleway",Font.BOLD,18));
        l3.setBounds (100,120,600,40);
        add (l3);

        String religion[]={"Hindu","Muslim","Sikh","Christan","Buddha","Jain","Parsi","Other"};
        comboBox = new JComboBox (religion);
        comboBox.setBackground (new Color (252,208,76));
        comboBox.setFont (new Font ("Raleway",Font.BOLD,14));
        comboBox.setBounds (350,120,320,30);
        add (comboBox);

        JLabel l4 = new JLabel ("Category :");
        l4.setFont (new Font ("Raleway",Font.BOLD,18));
        l4.setBounds (100,170,600,40);
        add (l4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox (category);
        comboBox2.setBackground (new Color (252,208,76));
        comboBox2.setFont (new Font ("Raleway",Font.BOLD,14));
        comboBox2.setBounds (350,170,320,30);
        add (comboBox2);



        JLabel l5 = new JLabel ("Income :");
        l5.setFont (new Font ("Raleway",Font.BOLD,18));
        l5.setBounds (100,220,600,40);
        add (l5);

        String income[]={"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10 Lakh","Above 10 Lakh"};
        comboBox3 = new JComboBox (income);
        comboBox3.setBackground (new Color (252,208,76));
        comboBox3.setFont (new Font ("Raleway",Font.BOLD,14));
        comboBox3.setBounds (350,220,320,30);
        add (comboBox3);


        JLabel l6 = new JLabel ("Educational :");
        l6.setFont (new Font ("Raleway",Font.BOLD,18));
        l6.setBounds (100,270,600,40);
        add (l6);

        String educational[]={"Below 10th","10th","12th","Graduate","Post-Graduate","Doctorate","Other"};
        comboBox4 = new JComboBox (educational);
        comboBox4.setBackground (new Color (252,208,76));
        comboBox4.setFont (new Font ("Raleway",Font.BOLD,14));
        comboBox4.setBounds (350,270,300,30);
        add (comboBox4);

        JLabel l7 = new JLabel ("Occupation :");
        l7.setFont (new Font ("Raleway",Font.BOLD,18));
        l7.setBounds (100,320,600,40);
        add (l7);

        String occupation[]={"Self-Employed","Salaried","Bussiness","Student","Retired","Other"};
        comboBox5 = new JComboBox (occupation);
        comboBox5.setBackground (new Color (252,208,76));
        comboBox5.setFont (new Font ("Raleway",Font.BOLD,14));
        comboBox5.setBounds (350,320,300,30);
        add (comboBox5);

        JLabel l8 = new JLabel ("PAN Number :");
        l8.setFont (new Font ("Raleway",Font.BOLD,18));
        l8.setBounds (100,380,600,40);
        add (l8);

        textPan = new JTextField ();
        textPan.setFont (new Font ("Raleway",Font.BOLD,18));
        textPan.setBounds (350,380,320,30);
        add (textPan);

        JLabel l9 = new JLabel ("Adhar Number :");
        l9.setFont (new Font ("Raleway",Font.BOLD,18));
        l9.setBounds (100,440,600,40);
        add (l9);

        textAdhar = new JTextField ();
        textAdhar.setFont (new Font ("Raleway",Font.BOLD,18));
        textAdhar.setBounds (350,440,320,30);
        add (textAdhar);


        JLabel l10 = new JLabel ("Senior Citizen : ");
        l10.setFont (new Font ("Raleway",Font.BOLD,18));
        l10.setBounds (100,500,600,40);
        add (l10);

        button1 = new JRadioButton ("Yes");
        button1.setBackground (new Color (252,208,76));
        button1.setFont (new Font ("Raleway",Font.BOLD,14));
        button1.setBounds (350,500,150,40);
        add (button1);

        button2 = new JRadioButton ("No");
        button2.setBackground (new Color (252,208,76));
        button2.setFont (new Font ("Raleway",Font.BOLD,14));
        button2.setBounds (500,500,150,40);
        add (button2);

        ButtonGroup buttonGroup = new ButtonGroup ();
        buttonGroup.add (button1);
        buttonGroup.add (button2);

        JLabel l11 = new JLabel ("Existing Account : ");
        l11.setFont (new Font ("Raleway",Font.BOLD,18));
        l11.setBounds (100,550,300,40);
        add (l11);

       button3 = new JRadioButton ("Yes");
        button3.setBackground (new Color (252,208,76));
        button3.setFont (new Font ("Raleway",Font.BOLD,14));
        button3.setBounds (350,550,150,40);
        add (button3);

        button4 = new JRadioButton ("No");
        button4.setBackground (new Color (252,208,76));
        button4.setFont (new Font ("Raleway",Font.BOLD,14));
        button4.setBounds (500,550,150,40);
        add (button4);

        ButtonGroup buttonGroup1 = new ButtonGroup ();
        buttonGroup1.add (button3);
        buttonGroup1.add (button4);

        JLabel l12 = new JLabel ("Form No : ");
        l12.setFont (new Font ("Raleway",Font.BOLD,18));
        l12.setBounds (600,10,100,30);
        add (l12);

        JLabel l13 = new JLabel (formNo);
        l13.setFont (new Font ("Raleway",Font.BOLD,18));
        l13.setBounds (760,10,100,30);
        add (l13);

       nextButton = new JButton ("Next");
       nextButton.setFont (new Font ("Raleway",Font.BOLD,14));
       nextButton.setBackground ( new Color (0,0,0));
       nextButton.setForeground (Color.WHITE);
       nextButton.setBounds (570,640,150,40);
       nextButton.addActionListener (this);
       add (nextButton);


        setLayout (null);
        setSize (850,750);
        setLocation (450,80);
        getContentPane ().setBackground (new Color (252,208,76));
        setVisible (true);
    }

    @Override
    public void actionPerformed ( ActionEvent e ) {
          String rel = (String)comboBox.getSelectedItem ();
          String cat = (String) comboBox2.getSelectedItem ();
          String inc = (String) comboBox3.getSelectedItem ();
          String educt = (String) comboBox4.getSelectedItem ();
          String occup = (String) comboBox5.getSelectedItem ();
          String  pan = textPan.getText ();
          String adhar = textAdhar.getText ();

          String scitizen = "";
          if(button1.isSelected ()){
              scitizen="Yes";
          } else if (button2.isSelected ()) {
              scitizen = "No";
          }

        String eaccount = "";
        if(button3.isSelected ()){
            eaccount="Yes";
        } else if (button4.isSelected ()) {
            eaccount = "No";
        }

        try{
            if(textPan.getText ().equals ("") || textAdhar.getText ().equals ("")){
                JOptionPane.showMessageDialog (null,"Fill all the fields");
            }else{
                Con c1 = new Con ();
                String query = "insert into signconnection values('"+formNo+"', '"+rel+"','"+cat+"', '"+inc+"', '"+educt+"','"+occup+"','"+pan+"','"+adhar+"','"+scitizen+"','"+eaccount+"')";
                c1.statement.executeUpdate (query);
                new SignupThird (formNo);
                setVisible (false);
            }
        }

        catch (Exception E){
            E.printStackTrace ();
        }


    }
    public static void main ( String[] args ) {
        new SignupConnection ("");
    }


}
