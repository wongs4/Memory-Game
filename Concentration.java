import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Concentration extends JFrame implements ActionListener{

private final int WINDOW_WIDTH=600;
private final int WINDOW_HEIGHT=600;
private JButton [] bMem= new JButton [16];
private int [] saved=new int[3];
private int rows=0;
private int cols = 0;
private int win=0;
private int attempt=0;
private int counter=0;
private int click=0; 
private GameModel dealGame; 

public Concentration(){
setTitle("Three Doors");
setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new BorderLayout());

Panel Mbuttons=new Panel();
Mbuttons.setLayout(new GridLayout(4,4));

dealGame = new FAKEConcentrationGameModel(); 
      rows = dealGame.getRows(); 
      cols = dealGame.getCols();

for (int i=0; i<16; i++){
   bMem[i]=new JButton();
   bMem[i].addActionListener(this);
   Mbuttons.add(bMem[i]);

}

add(Mbuttons, BorderLayout.CENTER);

setVisible(true);

}

public void actionPerformed (ActionEvent ae){
 
   JButton source = (JButton)ae.getSource();
   // find out which button was pushed. Fortunately they are all in an array called bMem
   int i=0;
      while( source != bMem[i])
         i++;
         click++;
         
        if(click %2 ==0 ){
         counter++;
         }
         
        if( ){
           attempt++;
         }
         //clicked 2 buttons but both don't match  
        
        else{
            attempt++;
            win++;
         }
         //clicked 2 buttons but bother match
         
        }   
          
      //for loop to put i in an array
      //maybe set this array as true or false, so if true it means two clicks and they match images
      /*something else to check if the images in the array match(might go 
      back to concentrationgamemodel*/
      //IF FALSE:
      /*if images don't match add a different background image to the clicked 
      boxes to make it appear as if they have been flipped over*/
      //make it go through the for loop again(essentially repeat above steps)
      dealGame.takeTurn(i); 
      bMem[i].setIcon(dealGame.get(i));
      bMem[i].addActionListener(this);
      
      
   }
}