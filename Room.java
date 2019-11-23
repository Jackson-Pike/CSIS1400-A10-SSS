/********************************
** A10 - Team Assignment - Room
** Author: Austin
** Class Description: Handles room generation
********************************/
import java.util.Random;
public class Room {

   // Fields
   Random rand = new Random();
   String[] roomDescriptions = new String[5];
   
   
   // Constructors
   public Room() {
      //room introduction section
      System.out.println("You enter to find...");
      roomDescriptions[0] = "A long hallway with a valuted ceiling sporting war memorobilia on each of the hallways walls.";
      roomDescriptions[1] = "A dirty, small, partially caved in, former maids quarters.";
      roomDescriptions[2] = "One of many of the guest rooms in the old castle.";
      roomDescriptions[3] = "The old lords personal study, judging with how many self portraits are around he really loved himself.";
      roomDescriptions[4] = "An old mead storage room, you are surrounded by aging barrels, and blood.";
      System.out.println(roomDescriptions[rand.nextInt(5)]);
      
      //random-event-chooser-9000
      if (Application.probabilityCalculator(0.20)) { //chest 20%
         System.out.println("\nYou find a chest!");
         Chest.GenerateChest();
      } else if (Application.probabilityCalculator(0.50)) { //scenario 50% (if no chest)
        System.out.println("\nsomething happens");
        //Encounters.Encounter();
      }
      else { //battle 50%
         System.out.println("\nA foe appears before you!");
      }
      
   }
   
   //Methods



}