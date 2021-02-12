/*import java.util.*;
import java.net.*;
import java.io.*;
public class Server1
{
		public static void main(String args[]) throws java.io.IOException
		{
			ServerSocket ss=new ServerSocket(4097);
			Socket s=ss.accept();
			String j;
			Scanner sc=new Scanner(System.in);
			System.out.println("Client Sameer is Online");
			String str;
			do
			{
			InputStreamReader in=new InputStreamReader(s.getInputStream());
			BufferedReader bf=new BufferedReader(in);
			str=bf.readLine();
			System.out.println("Sam : "+str);
			
			PrintWriter pr=new PrintWriter(s.getOutputStream());
			System.out.println("Server : ");
			j=sc.nextLine();
			pr.println(" "+j);
			pr.flush();
			}while(str!="Exit");
		}
}*/

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
public class Server1 extends Applet implements ActionListener, Runnable
{
        //Image Icon = Toolkit.getDefaultToolkit().getImage("D:/Example/emperian/jsf/ChatterAPI/src/chatterapi/hi.gif");
        ServerSocket ss;
        Socket s;
                BufferedReader br;
                BufferedWriter bw;
                TextField text;
        Button sendBut, exitBut;
        List list;
    @Override
public void init(){
    setForeground(Color.blue);
   getAppletContext().showStatus("...");
   
}
    @Override
        public void start() // class constructor
                {
               
               // super(m);
                setSize(300, 130);
                setLocation(0,0);
               // setIconImage(Icon);
               // setResizable(false);
                setBackground(new Color(192, 192, 192));
                this.setLayout(new GridLayout(2, 1));

                Panel panels[] = new Panel[2];
                panels[0] = new Panel();
                panels[1] = new Panel();
                panels[0].setLayout(new BorderLayout());
                panels[1].setLayout(new FlowLayout(FlowLayout.LEFT));

                sendBut = new Button("Send");
                exitBut = new Button("Exit");

                sendBut.addActionListener(this);
                exitBut.addActionListener(this);

                list = new List();
                list.select(list.getItemCount()-1);
               
                text = new TextField(25);

                panels[0].add(list);
                panels[1].add(text);
                panels[1].add(sendBut);
                panels[1].add(exitBut);    

                add(panels[0]);
                add(panels[1]);
                showStatus("......");
                setVisible(true);

                try
                {       showStatus("connecting ....");
                        list.add("Send request plz wait...");
                        ss = new ServerSocket(4097);//some port number, better be above 1000
                        s = ss.accept();
                        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                        bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                        bw.write("Hi!?");                       
                        bw.newLine();
                        bw.flush();
                        Thread th;
                        th = new Thread(this);
                        th.start();
                                               
                                               
                                }catch(Exception e){System.out.println("Error:"+e);}

                }

        public void run()
                {
                while (true)
                                {
                        try                      
                        {       showStatus("connected....");
                                list.add("R: "+br.readLine());
                                list.select(list.getItemCount()-1);
                              
                        }catch (Exception e){System.out.println("Error:"+e);}
                                }
                }

       
               
        public void actionPerformed(ActionEvent ae)
                {
                 if (ae.getSource().equals(exitBut))
                                                 System.exit(0);
                 else
                 {
                        try
                        {                               
                                bw.write(text.getText());
                                list.add("S: "+text.getText());
                                showStatus("Data sent...");
                                list.select(list.getItemCount()-1);
                                bw.newLine();bw.flush();                               
                                text.setText("");
                        }catch(Exception x){System.out.println("Error:"+x);}
                                 }
                                                                 
                }
               
}
