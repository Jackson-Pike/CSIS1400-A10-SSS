/**********************************************/
/*
**
**
*/
/*********************************************/
public class Player
{
   String name;
   int health = 10;
   int speed = 10; 
   
   public void setName(String n)
   {
      name = n;
   }
   public String getName()
   {
      return name;
   }
   public void setHealth(int h)
   {
      health = h;
   }
   public int getHealth()
   {
      return health;
   }
   public void setSpeed(int s)
   {
      speed = s;
   }
   public int getSpeed()
   {
      return speed;
   }
}
