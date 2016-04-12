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
   
   
   
      for( int i=0;i<images.length;i++){
       String imageName = images[i].getDescription(); 
      if(imageName.equals("vacation.jpg"))
       winningPick = i; // index of Valuable Prize (not goat)
      }
   
      //setting images
      /* The ArrayList is a list of numbers (names of image files) and sets into images?  */
      //comment out to debug
      /*ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>(Arrays.asList(images));
      Collections.shuffle(imageList);

      for( int i=0;i<imageList.size();i++)
         images[i] = imageList.get(i);*/
         
      
         
      for (int t=0; t<8; t++){
         images[t]=new ImageIcon("goat3.jpg");
         }
      for (int t=8; t<16; t++){
         images[t]=new ImageIcon("vacation.jpg");
         }
      

}
      public void takeTurn(int t){} 
      
      //stuff DuhShurlzz Added while HomeGurl Iqrahzzle was in class
      public static imagedescription(){
      
      for(int i=0;i<images.length;i++){
            String imageName = images[i].getDescription();
            String imageName2 = images[i].getDescription();
            if(imageName = imageName2){
               winningPick = i;
               winningPick2 = i;
               win++;
            return (winningPick, winningPick2);
      }       
      
      //DuhShurlzz Only Added up to this pointz, but it aint rlly work yuh sea
      
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