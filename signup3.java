import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import connection.connection;

public class signup3 extends JFrame implements ActionListener
{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton s,c;
    String formno;

    JLabel l6,l9,l13;

    signup3(String formno){

        this.formno = formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,49,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,150,30);
        add(r1);

        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,250,30);
        add(r2);

        r3 = new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,260,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,350,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("Your 16-digit:");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        l6 = new JLabel("XXXX-XXXX-XXXX-XXXX");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,300,300,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque book and statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,450,200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to my best knowledge");
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBounds(100,650,700,30);
        add(c7);

        JLabel l12 = new JLabel("Form No.");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,70,30);
        add(l12);

        l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(770,10,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(400,700,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(520,700,100,30);
        c.addActionListener(this);
        add(c);

        getContentPane().setBackground(new Color(215,252,252));

        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String atype = null;

        if(r1.isSelected()){
            atype = "Saving Account";

        }else if(r2.isSelected()){
            atype = "Current Account";

        }else if(r3.isSelected()){
            atype = "Fixed Deposit Account";

        }else if(r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        if(e.getSource() == s){

            if(atype == null){

                JOptionPane.showMessageDialog(null,"Select Account Type");
                return;
            }

            if(!c7.isSelected()){

                JOptionPane.showMessageDialog(null,"Please accept the declaration");
                return;
            }

            Random ran = new Random();

            long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
            String cardno = "" + Math.abs(first7);

            long first3 = (ran.nextLong() % 9000L) + 1000L;
            String pin = "" + Math.abs(first3);

            l6.setText(cardno);
            l9.setText(pin);

            String fac = "";

            if(c1.isSelected()){
                fac = "ATM CARD";
            }

            if(c2.isSelected()){

                if(!fac.equals("")){
                    fac = fac + ", ";
                }

                fac = fac + "Internet Banking";
            }

            if(c3.isSelected()){

                if(!fac.equals("")){
                    fac = fac + ", ";
                }

                fac = fac + "Mobile Banking";
            }

            if(c4.isSelected()){

                if(!fac.equals("")){
                    fac = fac + ", ";
                }

                fac = fac + "EMAIL Alerts";
            }

            if(c5.isSelected()){

                if(!fac.equals("")){
                    fac = fac + ", ";
                }

                fac = fac + "Cheque Book";
            }

            if(c6.isSelected()){

                if(!fac.equals("")){
                    fac = fac + ", ";
                }

                fac = fac + "E-Statement";
            }

            try{

                connection c1 = new connection();

                String q1 = "INSERT INTO signup3 (form_no, account_type, card_number, pin, facility) VALUES ('"
                        + formno + "','"
                        + atype + "','"
                        + cardno + "','"
                        + pin + "','"
                        + fac + "')";

                String q2 = "INSERT INTO login (form_no, card_number, pin) VALUES ('"
                        + formno + "','"
                        + cardno + "','"
                        + pin + "')";

                c1.statement.executeUpdate(q1);
                c1.statement.executeUpdate(q2);

                JOptionPane.showMessageDialog(
                        null,
                        "Card Number: " + cardno + "\nPIN: " + pin
                );

                setVisible(false);

            }catch(Exception E){

                E.printStackTrace();

                JOptionPane.showMessageDialog(
                        null,
                        "Database Error: " + E.getMessage()
                );
            }

        }else if(e.getSource() == c){

            System.exit(0);
        }
    }

    public static void main(String[] args){

        new signup3("123456");
    }
}