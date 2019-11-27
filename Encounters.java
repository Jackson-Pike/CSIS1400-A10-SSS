/*
Michal Johnson
Encounter Section

What we have is a randomiser that is a random number 0-5. Once that number is picked, there are 5 different encounters that can happen. 
That is chosen, (due to the randomiser) and that one plays out. 
If your choice will work is based on probability More than your players skill. 
Like you have an 80% Chance that this will work the way you wanted it to. and if it doesn't another option will happen in it's place. 

Currently this only takes 1 health from player Regardless of what happens to them. 

*/
import java.util.Scanner;
import java.util.Random;

public class Encounters {
      
   public static void Encounter() {
      Scanner input = new Scanner(System.in); //Find a way to not repeat these each bloody time. 
      Random rand =  new Random();
      
      int deciderEncounter = rand.nextInt(5);
      
//=================================================First encounter===========================================================
      if(deciderEncounter == 0) {
         System.out.println("Webs!  Casually, you reach up to brush away some webs...");
         System.out.println("But they wont brush away! They cling to you!"); 
         System.out.println("");
         //Choose what option you would like to take. 
         System.out.println("(1) Magic! Burn the webs!");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         System.out.print("What is your choice?: ");
         int choice = input.nextInt();
         System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
         if(choice ==1) {
            if(Application.probabilityCalculator(0.75)) {
               System.out.println(" Kill them with HOLY FIRE! The webs burn");    
            }
            
            else {
               System.out.println("Luck is not on your side. You fight and fight till you finally get out."); 
               System.out.println("But you have to loose some health. Sorry bud");     
               //Removing player health here. 
               Player.setHealth(-1);
               System.out.printf("New Health: %d",Player.getHealth());        
            }
         }
         //Fall back option. Just going to start the next room. 
         else {
            System.out.println("Well. I guess we start the next room now.");
         }
         Application.transition(1000); //Timer till next thing starts 
         System.out.println("");
      }
//==================================================Encounter 2====================================================================
      if(deciderEncounter == 1) {
         System.out.println("Something Slimy? What is around your ankle? A bug? A tentacle? A dead hand crawling!");
         System.out.println("");
         //Choose what option you would like to take. 
         System.out.println("(1) Use Sword to kill the slimy thing!");
         System.out.println("(0) Do nothing. Sucks for you.");

         
         System.out.print("What is your choice?: ");
         int choice = input.nextInt();
         System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
         if(choice==1) {
         
            if(Application.probabilityCalculator(0.80)) {
               System.out.println("You swing... and swing.... and swing... finally it dies");   
            }
            
            else{
               System.out.println("Swing! Swing the sword! But it does not die. Whatever this is, it is not affected!");
               System.out.println("Run away! To the next room!");
            }
         }
         //Fall back, backup option. 
        else {
            System.out.println("Looks like the thing still lives. You run away to avoid having it touch you again.");
            System.out.println("As you are running you hit your your toe on the door. Ouch!");     
            Player.setHealth(-1);
            System.out.printf("New Health: %d",Player.getHealth());   
         }
    
         Application.transition(1000);
         System.out.println("");
      }
//==============================================Encounter 3=================================================================
       if(deciderEncounter == 2) {
            System.out.println("Silence. Underground, everything goes silent. Even the sound of breathing has vanished.");
            System.out.println("");
            //Choose what option you would like to take.  
            System.out.println("(1) Magic remove this wretched curse!");
            System.out.println("(2) Explore! Why not? What is the worst that can happen?");
            System.out.println("(0) Do nothing. Sucks for you.");
            System.out.print("What is your choice?: ");
            
            int choice = input.nextInt();
            System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
            if(choice==1) {
            
               if(Application.probabilityCalculator(0.60)) {
                  System.out.println("You you successfully remove the curse! Next Room!"); 
               }
               else {
                  System.out.println("The curse is messing with your head! Your memories! Thoughts!");
                  System.out.println("Sumbling around the room, trying to get your berrings you are able to find the door.");     
               }
            }
            
            if(choice==2) {
               System.out.println("it’s so quiet you lose your sanity!");
               System.out.println("Nothing is found. Nothing is here. It is just quite. ");
            }
               
            Application.transition(1000);
            System.out.println(""); 
         }
//=================================================Encounter 4=============================================================
         if(deciderEncounter ==3) {
            System.out.println("The walls of this room are damp with blood. The blood drips from the ceiling, down the walls,");
            System.out.println("over the furniture, and onto your shoes. In a blink, it is gone.");
            System.out.println("");
            //Choose what option you would like to take. 
            System.out.println("(1) Magic, shine some light! (require magic 4");
            System.out.println("(0) Use Sanity!");
            
            System.out.print("What is your choice?: ");
            int choice = input.nextInt();
            System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
            if(choice ==1) {
               if(Application.probabilityCalculator(0.85)) {
                  System.out.println("light emerges from your chest. Go figure that is what would happen.");
                  System.out.println("You Can See! You come to the conclusion you were just seeing things");
               }
               
               else {
                  System.out.println("Your chest glows slightly....Creepy");
                  System.out.println("looking down at your chest you realize that you did not create \"light\" like you thought"); 
                  System.out.println("You lit yourself on fire!");    
                  Player.setHealth(-1);
                  try{ //Creating 1 second Timer
                     Thread.sleep(1000);//2000ms = 2s
                  }catch(InterruptedException ex){}
                  System.out.printf("New Health: %d",Player.getHealth());  
                     

               }
            }
            else{
               System.out.println("Sanity? Really? Common. That does not exist in this game!");
               System.out.println("I guess that is it. next room");
            }
            Application.transition(1000);
            System.out.println("");
         }
//=================================================Encounter 5=============================================================
         if(deciderEncounter ==4) {
            System.out.println("A breeze chills the room. Before you, three men hang from frayed ropes. ");
            System.out.println("They stare at you with cold, dead eyes. The trio swing silently, ");
            System.out.println("then fade into dust that falls to the ground.");
            System.out.println("");
            //Choose what option you would like to take. 
            System.out.println("(1) Magic, Burn!!");
            System.out.println("(0) Nothing. Leave it.");
            
            System.out.print("What is your choice?: ");
            int choice = input.nextInt();
            System.out.println("");
            
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
               if(choice ==1) {
               
                  if(Application.probabilityCalculator(0.65)) {
                     System.out.println("You say \"Yeah... No, Burn the entire thing\" with that, the enire room catches on fire. ");
                     System.out.println("");
                  }
                  else {
                     System.out.println("Being too frightened to burn the room you run out screaming. ");
                  }
               }//closing if choice == 1
            else {
               System.out.println("Really? Nothing? Your heart and soul must be mush to not react to that.");
            }
         Application.transition(1000);   
         System.out.println("");   
      }//closing encounter 5
   }//closing all of encounter class
}
