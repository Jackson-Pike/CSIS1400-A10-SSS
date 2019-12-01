/********************************
** A10 - Team Assignment - Battle
** Author: 
** Class Description: Handles battles
********************************/
import java.util.Random;
import java.util.Scanner;
public class Battle
{
   //Fields
   Random rand = new Random();
   int enemyHealth;
   String[] enemyLines = new String[3];
   int randomEnemy;
   boolean encounterOver = false;
   static Scanner input = new Scanner(System.in);
   
   public Battle() {
      this.randomEnemy = rand.nextInt(3) + 1;
      switch(randomEnemy){
      
         case 1:
            System.out.println();
            GraphicsHandler.printGraphics(6);
            System.out.printf("%-13s%n", "It's a vampire!");
            Application.transition(500);
            this.enemyHealth = 3;
            enemyLines[0] = "The vampire bites you with its fangs!";
            enemyLines[1] = "The vampire slashes you with a dagger!";
            enemyLines[2] = "The vampire summons bats to attack!";
            break;
            
         case 2:
            System.out.println();
            GraphicsHandler.printGraphics(7);
            System.out.printf("%-13s%n", "It's a DRAGON!");
            Application.transition(500);
            this.enemyHealth = 5;
            enemyLines[0] = "The dragon blasts you with fire!";
            enemyLines[1] = "The dragon cuts you with the spikes on its tail!";
            enemyLines[2] = "The dragon claws and slashes at you!"; //FIXME: Jackson Add third line
            break;
         case 3:
            System.out.println();
            GraphicsHandler.printGraphics(8);
            System.out.printf("%-13s%n", "It's a DEMON!");
            Application.transition(500);
            this.enemyHealth = 4;
            enemyLines[0] = "The demon takes a piece of your soul!";
            enemyLines[1] = "The demon summons flames and burns you!";
            enemyLines[2] = "The demon unleashes his hell-hound on you!";
            break;
      }
            
      while(!encounterOver) {
         //player turn
         GraphicsHandler.printStats(this.enemyHealth);
         System.out.printf("What is your choice?: ");
         switch(input.nextInt()){
            case 1: 
               if(Application.probabilityCalculator(Player.getDmgModifier())){
                  System.out.println("You hit the foul beast!");
                  this.enemyHealth -= 2;
                  if(enemyHealth <= 0) {
                     this.encounterOver = true;
                     System.out.printf("The beast has been conquered! You survive to live another day!%n");
                     break;
                  }
                  
               } else {
                  System.out.println("You swing and miss!");
               }
               break;
            case 2:
               System.out.println("You try to flee from the monster...");
               if(Application.probabilityCalculator(0.25)){
                  System.out.println("You get away!");
                  this.enemyHealth -= 99;
                  this.encounterOver = true;
               } else {
                  System.out.println("You trip and fall unable to flee.");
               }
               break;
            default: 
               System.out.println("You don't do much of anything!");
         }
         Application.transition(250);
         //monster turn
         if(this.enemyHealth > 0) {
            
            if(Application.probabilityCalculator(0.75 - Player.getDefModifier())){
                  System.out.println(this.enemyLines[rand.nextInt(3)]);
                  Application.transition(250);
                  Player.setHealth(-2);
                  if(Player.getHealth() <= 0) {
                     this.encounterOver = true;
                     Player.setAlive(false);
                     break;
                     }
            } else {
               System.out.println("The monster lunges at you, but misses!");
               Application.transition(250);
            }

         }
      }   
   }
}
