
import javax.swing.*;

import connection.connection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Locale.Category;
import java.util.*;

public class signup2 extends JFrame implements ActionListener{
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textpan,textadhar;
    JRadioButton r1,r2,m1,m2;
    JButton next;
    String formno;
    signup2(String first){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);
        
        this.formno=formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD ,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2= new JLabel("Additional Detail");
        l2.setFont(new Font("Raleway",Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religon");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[]={" ","Hindu","Muslim","Sikh","Christian","Jain","Buddhism","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,200,76) );
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String Category[]={"","General","OBC","SC","ST"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setBackground(new Color(252,200,76) );
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String Income[]={" ","NULL","<1,50,000","<2,50,000","<8,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(Income);
        comboBox3.setBackground(new Color(252,200,76) );
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,100,30);
        add(l6);

        String Educational[]={"","Graduate","NON-Graduate","Scholing","Uneducated"};
        comboBox4 = new JComboBox(Educational);
        comboBox4.setBackground(new Color(252,200,76) );
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupational");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,100,30);
        add(l7);

        String Occupational[]={"","Deffence","Salired","Govt.Job","Self Employed","Student","Other"};
        comboBox5 = new JComboBox(Occupational);
        comboBox5.setBackground(new Color(252,200,76) );
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,100,30);
        add(l8);

        textpan = new JTextField();
        textpan.setFont(new Font("Raleway",Font.BOLD,18));
        textpan.setBackground(new Color(252,200,76) );
        textpan.setBounds(350,370,320,30);
        add(textpan);

        JLabel l9 = new JLabel("Aadhar");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,100,30);
        add(l9);

        textadhar = new JTextField();
        textadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textadhar.setBackground(new Color(252,200,76) );
        textadhar.setBounds(350,420,320,30);
        add(textadhar);

        JLabel l10 = new JLabel("Senior Citizen");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,100,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,18));
        r1.setBackground(new Color(252,200,76) );
        r1.setBounds(350,490,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,18));
        r2.setBackground(new Color(252,200,76) );
        r2.setBounds(460,490,100,30);
        add(r2);

        ButtonGroup  buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,100,30);
        add(l11);

        m1=new JRadioButton("Yes");
        m1.setFont(new Font("Raleway",Font.BOLD,18));
        m1.setBackground(new Color(252,200,76) );
        m1.setBounds(350,540,100,30);
        add(m1);

        m2=new JRadioButton("No");
        m2.setFont(new Font("Raleway",Font.BOLD,18));
        m2.setBackground(new Color(252,200,76) );
        m2.setBounds(460,540,100,30);
        add(m2);

        JLabel l12 = new JLabel("Form No. ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,60,30);
        add(l12);

    
        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,100,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);



        ButtonGroup  buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,190,76));
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = (String) textpan.getText();
        String aadhar = (String) textadhar.getText();

        String scitizen = " ";
        if ((r1.isSelected())){
            scitizen ="Yes";
        
        } else if ((r2.isSelected())){
            scitizen ="No";
        }
        try{
            if(textpan.getText().equals("")|| textadhar.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Fill all the Feilds");

            } else{
                connection con= new connection();
                String q = "Insert into Singup2 (religion, category, income, education, occupation, pan, aadhar, senior_citizen, existing_account, form_no) VALUES ('"+rel+"','"+cat+"','"+income+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','','"+formno+"')";
                // Execute the query using your database connection
                con.statement.executeUpdate(q);
                new signup3(formno);
                setVisible(false);
            }
        } catch (Exception E){
            E.printStackTrace();
        }

        
    }
    public static void main(String[] args) {
        new signup2(" ");
    }


}
