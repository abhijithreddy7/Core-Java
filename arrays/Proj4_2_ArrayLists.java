package arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Proj4_2_ArrayLists {
	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in);
		ArrayList<Double> myList = new ArrayList<>();
		System.out.println("Enter 0 or more to add to list" + "or -1 to exit");
		double input=keyboard.nextDouble();
		while(input>=0)
		{
			myList.add(input);
			System.out.println("Enter 0 or more to add to list" + "or -1 to exit");
			input=keyboard.nextDouble();
		}
		for(int i=myList.size()-1;i>=0;i--)
		{
			System.out.println(myList.get(i));
		}
	}
}
