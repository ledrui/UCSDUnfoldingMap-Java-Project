import processing.core.*;

public class MyPApplet extends PApplet
{
	private String URL = "https://s3-us-west-2.amazonaws.com/iliassblogimages/19-bullshit-I-smell-yoda-meme.png";
	private PImage backgroundImg;

	public void setup()
	{
		size (200, 200);
		backgroundImg = loadImage(URL, "png");
	}

	public void draw()
	{
		//
	}
}