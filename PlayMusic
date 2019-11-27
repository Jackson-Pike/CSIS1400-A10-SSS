import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;


public class PlayMusic
{
   public static void main(String[] args)
   {
      playMusic("C:\\Users\\Owner\\Downloads\\Game of Thrones.wav");
   }
   
   public static void playMusic(String FilePath)
   {
      
      InputStream music;
      try
      {
         music = new FileInputStream(new File(FilePath));
         AudioStream audios = new AudioStream(music);
         AudioPlayer.player.start(audios);
      }
      catch(Exception e)
      {
         JOptionPane.showMessageDialog(null, "Audio not found");
      }
   }
}
