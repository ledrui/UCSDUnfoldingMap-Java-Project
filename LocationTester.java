public class LocationTester
{
	public static void main(String[] args)
	{
		SimpleLocation home = new SimpleLocation(11.202770, -4.297278);
		SimpleLocation work = new SimpleLocation(6.727876, -5.297278);
	}

		System.out.println(home.distance(work));
	
}