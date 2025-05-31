//**************************************************
//    Music.java           Author: Fiona Fung
//
//    background music for Fin & Breakfast
//**************************************************

import javax.sound.sampled.*; // audio
import java.io.*; // read & write data

public class Music 
{
   Long currentFrame; // stores current position
   Clip clip;
   AudioInputStream audioInputStream;
   static String filePath = "bgMusic.mp3";
   
   public Music() // initialize clip, stream
   throws UnsupportedAudioFileException,IOException,LineUnavailableException // might throw exceptions
   {
      // create AudioInputStream object
         // AudioSystem: access mixers (audio device with multiple lines), converting audio data
      audioInputStream = AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
      // clip reference
      clip = AudioSystem.getClip();
      // open audioInputStream to the clip
      clip.open(audioInputStream);
      // music loops
      clip.loop(Clip.LOOP_CONTINUOUSLY);
   
   }
   
   // play audio (starts when game begins) 
   public void play()
   {
      clip.start();
   }
   // pause audio
   public void pause()
   {
      this.currentFrame = this.clip.getMicrosecondPosition(); // remember space in audio
      clip.stop();
   }
   // resume audio
   public void resume()
   throws UnsupportedAudioFileException,IOException,LineUnavailableException
   {
      clip.close();
      resetAudioStream(); // audiostream resets before it can be played again
      clip.setMicrosecondPosition(currentFrame); 
      this.play();
   }
}