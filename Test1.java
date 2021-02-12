import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*  <applet code="Test1.class" height="550" width="800"></applet>
 */
public class Test1 extends Applet implements ActionListener{
    Panel p=new Panel();
    CardLayout cl=new CardLayout();
    Button b1=new Button("To Panel 2");
    Button b2=new Button("To Panel 1");
    public void init(){
            p.setLayout(cl);
            Panel p1=new Panel();
            p1.add(new Label("This is Panel_1"));
            Panel p2=new Panel();
            p1.add(b1);    
            p2.add(b2);
            p2.add(new Label("This is Panel_2"));            
            Panel p3=new Panel();
            p3.add(new Label("This is Panel_3"));            
            p.add(p1,"Panel1");
            p.add(p2,"Panel2");
            p.add(p3,"Panel3");
            add(p);
            b1.addActionListener(this);
            b2.addActionListener(this);
            addMouseListener(new MouseAdapter(){
                public void mousePressed(MouseEvent me){
                    cl.next(p);
                }
            });
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1)  cl.show(p,"Panel2");
        else cl.show(p,"Panel1");
    }
}