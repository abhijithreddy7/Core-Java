package arrays;
import java.util.ArrayList;
public class WrapperEx {
	public static void main(String[] args)
	{
		ArrayList<Integer> myNum = new ArrayList<>();
		myNum.add(10);//auto boxing
		myNum.add(new Integer(20));//explict wrapping
		int number = myNum.get(1);//auto unboxing
		for(int i:myNum)
		{
			System.out.println(i);
		}
		String random ="4566";
		int numericValue=Integer.parseInt(random);
		numericValue+=10;
		System.out.println(numericValue);
		String pi="3.14159";
		double doubleValue=Double.parseDouble(pi);
		System.out.println(doubleValue);
	}
}
