package roamease;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener{
    
    About(){
       setBounds(600, 200, 500, 550);
       setLayout(null);
       getContentPane().setBackground(Color.WHITE);
       
       JLabel l1=new JLabel("ABOUT");
       l1.setBounds(200, 10, 100, 40);
       l1.setForeground(Color.RED);
       l1.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l1);
       
       String s= "ROAMEASE is a comprehensive hotel management software solution designed to streamline and optimize various operations within a hotel environment. \n"+
                  " \n" +
                 "Developed using the Java programming language and leveraging the NetBeans IDE, this project offers a user-friendly interface and robust functionalities to cater to the diverse needs of hotel management.3 \n"+
                  " \n" +
                  "Some of its key features are Customer Management,Rooms Information and Booking,Checkout Functionality and Customization and Scalability.\n";
                   
                         
       TextArea area = new TextArea(s,10, 40, Scrollbar.VERTICAL);
       area.setEditable(false);
       area.setBounds(20, 100, 450, 300);
       add(area);
       
        JButton back = new JButton("Back");
        back.setBounds(200, 420,100, 25);
        back.addActionListener(this);
        add(back);
       
       setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[]args){
        new About();
    }
}
