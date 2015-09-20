public class ArrayLocation
{
	private double coords[];

	public ArrayLocation()
	{
		this.coords = coords;
	}

	public static void main (String[] args) {
		double[] coords = {5.0, 0.0};
		ArrayLocation accra = new ArrayLocation(coords);
		coords[0] = 47.6;
		coords[1] = -122.3;
		System.out.println(accra.coords[0]);
	}
}