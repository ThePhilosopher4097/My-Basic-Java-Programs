import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.util.Stack;
import java.lang.Math;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javax.script.ScriptEngineManager;

public class Calculator extends JFrame implements ActionListener, ItemListener, FocusListener {
	JFrame Calculator;
	static String Equation="", Answer="",Equation2="";
	static Vector EQ=new Vector();
	static boolean Focus=false;
	JPanel Maths,Converter;
	JTextArea Input,Output;
	JTextField u1,u2;
	JComboBox unit_1, unit_2;
	JButton Convert_Button, Swap_Button;
	Calculator(){
		Calculator = new JFrame();
		
		JTabbedPane Calci = new JTabbedPane();
		Maths = new JPanel();
		Converter = new JPanel();
		
		Calci.add("Maths",Maths); 
		Calci.add("Converter",Converter);
		Calculator.add(Calci);  
		
		Calculator.setSize(350,375);  
		Calculator.setLayout(new CardLayout());  
		Calculator.setVisible(true); 
		Calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		createInterface();
		
	}
	public static void main(String args[]){
		Calculator C=new Calculator();
		
	}	
	void createInterface(){
		
		Border blackline = BorderFactory.createLineBorder(Color.black);
		Maths.setBackground(Color.CYAN);
		JPanel Screen = new JPanel(new GridLayout(4,1));
		JPanel Keypad = new JPanel(new GridLayout(6,4));
		
		Input = new JTextArea(2,20);
		Output = new JTextArea(2,20);
		Output.setEditable(false);
		JLabel input = new JLabel("Enter Input : ");
		Screen.add(input);
		Screen.add(Input);
		JLabel output = new JLabel("Answer = ");
		Screen.add(output);
		Screen.add(Output);		
		Input.addFocusListener(this);
		Input.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent ke){
					if(Focus==true){
						Equation=Equation+Character.toString(ke.getKeyChar());
						Input.setText(Equation);
					}
				}
				public void keyReleased(KeyEvent ke){}
				public void keyPressed(KeyEvent ke){}
			});
		JButton Key[] = new JButton[25];
		Key[0] = new JButton("(");	Key[1] = new JButton(")");	Key[2] = new JButton("Clear");	Key[3] = new JButton("Delete");
		Key[4] = new JButton("7");	Key[5] = new JButton("8");	Key[6] = new JButton("9");	Key[7] = new JButton("+");
		Key[8] = new JButton("4");	Key[9] = new JButton("5");	Key[10] = new JButton("6");	Key[11] = new JButton("-");
		Key[12] = new JButton("1");	Key[13] = new JButton("2");	Key[14] = new JButton("3");	Key[15] = new JButton("*");
		Key[16] = new JButton(".");	Key[17] = new JButton("0");	Key[18] = new JButton("=");	Key[19] = new JButton("/");
		Key[20] = new JButton("SQRT");	Key[21] = new JButton("PI");	Key[22] = new JButton("^");	Key[23] = new JButton("%");
		for(int i=0;i<24;i++){
			Keypad.add(Key[i]);
			Key[i].addActionListener(this);
		}
		Maths.add(Screen);
		Maths.add(Keypad);
		
		Converter.setBackground(Color.ORANGE);
		JPanel converter = new JPanel(new GridLayout(4,1));
		JPanel Unit_1 = new JPanel();
		JPanel Ok = new JPanel();
		JPanel Unit_2 = new JPanel();
		JPanel Options = new JPanel(new GridLayout(3,2));
		
		String units[]={"Select Unit","millimeter","centimeter","meter","kilometer","miles"};
		unit_1 = new JComboBox(units);
		unit_2 = new JComboBox(units);
		Convert_Button = new JButton("Convert");
		Swap_Button = new JButton("Swap");
		Convert_Button.addActionListener(this);
		Swap_Button.addActionListener(this);			
		u1 = new JTextField(20);
		u2 = new JTextField(20);
		JButton Units[] = new JButton[10];
		Units[0] = new JButton("Distance");	Units[1] = new JButton("Time");	
		Units[2] = new JButton("Mass");		Units[3] = new JButton("Speed");
		Units[4] = new JButton("Temperature");	Units[5] = new JButton("Currency");	
		for(int i=0;i<6;i++)
			Options.add(Units[i]);
		
		Unit_1.add(unit_1);
		Unit_1.add(u1);
		Ok.add(Convert_Button);
		Ok.add(Swap_Button);
		Unit_2.add(unit_2);
		Unit_2.add(u2);
		converter.add(Unit_1);
		converter.add(Ok);
		converter.add(Unit_2);
		converter.add(Options);
		Converter.add(converter);
		
		Ok.setBackground(Color.PINK);
		Unit_1.setSize(50,5);
		Screen.setBorder(blackline);
		Keypad.setBorder(blackline);
		Unit_1.setBorder(blackline);
		Ok.setBorder(blackline);
		Unit_2.setBorder(blackline);
	}
	public static String solve(String str) throws ScriptException {
		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		String foo = str;
		return String.valueOf(engine.eval(foo));
	}
	public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==Swap_Button){
			String str = unit_2.getSelectedItem().toString();
			unit_2.setSelectedItem(unit_1.getSelectedItem().toString());
			unit_1.setSelectedItem(str);
			return;
		}
		if(ae.getSource()==Convert_Button){
			String U2="";
			switch(unit_1.getSelectedItem().toString()){
				case "millimeter" : 
												switch(unit_2.getSelectedItem().toString()){
													case "millimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1);	
														break;
													case "miles" :
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.0000000621);
														break;
													case "centimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.10);
														break;
													case "meter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.001);
														break;
													case "kilometer" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.0000001);
														break;
													default : break;
												}
												u2.setText(U2);
												break;
				case "kilometer" : 
												switch(unit_2.getSelectedItem().toString()){
													case "millimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1000000);	
														break;
													case "miles" :
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.621);
														break;
													case "centimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*100000);
														break;
													case "meter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1000);
														break;
													case "kilometer" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1);
														break;
													default : break;
												}
												u2.setText(U2);
												break;
				case "centimeter" : 
												switch(unit_2.getSelectedItem().toString()){
													case "millimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*10);	
														break;
													case "miles" :
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.00000621);
														break;
													case "centimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1);
														break;
													case "meter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*100);
														break;
													case "kilometer" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.000001);
														break;
													default : break;
												}
												u2.setText(U2);
												break;
				case "meter" : 
												switch(unit_2.getSelectedItem().toString()){
													case "millimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1000);	
														break;
													case "miles" :
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.000621);
														break;
													case "centimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*100);
														break;
													case "meter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1);
														break;
													case "kilometer" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*0.001);
														break;
													default : break;
												}
												u2.setText(U2);
												break;
				case "miles" : 
												switch(unit_2.getSelectedItem().toString()){
													case "millimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1609344);	
														break;
													case "miles" :
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1);
														break;
													case "centimeter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*160934);
														break;
													case "meter" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1609);
														break;
													case "kilometer" : 
														U2=String.valueOf(Double.parseDouble(u1.getText().toString())*1.609);
														break;
													default : break;
												}
												u2.setText(U2);
												break;
					default : break;
			}
			return;
		}
		
		String name = ((JButton) ae.getSource()).getText();
        switch(name){
			case "=" : try{	
								//Answer=infixToPostfix(Equation2);
								//Answer=String.valueOf(evaluatePostfix(Answer));
								Answer = solve(Equation); 
							}catch(Exception e){}
							Output.setEditable(true);
							Output.setText(Answer);
							Output.setEditable(false);
							break;
			case "PI" : 
								Equation=Equation+"3.142";
								//Equation=Equation+"\u03c0";	
								break;
			case "SQRT" :	
										Equation=Equation+"\u221A";
										break;
			case "Delete" :	
									if(Equation.length()==0)	break;
									Equation=Equation.substring(0,Equation.length()-1);	
									Equation2=Equation2.substring(0,Equation2.length()-1);	
									break;
			case "Clear" :	Equation="";	Equation2="";		Answer="";	break;
			case "." : 
						Equation+=".";
						break;
			default : 
				Equation2+=name;
				Equation+=name;
				break;
		}
		Input.setText(Equation);
		Output.setText(Answer);
      }		
	  
	  public void focusGained(FocusEvent fe) {
            Focus=true;
        }
        public void focusLost(FocusEvent fe) {
            Focus=false;
        }
	
	public void itemStateChanged(ItemEvent e) {      
       
     }  
	 
	 static int Prec(char ch)
    {
        switch (ch)
        {
        case '+':
        case '-':
            return 1;
        case '*':
        case '/':
            return 2;
        case '^':
		case '#' : 
            return 3;
        }
        return -1;
    }
	static String infixToPostfix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
          
        // initializing empty stack
        Stack<Character> stack = new Stack<>();
          
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
              
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
               
            // If the scanned character is an '(', 
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
              
            //  If the scanned character is an ')', 
            // pop and output from the stack 
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.isEmpty() && 
                        stack.peek() != '(')
                    result += stack.pop();
                  
                    stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) 
                         <= Prec(stack.peek())){
                    
                    result += stack.pop();
             }
                stack.push(c);
            }
       
        }
       
        // pop all the operators from the stack
        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
         }
        return result;
    }
	
	
	static int evaluatePostfix(String exp)
    {
        //create a stack
        Stack<Integer> stack=new Stack<>();
          
        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
              
            // If the scanned character is an operand (number here),
            // push it to the stack.
            if(Character.isDigit(c))
            stack.push(c - '0');
              
            //  If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else
            {
                int val1 = stack.pop();
				int val2 = stack.pop();
				if(c=='#')
					stack.push(val2);
                  
                switch(c)
                {
                    case '+':
                    stack.push(val2+val1);
                    break;
                      
                    case '-':
                    stack.push(val2- val1);
                    break;
                      
                    case '/':
                    stack.push(val2/val1);
                    break;
                      
                    case '*':
                    stack.push(val2*val1);
                    break;
					
					case '^':
                    stack.push((int)Math.pow(val2,val1));
                    break;
					case '#' :
					stack.push((int)Math.sqrt(val1));
					break;
              }
            }
        }
        return stack.pop();    
    }
}

























