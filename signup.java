import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

import connection.connection;


public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName ,textfName,textEmail,textadd,textcity,textpin;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    signup(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);
        
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(360,90,600,30);
        add(label2);
        
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,130,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name:");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);


        textfName = new JTextField();
        textfName.setFont(new Font("Raleway",Font.BOLD,14));
        textfName.setBounds(300,240,400,30);
        add(textfName);

        JLabel labelDOB = new JLabel("Date of Birth:");
        labelDOB.setFont(new Font("Raleway",Font.BOLD,20));
        labelDOB.setBounds(100,340,200,30);
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,290,200,30);
        add(labelG);
        
        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,225,228));
        r1.setBounds(300,290,90,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,225,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup  buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email address");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100, 390, 200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMS = new JLabel("Married Status");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1=new JRadioButton("Married");
        m1.setBounds(330,440,100,30);
        m1.setFont(new Font("Rleway",Font.BOLD,14));
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Rleway",Font.BOLD,14));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(570,440,100,30);
        m3.setFont(new Font("Rleway",Font.BOLD,14));
        add(m3);

        ButtonGroup  buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(m1);
        buttonGroup2.add(m2);
        buttonGroup2.add(m3);
        
        JLabel labeladd = new JLabel("Address:");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,490,200,30);
        add(labeladd);

        textadd = new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,490,400,30);
        add(textadd);

        JLabel labelcity = new JLabel("City:");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("PIN Code:");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setBackground(Color.WHITE);
        next.setBounds(620,710,89,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
     }
     @Override
    public void actionPerformed(ActionEvent e){
        String formno = first;
        String Name = textName.getText();
        String fName = textfName.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String martial =null;
        if(m1.isSelected()){
            martial ="Married";
        }else if(m2.isSelected()){
            martial ="Unmarried";
        }else if(m3.isSelected()){
            martial="Other";
        }
        String address = textadd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                connection con1 = new connection();
                String q = "INSERT INTO signup VALUES('" + formno + "','" + Name + "','" +
           fName + "','" + DOB + "','" + gender + "','" + email + "','" +
           martial + "','" + address + "','" + city + "','" + pincode + "')";
                con1.statement.executeUpdate(q);
                new signup2();
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
 
         


    }

    public static void main(String[] args) {
        new signup();

    }

}
