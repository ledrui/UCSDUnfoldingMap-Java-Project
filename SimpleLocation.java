public class SimpleLocation
{
	private double longitude;
	private double latitude;

	// Default constructor
	public SimpleLocation(){
		this.latitude = 47.697263 ;
	    this.longitude = -122.321724 ; 
	    
	}
	// Constructor
	public SimpleLocation(double lat, double lon){
		this.latitude = lat;
	    this.longitude = lon; 
	    
	}

	// getter
	public double getLatitude()
	{
		return this.latitude;
	}

	// setter
	public void setLatitude(double lat)
	{
		if(lat < -180 || lat > 180){
			System.out.println("Illegal value for latitude");
		}
		else {
			this.latitude = lat;
		}
	}

	public double distance(SimpleLocation other)
	{
		//return getDist(this.latitude , this.longitude, other.latitude, other.longitude)
		return this.getLatitude() - other.getLatitude();

	}

}