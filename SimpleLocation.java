public class SimpleLocation
{
	private double longitude;
	private double latitude;

	// Default constructor
	public SimpleLocation(double lat, double lon){
	    this.longitude = -122.321724 ; 
	    this.latitude = 47.697263 ;
	}
	// Constructor
	public SimpleLocation(double lat, double lon){
	    this.longitude = lon; 
	    this.latitude = lat;
	}

	// getter
	public double getLatitude()
	{
		return this.latitude;
	}

	// setter
	public void setLatitude(double lat)
	{
		
	}

	public double distance(SimpleLocation other)
	{
		return (this.latitude , this.longitude, other.latitude, other.longitude)
	}
}