/*
if (Equation.charAt(i)=='+'){
							Answer = String.valueOf(Double.parseDouble(Equation.substring(0,Equation.indexOf('+'))) + Double.parseDouble(Equation.substring(Equation.indexOf("+")+1, Equation.length()))); break; }
							else if (Equation.charAt(i)=='-'){
							Answer = String.valueOf(Double.parseDouble(Equation.substring(0,Equation.indexOf('-'))) - Double.parseDouble(Equation.substring(Equation.indexOf("-")+1, Equation.length()))); break; }
							else if (Equation.charAt(i)=='/'){
							Answer = String.valueOf(Double.parseDouble(Equation.substring(0,Equation.indexOf('/'))) / Double.parseDouble(Equation.substring(Equation.indexOf("/")+1, Equation.length()))); break; }
							else if (Equation.charAt(i)=='*'){
							Answer = String.valueOf(Double.parseDouble(Equation.substring(0,Equation.indexOf('*'))) * Double.parseDouble(Equation.substring(Equation.indexOf("*")+1, Equation.length()))); break; }
							else if (Equation.charAt(i)=='%'){
							Answer = String.valueOf(Double.parseDouble(Equation.substring(0,Equation.indexOf('*'))) % Double.parseDouble(Equation.substring(Equation.indexOf("*")+1, Equation.length()))); break; }
*/