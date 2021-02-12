import java.awt.*;
import java.awt.event.*;
public class Test2 extends Frame implements ActionListener{
    static Frame f1;
    MenuItem f2,f3;
    Test2(String title){
        super(title);
        MenuBar mb=new MenuBar();
        setMenuBar(mb);
        Menu file=new Menu("File");
        MenuItem f1=new MenuItem("New...");
        f2=new MenuItem("Open");
        f3=new MenuItem("Save");
        Menu edit=new Menu("Edit");
        MenuItem e1=new MenuItem("Copy"),e2=new MenuItem("Cut"),e3=new MenuItem("Paste");
        file.add(f1);   file.add(f2);   file.add(f3);
        edit.add(e1);   edit.add(e2);   edit.add(e3);
        mb.add(file);
        mb.add(edit);
        f2.addActionListener(this);
        f3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==f2){
                DialogBox db=new DialogBox(f1,"Pop-up !");
                //Dialog db=new Dialog(f1,"Pop-Up Dialog Box"); Without any separate class
                db.setVisible(true);
            }
            if(ae.getSource()==f3){
                FileDialog fd=new FileDialog(f1,"This PC Files",FileDialog.LOAD);
                fd.setVisible(true);
            }
    }
    class DialogBox extends Dialog implements ActionListener{
        DialogBox(Frame f,String title){
            super(f,title,true);
            setLayout(new BorderLayout());
            setSize(300,200);
            Button b=new Button("Cancel");
            add(b,BorderLayout.CENTER);
            b.addActionListener(this);
        }
        public void actionPerformed(ActionEvent ae){
            dispose();
        }
    } 
    public static void main(String args[]){
        f1=new Test2("Menu Demo");
        f1.setSize(700,500);
        f1.setVisible(true);
        f1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                f1.setVisible(false);
                System.exit(0);
            }
        });
    }
}