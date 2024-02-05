package Lecs.day33.bari;

import java.awt.*;
// import java.awt.event.ActionListener;
import java.awt.event.*;

    public class FileMenuDrivenPro extends Frame implements ActionListener {
        Label l;
        Menu file;
        MenuItem n,o,s,c,e;
        MenuBar mb;

        FileMenuDrivenPro(){
            l=new Label("Menu Option");
            l.setAlignment(Label.CENTER);
            file = new Menu("File");
            n=new MenuItem("New");
            o=new MenuItem("Open");
            s=new MenuItem("Save");
            c=new MenuItem("Close");
            e=new MenuItem("Exit");

            file.add(n);file.add(o);file.add(s);file.add(c);file.add(e);
            mb = new MenuBar();
            mb.add(file);

            setMenuBar(mb);
            add(l);
            n.addActionListener(this);
            o.addActionListener(this);
            c.addActionListener(this);
            s.addActionListener(this);
            e.addActionListener(this);
            // n.addActionListener(this);
        }
    @Override
    public void actionPerformed(ActionEvent ae){
        String op = ae.getActionCommand();

        switch (op) {
            case "New": l.setText("New File Created");
                break;
            case "Open": l.setText("New Open");
                break;
            case "Close": l.setText("New File close");
                break;
            case "Save": l.setText("New File Save");
                break;
            case "Exit": System.exit(0);
                break;
        
            // default:
            //     break;
        }
    }
    public static void main(String[] args) {
        FileMenuDrivenPro m = new FileMenuDrivenPro();
        m.setTitle("Menu Driven Program with Adarsh");
        m.setCursor();
        m.setSize(300,300);
        m.setVisible(true);

        // EventQueue.invokeLater(() -> {
        //     FileMenuDrivenPro m = new FileMenuDrivenPro();
        //     m.setSize(300, 300);
        //     m.setVisible(true);
        // });
    }
}
