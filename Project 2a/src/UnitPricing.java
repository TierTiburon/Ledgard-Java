import java.util.Scanner;
public class UnitPricing
//Written by: Noah Mainzinger
{
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner (System.in);
		int qnty, price, total;
		
		System.out.print("Please enter the Quantity desired: ");
		qnty = inputDevice.nextInt();
		System.out.print("Please enter the Unit price: ");
		price = inputDevice.nextInt();
		
		total = qnty * price;
		
		System.out.println("The Quantity desired is : " + qnty);
		System.out.println("The Unit Price is : $" + price);
		System.out.println("The Total Amount is : $" + total);
	}
}