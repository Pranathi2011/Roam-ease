package roamease;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
    
    String username;
    JButton addpersonalDetails,viewpersonalDetails,updatepersonalDetails,checkpackages,bookpackage,viewpackage;
    JButton viewhotels,destinations,bookhotel,viewbookedhotel,payments,notepad,Calculator,about,deletepersonalDetails;
    Dashboard(String username){
        this.username = username;
        setBounds(0, 0, 1600, 1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1= new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0, 0,1600, 65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading = new JLabel("Dashboard");
        heading.setBounds(80,10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD, 30));
        p1.add(heading);
        
        JPanel p2= new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 0, 102));
        p2.setBounds(0, 65,300, 900);
        add(p2);
        
        addpersonalDetails = new JButton("Add Personal Details");
        addpersonalDetails.setBounds(0, 0, 300, 50);
        addpersonalDetails.setBackground(new Color(0, 0, 102));
        addpersonalDetails.setForeground(Color.WHITE);
        addpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        addpersonalDetails.setMargin(new Insets(0, 0,0, 60));
        addpersonalDetails.addActionListener(this);
        p2.add(addpersonalDetails);
        
        updatepersonalDetails = new JButton("Update Personal Details");
        updatepersonalDetails.setBounds(0, 40, 300, 50);
        updatepersonalDetails.setBackground(new Color(0, 0, 102));
        updatepersonalDetails.setForeground(Color.WHITE);
        updatepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        updatepersonalDetails.setMargin(new Insets(0, 0,0, 30));
        p2.add(updatepersonalDetails);
        
        viewpersonalDetails = new JButton("View Details");
        viewpersonalDetails.setBounds(0, 80, 300, 50);
        viewpersonalDetails.setBackground(new Color(0, 0, 102));
        viewpersonalDetails.setForeground(Color.WHITE);
        viewpersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewpersonalDetails.setMargin(new Insets(0, 0,0, 130));
        viewpersonalDetails.addActionListener(this);
        p2.add(viewpersonalDetails);
        
        deletepersonalDetails = new JButton("Delete Personal Details");
        deletepersonalDetails.setBounds(0, 120, 300, 50);
        deletepersonalDetails.setBackground(new Color(0, 0, 102));
        deletepersonalDetails.setForeground(Color.WHITE);
        deletepersonalDetails.setFont(new Font("Tahoma",Font.PLAIN, 20));
        deletepersonalDetails.setMargin(new Insets(0, 0, 0, 40));
        deletepersonalDetails.addActionListener(this);
        p2.add(deletepersonalDetails);
        
        checkpackages = new JButton("Check Package");
        checkpackages.setBounds(0, 160, 300, 50);
        checkpackages.setBackground(new Color(0, 0, 102));
        checkpackages.setForeground(Color.WHITE);
        checkpackages.setFont(new Font("Tahoma",Font.PLAIN, 20));
        checkpackages.setMargin(new Insets(0, 0, 0, 110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);
        
        bookpackage = new JButton("Book Package");
        bookpackage.setBounds(0, 200, 300, 50);
        bookpackage.setBackground(new Color(0, 0, 102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN, 20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
        viewpackage = new JButton("View Package");
        viewpackage.setBounds(0, 240, 300, 50);
        viewpackage.setBackground(new Color(0, 0, 102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage); 
        
        viewhotels = new JButton("View Hotels");
        viewhotels.setBounds(0, 280, 300, 50);
        viewhotels.setBackground(new Color(0, 0, 102));
        viewhotels.setForeground(Color.WHITE);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewhotels.setMargin(new Insets(0, 0, 0, 130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);
        
        bookhotel = new JButton("Book Hotel");
        bookhotel.setBounds(0, 320, 300, 50);
        bookhotel.setBackground(new Color(0, 0, 102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN, 20));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
        viewbookedhotel = new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0, 360, 300, 50);
        viewbookedhotel.setBackground(new Color(0, 0, 102));
        viewbookedhotel.setForeground(Color.WHITE);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN, 20));
        viewbookedhotel.setMargin(new Insets(0, 0, 0, 70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);
        
        destinations = new JButton("Destinations");
        destinations.setBounds(0, 400, 300, 50);
        destinations.setBackground(new Color(0, 0, 102));
        destinations.setForeground(Color.WHITE);
        destinations.setFont(new Font("Tahoma",Font.PLAIN, 20));
        destinations.setMargin(new Insets(0, 0, 0, 125));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 440, 300, 50);
        payments.setBackground(new Color(0, 0, 102));
        payments.setForeground(Color.WHITE);
        payments.setFont(new Font("Tahoma",Font.PLAIN, 20));
        payments.setMargin(new Insets(0, 0, 0, 155));
        payments.addActionListener(this);
        p2.add(payments);
        
        Calculator = new JButton("Calculator");
        Calculator.setBounds(0, 480, 300, 50);
        Calculator.setBackground(new Color(0, 0, 102));
        Calculator.setForeground(Color.WHITE);
        Calculator.setFont(new Font("Tahoma",Font.PLAIN, 20));
        Calculator.setMargin(new Insets(0, 0, 0, 145));
        Calculator.addActionListener(this);
        p2.add(Calculator);
        
        notepad = new JButton("Notepad");
        notepad.setBounds(0, 520, 300, 50);
        notepad.setBackground(new Color(0, 0, 102));
        notepad.setForeground(Color.WHITE);
        notepad.setFont(new Font("Tahoma",Font.PLAIN, 20));
        notepad.setMargin(new Insets(0, 0, 0, 155));
        notepad.addActionListener(this);
        p2.add(notepad);
        
        about = new JButton("About");
        about.setBounds(0, 560, 300, 50);
        about.setBackground(new Color(0, 0, 102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN, 20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,  Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
        
        JLabel text = new JLabel("Roamease Application");
        text.setBounds(500, 70, 1000, 70);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== addpersonalDetails){
            new AddCustomer(username);
        }else if (ae.getSource()== viewpersonalDetails){
            new ViewCustomer(username);
        }else if (ae.getSource()== updatepersonalDetails){
            new UpdateCustomer(username);
        }else if (ae.getSource()== checkpackages){
            new CheckPackage();
        }else if (ae.getSource()== bookpackage){
            new BookPackage(username);
        }else if (ae.getSource()== viewpackage){
            new ViewPackage(username);
        }else if (ae.getSource()== viewhotels){
            new CheckHotels();
        }else if(ae.getSource()== destinations){
            new Destinations();
        }else if (ae.getSource()== bookhotel){
            new BookHotel(username);
        }else if(ae.getSource()== viewbookedhotel){
            new ViewBookedHotel(username);
        }else if(ae.getSource()==payments){
            new Payment();
        }else if(ae.getSource()==Calculator){
            try{
               Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource()== notepad){
          try{
               Runtime.getRuntime().exec("notepad.exe");
            }catch(Exception e){
                e.printStackTrace();
            }  
        }else if(ae.getSource()== about){
            new About();
        }else if(ae.getSource()==deletepersonalDetails){
            new DeleteDetails(username);
        }
    }
    
    public static void main(String[] args){
        new Dashboard("");
    }
}
