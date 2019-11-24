/********************************
** A10 - Team Assignment - Player
** Author: Amrit, Austin
** Class Description: contains data on user's player, static methods because there is only one player
********************************/
public class Player
{
   static String name;
   static int health = 1; 
   static int magic = 0; 
   static double dmgModifier = 1.0;
   static double defModifier = 1.0;
   static boolean isAlive = true;
  
   
   //name
   public static void setName(String n)
   {
      name = n;
   }
   public static String getName()
   {
      return name;
   }
   
   //health
   public static void setHealth(int playerHealth)
   {
      //to increase health put positive int for h, if decrease health pass negative num
      health += playerHealth;
   }
   public static int getHealth()
   {
      return health;
   }
   
   //magic
   public static void setMagic(int m)
   {
      magic += m;
   }
   public static int getMagic()
   {
      return magic;
   }
   
   //damage modifier
   public static void setDmgModifier(double dm) {
      dmgModifier += dm;
   }
   public static double getDmgModifier() {
      return dmgModifier;
   }
   
   //defense modifier
   public static void setDefModifier(double def) {
      defModifier += def;
   }
   public static double getDefModifier() {
      return defModifier;
   }
   
   //player is alive
   public static void setAlive(boolean b) {
      isAlive = b;
   }
   public static boolean getAlive(){
      return isAlive;
   }
}
