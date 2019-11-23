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
   int randomEnemy = 1;
   boolean encounterOver = false;
   static Scanner input = new Scanner(System.in);
   
   public Battle() {
      //this.randomEnemy = rand.nextInt(3) + 1;
      
      if(randomEnemy == 1) { //vampire enemy
         System.out.println();
         GraphicsHandler.printGraphics(4);
         System.out.println("           A vampire appears!");
         this.enemyHealth = 5;
         enemyLines[0] = "The vampire bites you with its fangs!";
         enemyLines[1] = "The vampire slashes you with a dagger!";
         enemyLines[2] = "The vampire summons bats to attack!";
      } else if (randomEnemy == 2) {
      
      } else if (randomEnemy == 3) {
      
      }
      
      while(!this.encounterOver) {
         //player turn
         GraphicsHandler.printGraphics(3);
         System.out.println(this.enemyHealth);
         switch(input.nextInt()){
            case 1: 
               if(Application.probabilityCalculator(0.75)){
                  System.out.println("You hit the foul beast!");
                  this.enemyHealth -= 2;
                  if(enemyHealth <= 0) {
                     this.encounterOver = true;
                     break;
                     }
                  }
                else {
                  System.out.println("You swing and miss");
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
         
         //monster turn
         if(this.enemyHealth > 0) {
            
            if(Application.probabilityCalculator(0.75)){
                  System.out.println(this.enemyLines[rand.nextInt(3)]);
                  Player.setHealth(-2);
                  if(Player.getHealth() <= 0) {
                     this.encounterOver = true;
                     Player.setAlive(false);
                     break;
                     }
            } else {
               System.out.println("The monster lunges at you but misses!");
            }

         }
      }   
   }
}
