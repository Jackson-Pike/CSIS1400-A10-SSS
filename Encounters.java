/*
Michal Johnson
Encounter Section

What we have is a randomiser that is a random number 0-5. Once that number is picked, there are 5 different encounters that can happen. 
That is chosen, (due to the randomiser) and that one plays out. 

The speed option has been commeted out. Deciding to keep or remove. 

=====WHAT IS MISSING:
How to start the next room, after the encounter is over. 
Battle.getMagicDmg doesn't work
Player.getSwrodDmg doesn't work 
Removing player health. 
*/
import java.util.Scanner;
import java.util.Random;

public class Encounters {
      
   public static void Encounter() {
      Scanner input = new Scanner(System.in); //Find a way to not repeat these each bloody time. 
      Random rand =  new Random();
      
      System.out.println("Encounter Time! ");
      int deciderEncounter = rand.nextInt(6);
//=================================================First encounter===========================================================
      if(deciderEncounter == 0) {
         System.out.println("Webs!  Casually, you reach up to brush away some webs...");
         System.out.println("But they won't brush away! They cling to you!"); 
         //Choice time
         // System.out.println("(1) Use speed to run out of the webs! (Required speed xx)");
         System.out.println("(2) Magic! Burn the webs! (Required magic 3)");
         System.out.println("(0) Do nothing. Sucks for you.");
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
//          if(choice ==1) { //Giving choice to user to choose the outcome. 
//             if(Player.getSpeed() > 1) {
//                System.out.println("You were fast enough to break free!");
//                
//             }
//             else {
//                System.out.println("Oof... you arn't fast enough for that. Gotta take some health now.");
//                //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
//             }
//          }
       
         if(choice ==2) {
            if(Player.getMagicDmg() > 2) {
               System.out.println(" Kill them with HOLY FIRE! The webs burn");
                  
            }
            else {
               System.out.println("That feels bad, You're not good enough with your magic to do that. Gotta take some health now.");
              // Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
               
            }
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         }
            //Creating a 1second Timer
            try{
               Thread.sleep(1000);//2000ms = 2s
            }catch(InterruptedException ex){}  //Yes you need these '{}' don't delete
         
      //SIGNAL NEXT ROOM  
      }
//==================================================Encounter 2====================================================================
      if(deciderEncounter == 1) {
         System.out.println("Something Slimy? What’s around your ankle? A bug? A tentacle? A dead hand crawling!");
         //Choice time. 
         //System.out.println("(1) Use speed to run out of the room screaming! (Required speed xx)");//Add the speed and magic require
         System.out.println("(2) Use Sword to kill the slimy thing! (Require Sword Dmg 3)");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         // if(choice==1) {
//             if(Player.getSpeed() > 1) {
//                System.out.println("You Run away screeming like a little girl. But! You get away");
//                
//             }
//             else {
//                System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
//                //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
//             }
//          }
         
         if(choice==2) {
            if(Player.getSwordDmg() > 2) {
               System.out.println("You swing... and swing.... and swing... finally it dies");
               
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         } 
            //Creating a 1 second Timer
            try{
               Thread.sleep(1000);//2000ms = 2s
            }catch(InterruptedException ex){}  //Yes you need these '{}' don't delete
      //SIGNAL NEXT ROOM  
      }
//==============================================Encounter 3=================================================================
    if(deciderEncounter == 3) {
         System.out.println("Silence. Underground, everything goes silent. Even the sound of breathing has vanished.");
         //Choice time. 
         System.out.println("(1) Magic remove this wretched curse! (Required Magic 3)");//Add the speed and magic require
         //System.out.println("(2) Use speed to run out of the room screaming! (Required speed xx)");
         System.out.println("(3) Explore! Why not? What's the worst that can happen?");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         if(choice==1) {
            if(Player.getMagicDmg() > 2) {
               System.out.println("You you successfully remove the curse! Next Room!");
               
            }
            else {
               System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
               //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
            }
         }
        //  if(choice==2) {
//             if(Player.getSpeed() > 1) {
//                System.out.println("You rush out of the room! Suddenly all the sound has returned... Freaky.");
//                 
//             }
//             else {
//                System.out.println("Looks like you didn't make it. Sorry. Minus Hitpoints!");
//                //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
//             }
//          }
         if(choice==3) {
            System.out.println("it’s so quiet you lose your sanity! Ohh Noo!!! -xx health");
            //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         }
         else {
            System.out.println("due to your incompetents in choosing a valid responce, you lose health.");//IS IT COOL LEAVING THIS?
            //Player.setPlayerHealth(Player.getPlayerHealth()xx); //Taking heath from player. 
         } 
            //Creating a 1 second Timer
            try{
               Thread.sleep(1000);//2000ms = 2s
            }catch(InterruptedException ex){}  //Yes you need these '{}' don't delete
      //SIGNAL NEXT ROOM  
      }
//=================================================Encounter 4=============================================================
      if(deciderEncounter ==4) {
         System.out.println("The walls of this room are damp with blood. The blood drips from the ceiling, down the walls,");
         System.out.println("over the furniture, and onto your shoes. In a blink, it is gone.");
         //Choice Time
         System.out.println("(1) Magic, shine some light! (require magic 4");
         System.out.println("(0) Use Sanity!");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
         if(choice ==1) {
            if(Player.getMagicDmg() > 3) {
               System.out.println("light emerges from your chest. Go figure that's what would happen.");
               System.out.println("You Can See! You come to the conclusion you were just seeing things");
               //SINGAL NEXT ROOM
            }
            else {
               System.out.println("Your chest glows slightly....");
                  //Creating a 2 second Timer
                  try{
                     Thread.sleep(2000);//2000ms = 2s
                  }catch(InterruptedException ex){}  //Yes you need these '{}' don't delete
               System.out.println("....Creepy");
            }
         }
         else{
            System.out.println("Sanity? Really? Common. That doesn't exist in this game!");
         }
      }
//=================================================Encounter 5=============================================================
      if(deciderEncounter ==5) {
         System.out.println("a breeze chills the room. Before you, three men hang from frayed ropes. ");
         System.out.println("They stare at you with cold, dead eyes. The trio swing silently, ");
         Systme.out.println("then fade into dust that falls to the ground.");
         //Choice Time
         System.out.println("(1) Magic, Burn!! (Require magic 2)");
         System.out.println("(0) ");
         
         int choice = input.nextInt();
         System.out.print("What is your choice?: ");
         
            if(choice ==1) {
            if(Player.getMagicDmg() > 2) {
               System.out.println("You say \"Yeah... No, Burn the entire thing\" with that, the enire room catches on fire. ");
               System.out.println("");
               //SINGAL NEXT ROOM
            }
            //Not finnished. yet. 
            else {
               System.out.println("Really? Nothing? Your soul must be mush to not react to that.");
            }
         }
      
   }//Encounter class closer

}
}