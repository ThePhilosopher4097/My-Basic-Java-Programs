import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Frame_Demo{
	static int pbv=0;
	public static void main(String args[]){
		JFrame F1=new JFrame("Frame_Demo");
		JPanel P1 = new JPanel();  
	        P1.setLayout(new FlowLayout());  
        	JLabel L1 = new JLabel("Demo Button"); 
		
		ButtonGroup BG1=new ButtonGroup(); 
        	JRadioButton B1 = new JRadioButton("PhD");  
		JRadioButton B2 = new JRadioButton("BTech");    
		JRadioButton B3 = new JRadioButton("MTech");  
        	BG1.add(B1);	BG1.add(B2);	BG1.add(B3);
		
		JCheckBox JCB1 = new JCheckBox("C++", false); 		
		JCheckBox JCB2 = new JCheckBox("Java", false); 		
		JCheckBox JCB3 = new JCheckBox("Python", false); 		
		
		JComboBox jcb = new JComboBox();
		jcb.addItem("Python");
		jcb.addItem("C++");
		jcb.addItem("Java");
		JButton JB1 = new JButton("Submit");
		JProgressBar PB1 = new JProgressBar();
		JB1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				//P1.setBackground(Color.GREEN);
				pbv+=25;
				PB1.setValue(pbv);
			}
		});

		P1.add(L1);  
        	P1.add(B1);  P1.add(B2);  P1.add(B3);  
		P1.add(JCB1);  P1.add(JCB2);  P1.add(JCB3);  
		P1.add(jcb);
		P1.add(JB1);
		P1.add(PB1);
        	F1.add(P1);  
		F1.setSize(400,400);
		F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		F1.setVisible(true);
	}
}