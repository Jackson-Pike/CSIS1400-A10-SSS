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
      
         for(String el:titleSplash) {
            System.out.println(el);
         }
      }
      
      if(graphicsNum == 2) {
         //Graphics 2: Castle
         // -Used in Application.java startScreen()
         String[] castleSprite = new String[19];
         castleSprite[0] = ":::::::::::::::::::::::::::::::::::::::::::::::::::::::";
         castleSprite[1] = ":::::::::::::::::::::::::::::::::::::::::::::::::::::::";
         castleSprite[2] = "::::::::::::::::::::::::::_:_:_:_|_::::::::::::::::::::";
         castleSprite[3] = "::::::::::::::::::::::::::]-I-I-I-[::::::::::::::::::::";
         castleSprite[4] = "::::::`      `::::::::::::\\_,_,_,_/::::::::::::::::::::";
         castleSprite[5] = "::::/          \\:::::::::::|     |:::::::::::::::::::::";
         castleSprite[6] = ":::::          ::::::::::::|  _  |:-_-_-_-:::::|II>::::";
         castleSprite[7] = "::::\\          /:::-_-_-_-:| / \\ |:\\-.-.-/:::::I:::::::";
         castleSprite[8] = "::::::._    _.:::::\\_,,_,/:| |_| |::|   |:::::/ \\::::::";
         castleSprite[9] = "::::::::::::::::::::|   ]::|     |/\\|   |::::/___\\:::::";
         castleSprite[10] = "::::::::::::::::::::[ []|::|     ,... /\\|:::::| |::::::";
         castleSprite[11] = ":::::::::::|II>:::::|   |__|    u|::| |||::::_| |::::::";
         castleSprite[12] = ":::::::::::I::::::::|[] ,--.  u  |::|   |::_- ,.:::::::";
         castleSprite[13] = "::::::::::/ \\:::::::[   |::|u    |::|   |_-   |::::::::";
         castleSprite[14] = ":::::::::/___\\::::|      |:|    _||||_   \\    |::::::::";
         castleSprite[15] = "::::::::::| |:^:^:|      |/     - '' -          _\\:::::";
         castleSprite[16] = ":::::::::::.,   ___          ,----' \\       _/]/:::::::";
         castleSprite[17] = "::~:~:~:~~~::~~~~~~~:~~~~~~~:~~~~:~~~~:~~~~~:~~:~~::~::";
         castleSprite[18] = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~::";
         
         for(String el:castleSprite) {
            System.out.println(el);
         }
      }
      
      if(graphicsNum == 3) {
         String[] combatConsole = new String[6];
         combatConsole[0] = "*-----------------------------*";
         combatConsole[1] = "|    What do you try to do?   |";
         combatConsole[2] = "| (1) Swing Sword    (2) Flee |";
         combatConsole[3] = "|                             |";
         combatConsole[4] = "| Your health: " + Player.getHealth() + "              |";
         combatConsole[5] = "*-----------------------------*";
         
         for(String el:combatConsole) {
            System.out.println(el);
         }
      }
      
      if(graphicsNum == 4){
         //Graphics 4: Vampire
         // -Used in Battle.java as an enemy choice
         String[] vampireSprite = new String[16];
         vampireSprite[0] = "              __.......__";
         vampireSprite[1] = "            .-:::::::::::::-.";
         vampireSprite[2] = "          .:::''':::::::''':::.";
         vampireSprite[3] = "        .:::'     `:::'     `:::. ";
         vampireSprite[4] = "   .'\\  ::'   ^^^  `:'  ^^^   '::  /`.";
         vampireSprite[5] = "  :   \\ ::   _.__       __._   :: /   ;";
         vampireSprite[6] = " :     \\`: .' ___\\     /___ `. :'/     ; ";
         vampireSprite[7] = ":       /\\   (_|_)\\   /(_|_)   /\\       ;";
         vampireSprite[8] = ":      / .\\   __.' ) ( `.__   /. \\      ;";
         vampireSprite[9] = ":      \\ (        {   }        ) /      ; ";
         vampireSprite[10] = " :      `-(     .  ^\"^  .     )-'      ;";
         vampireSprite[11] = "  `.       \\  .'<`-._.-'>'.  /       .'";
         vampireSprite[12] = "    `.      \\    \\;`.';/    /      .'";
         vampireSprite[13] = "      `._    `-._       _.-'    _.'";
         vampireSprite[14] = "       .'`-.__ .'`-._.-'`. __.-'`.";
         vampireSprite[15] = "     .'       `.         .'       `.";
         
         for(String el:vampireSprite) {
            System.out.println(el);
         }
      }
      if(graphicsNum == 6) {
         String[] dragonSprite = new String[20];
         dragonSprite[0] = "                                              _        _";
         dragonSprite[1] = "                                  _.-'/   _.:'`/";
         dragonSprite[2] = "                               ,'`   ( ,:;.-'`(";
         dragonSprite[3] = "                             .'      .:'`      \\";
         dragonSprite[4] = "                            /       //    _.-';)";
         dragonSprite[5] = "                          _/      _//_.-;:-'``/";
         dragonSprite[6] = "                   //|    \\      \\  .-'`      \\                                  ,";
         dragonSprite[7] = "                  || /_,-,_|      | `\"\"--..__  \\                  .-'```'-.     )\\ ";
         dragonSprite[8] = "             _.--'_  '-;_/_)_     |(``\"\"'---.;\\\"/-,.-.  _         /  .---.  \\  .'  \\";
         dragonSprite[9] = "            /6    ^`     ':_/     | \\\"-._    .-'../__ )' ',.-. _ |  /     \\  ;/_  _/";
         dragonSprite[10] ="           (`-----`--'.    \\_)    ;|`\\\"-.;-./        `\"\"--;.__) ',-.      (| |  ||";
         dragonSprite[11] ="          __)         {\\   |_/\\   \\    _.'                  `\\\"-;_ )'-,_(`/ ;_.'/";
         dragonSprite[12] ="           /         {=|   |)  \\.-\\\"\\  /                          `'-.;_:'  /_.'";
         dragonSprite[13] ="                     {=|    \\_.'    )) '        /                          /";
         dragonSprite[14] ="                     {=|     ,                 |      ,                _.-'";
         dragonSprite[15] ="                      {=;     `\"\"--.            \\    '.       __,.---'`";
         dragonSprite[16] ="                       {=\\          `\\           '._   '._.-\\\"`";
         dragonSprite[17] ="                 _,.--\\\"`;{\\ '-.._    /        __,..-'-._ '.";
         dragonSprite[18] ="                (((/==)/ _`;.--'\\\"` .'--\"\"\"\"```  .--\\\"```    )";
         dragonSprite[19] ="                 ```  ' (((/====```            ((((/======'";
         dragonSprite[15] ="                      ```                    ```";
      
         for(String el:dragonSprite) {
            System.out.println(el);
         }
      
         
      
      
      }
   }
   
}