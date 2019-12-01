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
         Application.transition(1000);
         //Choose what option you would like to take. 
         System.out.println("(1) Use magic to burn the webs.");
         System.out.println("(0) Do nothing. Sucks for you.");
         
         System.out.print("What is your choice?: ");
         int choice = input.nextInt();
         System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
         if(choice ==1) {
            if(Player.getMagic() >= 4) {
               System.out.println("You use your spells to burn the webs.\n");    
            }
            
            else {
               System.out.println("With your inexperience in magic you accidentally burn yourself."); 
               //Removing player health here. 
               Player.setHealth(-1);
               System.out.printf("New Health: %d%n",Player.getHealth());        
            }
         }
         //Fall back option. Just going to start the next room. 
         else {
            System.out.println("Your hesitation causes you to trip and fall taking damage!");
            Player.setHealth(-1);
         }
         Application.transition(500); //Timer till next thing starts 
         System.out.println("");
      }
//==================================================Encounter 2====================================================================
      if(deciderEncounter == 1) {
         System.out.println("Something Slimy? What is around your ankle? A bug? A tentacle? A dead hand crawling!");
         Application.transition(1000);
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
               System.out.print("You swing... and swing.... and swing... finally it dies. \n");   
            }
            
            else{
               System.out.println("Swing! Swing the sword! But it does not die. Whatever this is, it is not affected!");
               System.out.println("Run away! To the next room!\n");
            }
         }
         //Fall back, backup option. 
        else {
            System.out.println("Looks like the thing still lives. You run away to avoid having it touch you again.");
            System.out.println("As you are running you hit your your toe on the door. Ouch!");     
            Player.setHealth(-1);
            System.out.printf("New Health: %d%n",Player.getHealth());   
         }
    
         Application.transition(1000);
         System.out.println("");
      }
//==============================================Encounter 3=================================================================
       if(deciderEncounter == 2) {
            System.out.println("Silence. Underground, everything goes silent. Even the sound of breathing has vanished.");
            Application.transition(1000);
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
                  System.out.println("You you successfully remove the curse! You move to the next room.\n"); 
               }
               else {
                  System.out.println("The curse is messing with your head! Your memories! Thoughts!");
                  System.out.println("Sumbling around the room, trying to get your berrings you are able to find the door.\n");     
               }
            }
            
            if(choice==2) {
               System.out.println("it's so quiet you lose your sanity!");
               System.out.println("Nothing is found. Nothing is here. It is just quite. \n");
            }
       
         }
//=================================================Encounter 4=============================================================
         if(deciderEncounter ==3) {
            System.out.println("The walls of this room hold horrid sights of flesh and other worlds.");
            System.out.println("Suddenly, a breeze puts out the candles and plunges the room into darkness.");
            Application.transition(500);
            //Choose what option you would like to take. 
            System.out.println("(1) Use a spell to cast light upon the room (4 Magic Required).");
            System.out.println("(0) Navigate the room within the dark.");
            
            System.out.print("What is your choice?: ");
            int choice = input.nextInt();
            System.out.println("");
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
            if(choice ==1) {
               if(Player.getMagic() >= 4) {
                  System.out.println("A ball of light emerges from your hands lighting up the room.");
                  System.out.println("You Can See! You come to the conclusion you were just seeing things.\n");
               }
               
               else {
                  System.out.println("Your inexperience in magic forces you to go without, you run through the room.");
                  System.out.println("The trauma reduces your life force.\n");  
                  Player.setHealth(-1);
                  Application.transition(500);  
                  System.out.printf("New Health: %d",Player.getHealth());  
                     

               }
            }
            else{
               System.out.println("The sounds you hear and the things you feel terrify you as your stubmle into the next room.");
               System.out.println("The trauma reduces your life force.\n");  
               Player.setHealth(-1);
            }
            Application.transition(1000);
            System.out.println("");
         }
//=================================================Encounter 5=============================================================
         if(deciderEncounter ==4) {
            System.out.println("A breeze chills the room. Before you, three enchanted skeletons hang from ropes clawing at you.");
            System.out.println("This disturbing sight sends chills down your spine.");
            System.out.println("");
            //Choose what option you would like to take. 
            System.out.println("(1) Use magic to burn the skeletons.");
            System.out.println("(0) Nothing. Leave it.");
            
            System.out.print("What is your choice?: ");
            int choice = input.nextInt();
            System.out.println("");
            
         //User picks their choice, here are the differnt options. 
         //This is baised on probability rather than Characters skill
               if(choice ==1) {
               
                  if(Application.probabilityCalculator(0.65)) {
                     System.out.println("You say \"Yeah... No, Burn the entire thing\" with that, the enire room catches on fire. \n");
                  }
                  else {
                     System.out.println("You try to burn the skeletons but the fright gets to you, so you run.\n");
                  }
               }//closing if choice == 1
            else {
               System.out.println("Really? Nothing? Your heart and soul must be mush to not react to that.\n");
            }
         Application.transition(1000);   
         System.out.println("");   
      }//closing encounter 5
   }//closing all of encounter class
}
