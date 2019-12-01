/********************************
** A10 - Team Assignment - Chest
** Author: Austin Fashimpaur
** Class Description: Has a static method that can be called when a chest is found.
********************************/
import java.util.Scanner; //Remove before submission
import java.util.Random;

public class Chest {
   //Fields
   static Random rand = new Random();
   static Scanner input = new Scanner(System.in);
   
   //Methods
   public static void GenerateChest() {
               switch(rand.nextInt(4)) {
                  case 0:
                     //health +2
                     System.out.println("You find a mysterious turkey that restores you! (+2 HP)");
                     Player.setHealth(2);
                     System.out.println(Player.getName() + "'s new health: " + Player.getHealth() + "\n");
                     break;
                  case 1:
                     //magic +2
                     System.out.println("You find an old arcane spellbook, you learn a few new tricks (+2 Magic)");
                     Player.setMagic(2);
                     System.out.println(Player.getName() + "'s new magic level: " + Player.getMagic() + "\n");
                     break;
                  case 2:
                     //Damage modifier
                     System.out.println("You find a potion that increases your strength!");
                     Player.setDmgModifier(0.25);
                     System.out.println(Player.getName() + "'s new dmgModifier: " + Player.getDmgModifier() + "\n");
                     break;
                  case 3:
                     //Defense modifier
                     System.out.println("You find a royal chestplate, this will help you live through this!");
                     Player.setDefModifier(0.25);
                     System.out.println(Player.getName() + "'s new defModifier: " + Player.getDefModifier() + "\n");
                     break;
                  default:
                     break;
                     
               }
               
               System.out.println("Click any button to continue...");
               input.nextLine();
            
          
      }
}