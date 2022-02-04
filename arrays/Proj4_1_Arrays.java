package arrays;
import java.util.Scanner;
public class Proj4_1_Arrays {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int[] userValues = new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter an Integer\t");
			userValues[i]=keyboard.nextInt();
		}
		for(int j:userValues)
		{
			System.out.println(j*2);
		}
	}
}
