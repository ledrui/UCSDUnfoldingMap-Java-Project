package GUIModule;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup()
	{
		// Setup code for MyDisplay
		size(400, 400);
		background(200,255,209);
	}
	
	public void draw()
	{
		fill(255, 205, 0);
		ellipse (200, 200, 380, 390);
		fill (0,0,0);
		ellipse(120, 130, 50, 65);
		ellipse(260, 130, 50, 65);
		
		//noFill();
		arc(200, 280, 75, 75, HALF_PI,  PI);
		
	}

}
