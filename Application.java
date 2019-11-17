/********************************
** A10 - Team Assignment - Main Application Class
** Project Description: 
********************************/

import java.util.Scanner;
public class GameApp
{
   public static void main(String[] args)
   {
      int destruction1, destruction2;
      Scanner input = new Scanner(System.in);
      Player p1 = new Player();
      p1.health = 10;
      
      BadGuy p2 = new BadGuy();
      p2.health = 10;
      
      Battle sword = new Battle();
      sword.swordDmg = 0;
      
      Battle sword1 = new Battle();
      sword1.swordDmg = 0;
      
      System.out.println("P1 set your name: ");
      String p1Name = input.nextLine();
      p1.setName(p1Name);
      
      System.out.println("P2 set your name: ");
      String p2Name = input.nextLine();
      p2.setName(p2Name);
      
      System.out.println(p1.getName() +" set your sword name: ");
      String swordName = input.nextLine();
      sword.setName(swordName);
      
      System.out.println(p2.getName() +" set your sword name: ");
      String sword1Name = input.nextLine();
      sword1.setName(sword1Name);
      
      
      while(p1.health > 0 && p2.health > 0)
      {
         System.out.println(p1.getName() + " your health level is " +p1.health);
         System.out.println(p1.getName() + " raise your health level");
         
         System.out.println(p2.getName() + " your health level is " +p2.health);
         System.out.println(p2.getName() + " raise your health level");
         
         if(sword.swordDmg == 10 || sword1.swordDmg == 10)
            break;
          System.out.println(p1.getName() + " How much sword power you wanna use(less than 10)?");
          destruction1 = input.nextInt();
          sword.swordDmg = sword.swordDmg + destruction1;
          
          
          System.out.println(p2.getName() + " How much sword power you wanna use(less than 10)?");
          destruction2 = input.nextInt();
          sword1.swordDmg = sword1.swordDmg + destruction2;
          if(destruction1 > destruction2)
          {
            p2.health = p2.health - (destruction1 - destruction2); 
            System.out.println(p2.getName() +" Health affected");
            System.out.println(p1.getName() +" More sword damage than "+ p2.getName());
            System.out.println(p1.getName() +" No Health affected");
          }
          else if(destruction2 > destruction1)
          {
            p1.health = p1.health - (destruction2 - destruction1);
            System.out.println(p1.getName() +" Health affected");
            System.out.println(p2.getName() +" More sword damage than "+ p1.getName());
            System.out.println(p2.getName() +" No Health affected");
          }
          
          else
          {
            System.out.println("Same destruction");
          }
          
          
          
         // int p1NewHealth = input.nextInt();
        //  p1.setHealth(p1NewHealth);
      }
      System.out.println("Game over");
      if(p1.health > 0 && sword.swordDmg < 10)
      {
         System.out.println(p1.getName() + " won");
      }
      else if(p2.health > 0 && sword1.swordDmg < 10)
      {
         System.out.println(p2.getName() + " won");
      }
      else
         System.out.println("game draw");
   }
}
