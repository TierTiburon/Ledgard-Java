import java.util.Scanner;
public class WindChill
{
	public static void main(String[] args) 
	{
		Scanner inputDevice = new Scanner (System.in);
		double temp, vel, chill;
		
		System.out.print("Enter temperature(Fahrenheit): ");
		temp = inputDevice.nextDouble();
		System.out.print("Enter wind speed(mph): ");
		vel = inputDevice.nextDouble();
		
		chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(vel, 0.16) + 0.4275 * temp * Math.pow(vel, 0.16);
				
		System.out.println("The wind chill index is " + chill);
	}

}
