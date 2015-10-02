package GUIModule;

import processing.core.PApplet;
import processing.core.PImage;

public class SunClock extends PApplet {
	PImage img;
	
	public void setup()
	{
		// Setup code for Sunclock
	   size(450, 450); // set the canvas size
	   background(255); // set the canvas color
	   stroke(0); // set the pen color
	   img = loadImage("https://s3-us-west-2.amazonaws.com/iliassblogimages/19-bullshit-I-smell-yoda-meme.png", "png");
	   img.resize(0,height); // resize loaded image
	   image(img, 0, 0); // display image
	}
	
	public void draw(){
		// Drawing method for SunClock
		int[] color = sunColorSec(second());  // calculate color for sun based on seconds
		fill(color[0], color[1], color[2]); // filling the ellipse
		ellipse(width/4,height/5, width/4, height/5); //draw sun
	}

	public int[] sunColorSec(float seconds)
	{
		int[] rgb = new int[3];
		float diffFrom30 = Math.abs(30-seconds);
		
		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;
		
		return rgb;
	}
	
	public static void main(String[] args){
		
	}
}
