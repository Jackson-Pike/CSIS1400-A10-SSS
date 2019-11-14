/*
Michal Johnson
Final Story Section
*/
import java.util.Scanner;
import java.util.Random;

public class StoriesCreater {
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand =  new Random();
      
      int decider = rand.nextInt(10);
      
      if(decider <= 4) {
         Stories();
      }
      
      if(decider >= 5) {
         Encounter();
      }
      
   }
   public static void Stories() {
      Scanner input = new Scanner(System.in); //Find a way to not repeat these each bloody time. 
      Random rand =  new Random();
      
      System.out.println("Story");
      int deciderStory = rand.nextInt(6);
      
      if(deciderStory == 0) {
         System.out.println("Webs!  Casually, you reach up to brush away some webs...");
         System.out.println("But they won't brush away! They cling to you!"); 
         //Choice time
         System.out.println("(1) Use speed to run out of the webs! (Required speed xx)");//Add the speed and magic require
         System.out.println("(2) Magic! Burn the webs! (Required magic xx)");
         System.out.println("(0) Do nothing. Sucks for you.");
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         if(choice ==1) { //Giving choice to user to choose the outcome. 
            if(Player.getMovementSpeed() > xx) {
               System.out.println("You were fast enough to break free!");
               
            }
            else {
               System.out.println("Oof... you arn't fast enough for that. Gotta take some health now.");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
       
         
         if(choice ==2) {
            if(Battle.getMagicDmg() > xx) {
               System.out.println(" Kill them with HOLY FIRE! The webs burn");
                  
            }
            else {
               System.out.println("That feels bad, You're not good enough with your magic to do that. Gotta take some health now.");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
               
            }
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         }
      //SIGNAL NEXT ROOM  
      }
      
      if(deciderStory == 1) {
         System.out.println("Something Slimy? What’s around your ankle? A bug? A tentacle? A dead hand crawling!");
         //Choice time. 
         System.out.println("(1) Use speed to run out of the room screaming! (Required speed xx)");//Add the speed and magic require
         System.out.println("(2) Use Sword to kill the slimy thing! (Require Sword Dmg xx)");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         if(choice==1) {
            if(Player.getMovementSpeed() > xx) {
               System.out.println("You Run away screeming like a little girl. But! You get away");
               
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
         
         if(choice==2) {
            if(Player.getSwordDmg() > xx) {
               System.out.println("You swing... and swing.... and swing... finally it dies");
               
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         } 
      //SIGNAL NEXT ROOM  
      }
    if(deciderStory == 3) {
         System.out.println("Silence. Underground, everything goes silent. Even the sound of breathing has vanished.");
         //Choice time. 
         System.out.println("(1) Magic remove this wretched curse! (Required Magic xx)");//Add the speed and magic require
         System.out.println("(2) Use speed to run out of the room screaming! (Required speed xx)");
         System.out.println("(3) Explore! Why not? What's the worst that can happen?");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         if(choice==1) {
            if(Battle.getMagicDmg() > xx) {
               System.out.println("You you successfully remove the curse! Next Room!");
               / 
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
         
         if(choice==2) {
            if(Player.getMovementSpeed() > xx) {
               System.out.println("You rush out of the room! Suddenly all the sound has returned... Freaky.");
                
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
         if(choice==3) {
            System.out.println("it’s so quiet you lose your sanity! Ohh Noo!!! -xx health");
            Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         } 
      //SIGNAL NEXT ROOM  
      }

    
      
   }//class closing bracket
   
   public static void Encounter() {
      Scanner input = new Scanner(System.in);
      Random rand =  new Random();
      System.out.println("Encoutner");
   }
}