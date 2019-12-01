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
   for(int i = 0; i < 3; i++){
      //room introduction section
      System.out.println("You progress to the next room and find...");
      roomDescriptions[0] = "A long hallway with a valuted ceiling sporting war memorobilia on each of the hallways walls.";
      roomDescriptions[1] = "A dirty, small, partially caved in, former maids quarters.";
      roomDescriptions[2] = "One of many of the guest rooms in the old castle.";
      roomDescriptions[3] = "The old lords personal study, judging with how many self portraits are around he really loved himself.";
      roomDescriptions[4] = "An old mead storage room, you are surrounded by aging barrels, and blood.";
      System.out.print(roomDescriptions[rand.nextInt(5)]);
      Application.transition(2000);
      
      //random-event-chooser-9000
      if (Application.probabilityCalculator(0.20)) { //chest 20%
         System.out.println("\nYou find a chest!");
         Chest.GenerateChest();
      } else if (Application.probabilityCalculator(0.50)) { //scenario 50% (if no chest)
        Encounters.Encounter();
      }
      else { //battle 50%
         System.out.println("\nA foe appears before you!");
         battleInstances[i] = new Battle();
      }
      if(!Player.getAlive()){
         break;
      }
   }
   
      if(!Player.getAlive()) {
         GraphicsHandler.printGraphics(3);
         System.out.println("Another hero has vanished in the halls of the manor...");
      }else {
         System.out.println("As you get to the top of the manor's spire you see a view of the valley you have saved...");
         Application.transition(1000);
         GraphicsHandler.printGraphics(4);
         Application.transition(1000);
         GraphicsHandler.printGraphics(5);
      }
   }
   
   //Methods



}