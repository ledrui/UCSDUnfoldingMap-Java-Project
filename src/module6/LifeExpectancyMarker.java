package module6;

import processing.core.PConstants;
import processing.core.PGraphics;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractMarker;
import de.fhpotsdam.unfolding.marker.Marker;

public class LifeExpectancyMarker extends CommonMarker {

	public LifeExpectancyMarker(Location location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	
	public LifeExpectancyMarker(Feature country){
		super(((Marker) country).getLocation(),country.getProperties());
	}
	
	public static int TRI_SIZE = 5;
	// ShowTitle
	public void showTitle(PGraphics pg, float x, float y)
	{
		String title = getTitle();
		pg.pushStyle();
		
		pg.rectMode(PConstants.CORNER);
		
		pg.stroke(110);
		pg.fill(255,255,255);
		pg.rect(x, y + 15, pg.textWidth(title) +6, 18, 5);
		
		pg.textAlign(PConstants.LEFT, PConstants.TOP);
		pg.fill(0);
		pg.text(title, x + 3 , y +18);
		
		
		pg.popStyle();
		
	}
	
	public String getTitle(){
		return getStringProperty("title"); 
	}


	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		//System.out.println("Drawing a city");
		// Save previous drawing style
		pg.pushStyle();
		
		// IMPLEMENT: drawing triangle for each city
		pg.fill(250, 100, 30);
		pg.triangle(x, y+TRI_SIZE, x+TRI_SIZE, y+2*TRI_SIZE+1, x+2*TRI_SIZE, y+TRI_SIZE);
		
		// Restore previous drawing style
		pg.popStyle();
	}

}
