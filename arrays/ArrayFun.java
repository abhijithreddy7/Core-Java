package arrays;

public class ArrayFun {
	public static void main(String[] args)
	{
		// declare an array
		int[] age = new int[5];

		// initialize array
		age[0] = 12;
		age[1] = 4;
		age[2] = 5;
		age[3] = 7;
		age[4] = 15;
//		for(int i=0;i<=age.length;i++)
//		{
//			System.out.println(age[i]);
//		}
		for(int i:age)
		{
			System.out.println(i);
		}
	}
}
