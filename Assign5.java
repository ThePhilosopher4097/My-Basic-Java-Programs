import java.awt.*;
import java.applet.*;
/*<applet code="Assign5.class" height="500" width="500"></applet> */
public class Assign5 extends Applet{
    public void paint(Graphics g) 
    { 
        String s="Hello Java"; 
        Font f=new Font("Comic Sans MS",Font.BOLD+Font.ITALIC,20); 
        g.setFont(f); 
        FontMetrics met=g.getFontMetrics(f); 
        int ascent=met.getAscent(); 
        int height=met.getHeight(); 
        int leading=met.getLeading(); 
        int baseline=leading+ascent; 
        for(int i=0,k=16;i<5;i++,k+=16) 
        {   g.setColor(new Color(k,k-16,k+16));
            g.drawString("Line"+String.valueOf(i),100,baseline); 
            baseline+=height; 
        }
        
        g.drawString("Current Font Style : "+f.getStyle(),100,200); 
        g.drawString("Current Font Family : "+f.getFamily(),100,240); 
        g.drawString("Current Font Name : "+f.getName(),100,280); 
    } 
}