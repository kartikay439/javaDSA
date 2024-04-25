import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener{
    TextField tf1;
    TextField tf2;
    AEvent(){

//create components
        tf1=new TextField();
        tf1.setBounds(60,50,170,20);
        tf2=new TextField();
        tf2.setBounds(60,30,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);

//register listener
        b.addActionListener(this);//passing current instance

//add components and set size, layout and visibility
        add(b);add(tf1);
        add(tf2);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println(Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText()));
    }
    public static void main(String args[]){
        new AEvent();
    }
}