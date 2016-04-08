import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ThreeDoors extends JFrame implements ActionListener{

private final int WINDOW_WIDTH=300;
private final int WINDOW_HEIGHT=300;
private JButton [] bMem= new JButton [16];
//private JButton one,two,three,four,five,six,seven,eight,nine;

public ThreeDoors(){
setTitle("Three Doors");
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());

Panel Mbuttons=new Panel();
Mbuttons.setLayout(new GridLayout(4,4));

for (int i=0; i<16; i++){
   bMem[i]=new JButton();
   bMem[i].addActionListener(this);
   Mbuttons.add(bMem[i]);

}

add(Mbuttons, BorderLayout.CENTER);

/*topRow.add(new JButton("1"));
//add(one,BorderLayout.WEST);
topRow.add(new JButton("2"));
//add(two,BorderLayout.CENTER);
topRow.add(new JButton("3"));
//add(three,BorderLayout.EAST);
add(topRow,BorderLayout.NORTH);

Panel middleRow=new Panel();
middleRow.setLayout(new GridLayout(1,3));

middleRow.add(new JButton("4"));
middleRow.add(new JButton("5"));
middleRow.add(new JButton("6"));

add(middleRow,BorderLayout.CENTER);

Panel bottomRow=new Panel();
bottomRow.setLayout(new GridLayout(1,3));

bottomRow.add(new JButton("7"));
bottomRow.add(new JButton("8"));
bottomRow.add(new JButton("9"));

add(bottomRow,BorderLayout.SOUTH);*/



setVisible(true);

}

public void actionPerformed (ActionEvent ae){

}
}