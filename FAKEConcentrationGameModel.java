import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FAKEConcentrationGameModel extends GameModel{
   private ImageIcon [] images = new ImageIcon[16];
   final int SIZE = 4;
   int winningPick = 0;
   int winningPick2 = 0;
   int numberTurnedOver = 0;
   boolean winner = false;
   boolean gameOver = false;
   String imageName;
   String imageName2;
   int win = 0;
   
   FAKEConcentrationGameModel(){
      for (int t=0; t<8; t++){
         images[t]=new ImageIcon("goat3.jpg");
         }
      for (int t=8; t<16; t++){
         images[t]=new ImageIcon("vacation.jpg");
         }
   }

      public void takeTurn(int t){} 
      
      //stuff Iqrah tried to fix but fucking failed at
      static String imagedescription(,String imageName){
         for(int i=0;i<images.length;i++){
               String imageName = images[i].getDescription();       
         }
      return(imageName);
      }
      public static imagedescription2(){
         for(int i=0;i<images.length;i++){
               String imageName2 = images[i].getDescription();
         }
      return (imageName2);
      }
      if(imageName == imageName2){
         winningPick = i;
         winningPick2 = i;
         win++;
      }  
      
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