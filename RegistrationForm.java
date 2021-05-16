import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import databases.*;
import java.sql.*;
class User{
	static String NAME="", MOBILE="", DOB="", ADDRESS="", USERNAME="", PASSWORD="";
}
class MyFrame 
	extends JFrame 
	implements ActionListener { 
	MyFrame f;
	Container c; 
	JLabel title, name, gender, mno, dob, add, res, pass, cpass; 
	JTextField tname, tmno, uname, uname2; 
	JPasswordField tpass,tpass2,ctpass;
	JRadioButton male,female; 
	ButtonGroup gengp; 
	JComboBox date,month,year; 
	JTextArea tadd, tout, resadd; 
	JCheckBox term; 
	JButton sub, reset,sub2,reset2,sub3,reset3;  
	JDialog PopUp;
	
	String dates[] 
		= { "1", "2", "3", "4", "5", 
			"6", "7", "8", "9", "10", 
			"11", "12", "13", "14", "15", 
			"16", "17", "18", "19", "20", 
			"21", "22", "23", "24", "25", 
			"26", "27", "28", "29", "30", 
			"31" }; 
	String months[] 
		= { "Jan", "feb", "Mar", "Apr", 
			"May", "Jun", "July", "Aug", 
			"Sep", "Oct", "Nov", "Dec" }; 
	String years[] 
		= { "1995", "1996", "1997", "1998", 
			"1999", "2000", "2001", "2002", 
			"2003", "2004", "2005", "2006", 
			"2007", "2008", "2009", "2010", 
			"2011", "2012", "2013", "2014", 
			"2015", "2016", "2017", "2018", 
			"2019", "2020", "2021" }; 
	public MyFrame() 
	{ 
		f=this;
		setTitle("Registration Form"); 
		setBounds(300, 90, 900, 600); 
		setLayout(new CardLayout());
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c= getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Registration Form"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(300, 40); 
		title.setLocation(300, 30); 
		c.add(title); 
		name = new JLabel("Name"); 
		name.setFont(new Font("Arial", Font.PLAIN, 20)); 
		name.setSize(100, 20); 
		name.setLocation(100, 100); 
		c.add(name); 

		tname = new JTextField(); 
		tname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tname.setSize(190, 20); 
		tname.setLocation(200, 100); 
		c.add(tname); 

		mno = new JLabel("Mobile"); 
		mno.setFont(new Font("Arial", Font.PLAIN, 20)); 
		mno.setSize(100, 20); 
		mno.setLocation(100, 150); 
		c.add(mno); 

		tmno = new JTextField(); 
		tmno.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tmno.setSize(150, 20); 
		tmno.setLocation(200, 150); 
		c.add(tmno); 

		gender = new JLabel("Gender"); 
		gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
		gender.setSize(100, 20); 
		gender.setLocation(100, 200); 
		c.add(gender); 

		male = new JRadioButton("Male"); 
		male.setFont(new Font("Arial", Font.PLAIN, 15)); 
		male.setSelected(true); 
		male.setSize(75, 20); 
		male.setLocation(200, 200); 
		c.add(male); 

		female = new JRadioButton("Female"); 
		female.setFont(new Font("Arial", Font.PLAIN, 15)); 
		female.setSelected(false); 
		female.setSize(80, 20); 
		female.setLocation(275, 200); 
		c.add(female); 

		gengp = new ButtonGroup(); 
		gengp.add(male); 
		gengp.add(female); 

		dob = new JLabel("DOB"); 
		dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
		dob.setSize(100, 20); 
		dob.setLocation(100, 250); 
		c.add(dob); 

		date = new JComboBox(dates); 
		date.setFont(new Font("Arial", Font.PLAIN, 15)); 
		date.setSize(50, 20); 
		date.setLocation(200, 250); 
		c.add(date); 

		month = new JComboBox(months); 
		month.setFont(new Font("Arial", Font.PLAIN, 15)); 
		month.setSize(60, 20); 
		month.setLocation(250, 250); 
		c.add(month); 

		year = new JComboBox(years); 
		year.setFont(new Font("Arial", Font.PLAIN, 15)); 
		year.setSize(60, 20); 
		year.setLocation(320, 250); 
		c.add(year); 

		add = new JLabel("Address"); 
		add.setFont(new Font("Arial", Font.PLAIN, 20)); 
		add.setSize(100, 20); 
		add.setLocation(100, 300); 
		c.add(add); 

		tadd = new JTextArea(); 
		tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tadd.setSize(200, 75); 
		tadd.setLocation(200, 300); 
		tadd.setLineWrap(true); 
		c.add(tadd); 

		term = new JCheckBox("Accept Terms And Conditions."); 
		term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		term.setSize(250, 20); 
		term.setLocation(150, 400); 
		c.add(term); 

		sub = new JButton("Submit"); 
		sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub.setSize(100, 20); 
		sub.setLocation(150, 450); 
		c.add(sub); 

		reset = new JButton("Reset"); 
		reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset.setSize(100, 20); 
		reset.setLocation(270, 450); 
		c.add(reset); 

		setVisible(true); 
		
		sub.addActionListener(this);
		reset.addActionListener(this);
	} 
	public MyFrame(String Name){
		f=this;
		setTitle("Set Credentials"); 
		setBounds(300, 90, 800, 500); 
		setLayout(new CardLayout());
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c= getContentPane();
		c.setLayout(null);
		
		title = new JLabel("Hi "+Name+" !     Please set your Credentials..."); 
		title.setFont(new Font("Lucida Fax", Font.PLAIN, 30)); 
		title.setSize(700, 40); 
		title.setLocation(50, 30); 
		c.add(title); 
		name = new JLabel("Create Username : "); 
		name.setFont(new Font("Arial", Font.PLAIN, 20)); 
		name.setSize(200, 30); 
		name.setLocation(100, 100); 
		c.add(name); 

		uname = new JTextField(); 
		uname.setFont(new Font("Arial", Font.PLAIN, 15)); 
		uname.setSize(200, 30); 
		uname.setLocation(300, 100); 
		c.add(uname); 

		pass = new JLabel("Create Password : "); 
		pass.setFont(new Font("Arial", Font.PLAIN, 20)); 
		pass.setSize(200, 30); 
		pass.setLocation(100, 150); 
		c.add(pass); 

		tpass = new JPasswordField(); 
		tpass.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tpass.setSize(200, 30); 
		tpass.setLocation(300, 150); 
		c.add(tpass);

		cpass = new JLabel("Confirm Password : "); 
		cpass.setFont(new Font("Arial", Font.PLAIN, 20)); 
		cpass.setSize(200, 30); 
		cpass.setLocation(100, 200); 
		c.add(cpass); 

		ctpass = new JPasswordField(); 
		ctpass.setFont(new Font("Arial", Font.PLAIN, 15)); 
		ctpass.setSize(200, 30); 
		ctpass.setLocation(300, 200); 
		c.add(ctpass);

		sub2 = new JButton("Next"); 
		sub2.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub2.setSize(100, 40); 
		sub2.setLocation(150, 300); 
		c.add(sub2); 

		reset2 = new JButton("Reset"); 
		reset2.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset2.setSize(100, 40); 
		reset2.setLocation(300, 300); 
		c.add(reset2); 

		setVisible(true); 
		
		sub2.addActionListener(this);
		reset2.addActionListener(this);
	}
	public MyFrame(int w){
		f=this;
		setTitle("Login"); 
		setBounds(300, 90, 600, 400); 
		setLayout(new CardLayout());
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c= getContentPane();
		c.setLayout(null);
		
		title = new JLabel("User Login"); 
		title.setFont(new Font("Arial", Font.PLAIN, 30)); 
		title.setSize(600, 40); 
		title.setLocation(100, 30); 
		c.add(title); 
		name = new JLabel("Enter Username : "); 
		name.setFont(new Font("Arial", Font.PLAIN, 20)); 
		name.setSize(200, 30); 
		name.setLocation(100, 100); 
		c.add(name); 

		uname2 = new JTextField(); 
		uname2.setFont(new Font("Arial", Font.PLAIN, 15)); 
		uname2.setSize(200, 30); 
		uname2.setLocation(300, 100); 
		c.add(uname2); 

		pass = new JLabel("Enter Password : "); 
		pass.setFont(new Font("Arial", Font.PLAIN, 20)); 
		pass.setSize(200, 30); 
		pass.setLocation(100, 150); 
		c.add(pass); 

		tpass2 = new JPasswordField(); 
		tpass2.setFont(new Font("Arial", Font.PLAIN, 15)); 
		tpass2.setSize(200, 30); 
		tpass2.setLocation(300, 150); 
		c.add(tpass2);

		sub3 = new JButton("Login"); 
		sub3.setFont(new Font("Arial", Font.PLAIN, 15)); 
		sub3.setSize(100, 50); 
		sub3.setLocation(150, 250); 
		c.add(sub3); 

		reset3 = new JButton("Reset"); 
		reset3.setFont(new Font("Arial", Font.PLAIN, 15)); 
		reset3.setSize(100, 50); 
		reset3.setLocation(300, 250); 
		c.add(reset3); 
		
		setVisible(true); 
		sub3.addActionListener(this); 
		reset3.addActionListener(this); 
	}
	public MyFrame(boolean bool){
		f=this;
		setTitle("Welcome Back !"); 
		setBounds(300, 90, 900, 600); 
		setLayout(new CardLayout());
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c= getContentPane();
		c.setLayout(null);
		
		title = new JLabel("WELCOME to MIT Academy Of Engineeing !"); 
		title.setFont(new Font("Modern No. 20", Font.BOLD, 30)); 
		title.setSize(700, 40); 
		title.setLocation(150, 30); 
		c.add(title); 
		
		JLabel n1=new JLabel("Name : "+User.NAME);
		n1.setFont(new Font("Lucida Handwriting", Font.PLAIN, 20)); 
		n1.setSize(400, 30); 
		n1.setLocation(200,70);
		
		JLabel n2=new JLabel("Mobile Number: "+User.MOBILE);
		n2.setFont(new Font("Arial", Font.PLAIN, 20)); 
		n2.setSize(400, 30); 
		n2.setLocation(200,100);
		
		JLabel n3=new JLabel("Date of Birth : "+User.DOB);	
		n3.setFont(new Font("Arial", Font.PLAIN, 20)); 
		n3.setSize(400, 30); 
		n3.setLocation(200,130);
		
		JLabel n4=new JLabel("Address : "+User.ADDRESS);
		n4.setFont(new Font("Arial", Font.PLAIN, 20)); 
		n4.setSize(600, 30); 
		n4.setLocation(200,160);
		
		c.add(n1);	c.add(n2);	c.add(n3);	c.add(n4);
		
		JLabel imgLabel = new JLabel(new ImageIcon("mit.jpg"));
		imgLabel.setSize(750,350);
		imgLabel.setLocation(100,200);
		c.add(imgLabel);
		
		setVisible(true); 
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==reset){
			f.dispose();
			f=new MyFrame();
		}
		else if(ae.getSource()==reset2){
			f.dispose();
			f=new MyFrame(User.NAME);
		}
		else if(ae.getSource()==sub){
			if(term.isSelected()==false || tname.getText().toString().equals(null) || tmno.getText().toString().equals(null) || tadd.getText().toString().equals(null)){
				PopUp=new JDialog(f , " Alert !", true);  
				JLabel l=new JLabel("Please Fill all the details !",JLabel.CENTER);
				PopUp.add(l);
				PopUp.setSize(350,200);
				PopUp.setBounds(400, 200, 350, 200);
				PopUp.setVisible(true);
				return;
			}
			User.NAME=tname.getText().toString();
			User.DOB=date.getSelectedItem().toString()+" - "+month.getSelectedItem().toString()+" - "+year.getSelectedItem().toString();
			User.MOBILE=tmno.getText().toString();
			User.ADDRESS=tadd.getText().toString();
			Connection con = null;
			try{
				con=Student_DB.dbconnect();
				PreparedStatement pst = con.prepareStatement("insert into student (Name,Mobile,Address,DateOfBirth) values (?,?,?,?)");
				pst.setString(1,User.NAME);
				pst.setString(2,User.MOBILE);
				pst.setString(3,User.ADDRESS);
				pst.setString(4,User.DOB);
				pst.executeUpdate();
			}catch(Exception e){
				System.out.println(e);
			}
			f.dispose();
			f=new MyFrame(User.NAME);
		}
		else if(ae.getSource()==sub2){
			User.USERNAME=uname.getText().toString();
			User.PASSWORD=tpass.getText().toString();
			if(User.USERNAME.length()<6 || User.USERNAME.length()>14 || User.PASSWORD.length()<6 || User.PASSWORD.length()>14 ){
				JOptionPane.showMessageDialog(f, "Invalid Credentials...\nlength should be 6-14 characters only !", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if(User.PASSWORD.equals(ctpass.getText().toString())==false){
				JOptionPane.showMessageDialog(f, "Confirm Password doesn't match !", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else{
				f.dispose();
				f=new MyFrame(1);
			}
		}
		else if(ae.getSource()==sub3){
			if(User.USERNAME.equals(uname2.getText().toString())==false) {
				JOptionPane.showMessageDialog(f, "Incorrect Username", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else if(User.PASSWORD.equals(tpass2.getText().toString())==false){
				JOptionPane.showMessageDialog(f, "Incorrect Password", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			else{
				f.dispose();
				f=new MyFrame(true);
			}
		}
		else if(ae.getSource()==reset3){
			f.dispose();
			f=new MyFrame(1);
		}
	}
} 
class RegistrationForm extends MyFrame{ 
	public static void main(String[] args) throws Exception 
	{ 
		MyFrame f = new MyFrame(); 
	} 
} 
