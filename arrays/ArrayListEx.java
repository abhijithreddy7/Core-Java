package arrays;
import java.util.ArrayList;
public class ArrayListEx {
	public static void main(String[] args)
	{
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("Abhi");
		namesList.add("Abhijith");
		namesList.add("Abhijith Reddy");
		namesList.add("M.Abhijith Reddy");
		namesList.add("Abhijith Reddy Mandagiri");
//		for (int i =0;i<namesList.size();i++)
//		{
//			System.out.println(namesList.get(i));
//		}
		for(String name:namesList)
		{
			System.out.println(name);
		}
	}
}
