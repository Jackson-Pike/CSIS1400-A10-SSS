/*****************************************
* Author : Austin Fashimpaur
* Date : 11/14/2019
* Assignment: Magic
******************************************/
public class Magic {
   //Still a work in progress until I can see the rest of the
   //groups code 11/16/2019
   
   // Fields
   
   
   // Constructors
   
   
   //Methods
      //setters
   public static void setHealthSpell(int health) {
      Player.setPlayerHealth(health);
      //message handler?
   }
   
   public static void setDamageBuffSpell(int damage) {
      //go to player and set damage buff
   }
   
   public static void setDefenseBuff(int defBuff) {
      //go to player and set defense buff
   }
   
   public static void setMovementSpell(int moveSpell) {
      Player.getMovementSpeed(moveSpell);
      //message handler?
   }
}