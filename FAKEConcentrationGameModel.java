import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FAKEConcentrationGameModel extends GameModel{
   private ImageIcon [] images = new ImageIcon[16];
   final int SIZE = 4;
   //int winningPick = 
   int numberTurnedOver = 0;
   boolean winner = false;
   boolean gameOver = false;
   
   FAKEConcentrationGameModel(){
   
      //setting images
      /* The ArrayList is a list of numbers (names of image files) and sets into images?  */
      //comment out to debug
      /*ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>(Arrays.asList(images));
      Collections.shuffle(imageList);

      for( int i=0;i<imageList.size();i++)
         images[i] = imageList.get(i);*/
         
      for (int t=0; t<16; t++){
         images[t]=new ImageIcon("goat3.jpg");
         
         }
      

}
      public void takeTurn(int t){}        
      
      boolean gameOverStatus(){
      return(false);
      }
      
      ImageIcon get(int i){
      return(images[i]);
      }
      
      int getRows(){
      return(4);
      }
      
      int getCols(){
      return(SIZE);
      } 
      
      void display(){};      
      String reportWinner(){
      return("You're a whiner. You suck. Congrats!");
      }  
   
}