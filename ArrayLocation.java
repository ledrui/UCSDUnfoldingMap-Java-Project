public class ArrayLocation
{
	private double coords[];

	public ArrayLocation(double[] coords)
	{
		this.coords = coords;
	}

	public static void main (String[] args) {
		double[] coords = {5.0, 0.0};
		double[] coords1 = {11.17, -4.29};
		ArrayLocation accra = new ArrayLocation(coords);
		ArrayLocation bobo = new ArrayLocation(coords1);
		coords[0] = 47.6;
		coords[1] = -122.3;
		System.out.println("accra: "accra.coords[0]);
		accra = bobo;
		System.out.println("accra after bobo assignment: "accra.coords[0]);
	}
}