import java.util.Scanner;
public class ModuloDivision 
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		int n, sum;
		
		System.out.print("Enter a number: ");
		n = inputDevice.nextInt();
		
		sum = 0;
		while (n != 0)
		{
			sum += n % 10;
			n /= 10;
		}
		System.out.println("Sum: " + sum);
	}
}
