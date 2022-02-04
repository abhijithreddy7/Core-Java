package strings;

public class StringMethods2 {
	public static void main(String[] args)
	{
		String name = "Abhijith Reddy";
		String upper = name.toUpperCase();
		String lower = name.toLowerCase();
		
		int whereIsA = name.indexOf('A');
		
		String lastName = name.substring(10);
		
		System.out.print("upper is "+ upper);
		System.out.print("upper is "+ lower);
        System.out.println("t is at index "+whereIsA);
        System.out.println("last name "+lastName);
	}
}
