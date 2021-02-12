import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MenuBarDemo extends Frame implements ActionListener
{
	MenuBar mb;
	static MenuBarDemo mb1;
	Menu file,edit,format,view,help,zoom;
	MenuItem cut,copy,paste,delete,find,replace,save,pagesetup,open,print,exit,saveas,new_file;
	MenuItem undo,wordwrap,font,zoom_in,zoom_out,restore_zoom,view_help,about;
	CheckboxMenuItem status;
	public MenuBarDemo()
	{
		super("My Frame");
		setVisible(true);
		setSize(600,600);

		mb=new MenuBar();

		file=new Menu("File");
		edit=new Menu("Edit");
		format=new Menu("Format");
		view=new Menu("View");
		help=new Menu("Help");
		zoom=new Menu("Zoom");
		
		new_file=new MenuItem("New");
		save=new MenuItem("Save");
		open=new MenuItem("Open");
		saveas=new MenuItem("Save As");
		pagesetup=new MenuItem("Page Setup");
		print=new MenuItem("Print");
		exit=new MenuItem("Exit");
	
		undo=new MenuItem("Undo");
		cut=new MenuItem("Cut");
		copy=new MenuItem("Copy");
		paste=new MenuItem("Paste");
		delete=new MenuItem("Delete");
		find=new MenuItem("Find");
		replace=new MenuItem("Replace");

		font=new MenuItem("Font");
		wordwrap=new MenuItem("Word Wrap");
	
		zoom_in=new MenuItem("Zoom In");
		zoom_out=new MenuItem("Zoom Out");
		status=new CheckboxMenuItem("Status",true);
		restore_zoom=new MenuItem("Restore Default Zoom");

		view_help=new MenuItem("View help");
		about=new MenuItem("About");

		file.add(new_file);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(pagesetup);
		file.add(print);
		file.add(exit);
		
		edit.add(undo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.add(find);
		edit.add(replace);

		format.add(wordwrap);
		format.add(font);

		view.add(zoom);
		view.add(status);
		zoom.add(zoom_in);
		zoom.add(zoom_out);
		zoom.add(restore_zoom);

		help.add(view_help);
		help.add(about);
		mb.add(file);
		mb.add(edit);
		mb.add(format);
		mb.add(view);
		mb.add(help);
		save.addActionListener(this);
		open.addActionListener(this);
		setMenuBar(mb);
		exit.addActionListener(this);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==open){
                DialogBox db=new DialogBox(mb1,"Pop-up !");
                //Dialog db=new Dialog(f1,"Pop-Up Dialog Box"); Without any separate class
                db.setVisible(true);
            }
            if(ae.getSource()==save){
                FileDialog fd=new FileDialog(mb1,"This PC Files",FileDialog.SAVE);
                fd.setVisible(true);
            }
			if(ae.getSource()==exit){
				mb1.dispose();
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
	public static void main(String args[])
	{
		mb1=new MenuBarDemo();
	}
}