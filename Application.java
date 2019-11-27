/********************************
** A10 - Team Assignment - Application
** Author: Amrit, Austin
** Class Description: contains main method, introduction (non-scenario) methods, and utility methods
********************************/

import java.util.Scanner;
import java.util.Random;

public class Application
{
   public static void main(String[] args)
   {
     //methods
     
     startScreen();
     Room.generateRooms();
   }
   
   public static void startScreen() {
      //variables
      Scanner input = new Scanner(System.in);
      String name = "";
      int playerClass = -1;
      
      //title sequence
      System.out.println();
      GraphicsHandler.printGraphics(1);
      transition(1000);
      
      //intro text and castle sprite
      System.out.println("You, a soldier of fortune have been hired by a small Eastern Town to deal with a problem...");
      System.out.println("The long dormant castle of the late lord has began to stir with life, but not of this world.");
      System.out.println("Dark creatures from the castle have ventured into the down causing chaos and fear.");
      System.out.println("You must clear the castle of those evil beasts!");
      transition(5000);
      GraphicsHandler.printGraphics(2);
      transition(2000);
      
      //get player name
      while(name == "") {
         System.out.println("What is your name traveler? ");
         name = input.nextLine();
         Player.setName(name);
      }
      
      //get player class
      do { //Checks if choice is an int between 0 and 3, the only options being 1 or 2
         System.out.println("What profession do you specialize in " + Player.getName() + "?");
         System.out.println(" (1) Knight     (2) Wizard ");
         playerClass = input.nextInt();
      } while (!(playerClass > 0 && playerClass < 3));
      
      if(playerClass == 1) {
         //knight
         System.out.println("\nAhh a brave knight, your armor will make you a much tougher foe.");
         Player.setHealth(10);
         Player.setMagic(1);
      } else { 
         //wizard
         System.out.println("\nA wizard, a rare sight around these parts. Your magical ability might save you from some sticky situations.");
         Player.setHealth(7);
         Player.setMagic(4);
      }
      
      System.out.println("Now that you have gathered yourself, it is now time to enter the castle. You enter the side maids entrance...");
      transition(2000);
   }
   
   public static void sleep(int milliseconds) {
      try {
          Thread.sleep(milliseconds);                 //1000 milliseconds is one second.
      } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
      }
   }
   
   public static void transition(int milliseconds) {
      sleep(milliseconds/2);
      System.out.print("\n.");
      sleep(milliseconds/2);
      System.out.print(".");
      sleep(milliseconds/2);
      System.out.print(".\n");
   }
   
   public static boolean probabilityCalculator(double chance) {
      //use me to calculate probability, will return true if success, false if not.
      //pass a double from 0 - 1. example: probabilityCalculator(0.25) 25% chance of success.
      Random rand = new Random();
      double r = rand.nextDouble();
      if (r < chance) {
         return true;
      } else {
         return false;
      }
   
   }
}
