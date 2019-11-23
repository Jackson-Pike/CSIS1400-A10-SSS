/********************************
** A10 - Team Assignment - GraphicsHandler
** Author: Austin
** Class Description: Handles Graphics
********************************/
public class GraphicsHandler
{
   public static void printGraphics(int graphicsNum) {
   
      if(graphicsNum == 1) {
         //Graphics 1: Title Splash
         //  - Used in Application.java startScreen()
         String[] titleSplash = new String[5];
         titleSplash[0] = "*----------------------------*";
         titleSplash[1] = "|      Dungeon Masters       |";
         titleSplash[2] = "|      a CSIS1400 Game       |";
         titleSplash[3] = "|                            |";
         titleSplash[4] = "*----------------------------*";
      
         for(int i = 0; i < titleSplash.length; i++) {
            System.out.println(titleSplash[i]);
         }
      }
   }
   
}