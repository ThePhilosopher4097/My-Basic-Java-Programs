import java.awt.*;
import java.applet.*;
public class tp extends Applet
{
    public void paint(Graphics g) 
    {   for(int i=0;i<20;i++)
        try{
        g.drawString("/",50,50);
        repaint();
        Thread.sleep(400);
        repaint();
        g.drawString("|",50,50);
        Thread.sleep(400);
        repaint();
        g.drawString("\\",50,50);
        Thread.sleep(400);
        repaint();
    }catch(Exception e){}
    }
}