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