package strings;

public class StringMethods1 {
	public static void main(String[] args)
	{
		String name = "Abhijith Reddy";
		String name1 = "abhijith reddy";
		String name2 = "Mandagiri";
		for(int i= 0;i<name.length();i++)
		{
			System.out.print(name.charAt(i)+ " ");
		}
		System.out.println();
		if(name.equals(name1))
		{
			System.out.println("Names are equal");
		}
		else
		{
			System.out.println("names arent equal");
		}
		if(name.compareTo(name2)>0)
		{
			System.out.println("name>name2");
		}
		else
		{
			System.out.println("name<=name2");
		}
	}
}
