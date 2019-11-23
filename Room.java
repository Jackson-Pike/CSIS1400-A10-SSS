/********************************
** A10 - Team Assignment - Room
** Author: Austin
** Class Description: Handles room generation
********************************/
import java.util.Random;
import java.util.Arrays;
public class Room {

   // Fields
   static Random rand = new Random();
   static String[] roomDescriptions = new String[5];
   static Battle[] battleInstances = new Battle[3];
   
   
   // Constructors
   public static void generateRooms() {
   //add for loop here for multiple rooms.
      int i = 0;
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
         battleInstances[i] = new Battle();
      }
      
   }
   
   //Methods



}