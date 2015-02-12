import java.util.Scanner;
public class Distance
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner (System.in);
		double x1, y1, x2, y2, dist;
		
		System.out.print("Enter x1 and y1: ");
		x1 = inputDevice.nextDouble();
		y1 = inputDevice.nextDouble();
		System.out.print("Enter x2 and y2: ");
		x2 = inputDevice.nextDouble();
		y2 = inputDevice.nextDouble();
		
		dist = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) + (Math.pow(y2, 2) - Math.pow(y1, 2)));
		
		System.out.print("The distance is " + dist);
	}

}
