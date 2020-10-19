package net.furkanO1.main;

import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Player {

	/*
	 * Play from file: playFromFile(new File("test.wav"));
	 */
	public static void playFromFile(File filename)
	{
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(filename));
			clip.start();
	    }
	    catch (Exception exc) {
	        exc.printStackTrace();
	    }
	}
	
	/*
	 * Play from url: playFromWeb("https://xxxx.com/test.wav");
	 */
	public static void playFromWeb(String url)
	{
		try {
        	URL url1 = new URL(url);
            Clip clip = AudioSystem.getClip();
            AudioInputStream ais = AudioSystem.getAudioInputStream(url1);
            clip.open(ais);
            clip.start();
		}
	    catch (Exception exc) {
	        exc.printStackTrace();
	    }
	}
	
}
