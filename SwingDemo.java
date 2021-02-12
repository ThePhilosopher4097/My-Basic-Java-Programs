import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Assign3.class" height="600" width="600"></applet>*/
public class Assign3 extends JApplet
{
    Container cp; 
    JTabbedPane tab;
    public void init(){
        cp=getContentPane();
        tab=new JTabbedPane();
        tab.addTab("Flow Layout",new FlowLayoutDemo());
        tab.addTab("Border Layout",new BorderLayoutDemo());
        cp.add(tab);
    }   
}
class FlowLayoutDemo extends JPanel
{
    JButton b1,b2,b3;
    public FlowLayoutDemo(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1=new JButton("LEFT");
        b2=new JButton("CENTER");
        b3=new JButton("RIGHT");       
        add(b1);	add(b2);        add(b3);
    }
class BorderLayoutDemo extends JPanel
{
    JButton north,south,east,west;
    JTextArea text;
    public BorderLayoutDemo(){
        setLayout(new BorderLayout());
        north=new JButton("NORTH");
        south=new JButton("SOUTH");
        east=new JButton("EAST");
        west=new JButton("WEST");
        text=new JTextArea();
        add(north,BorderLayout.NORTH);
        add(south,BorderLayout.SOUTH);
        add(east,BorderLayout.EAST);
        add(west,BorderLayout.WEST);
        add(text,BorderLayout.CENTER);
    }
}
