package controlstatements;

public class EvenOnly {
	public static void main(String[] args)
	{
		int count = 0;
		while(count<10)
		{
			if(count %2!=0)
			{
				count++;
				continue;//break;
			}
		}
		System.out.println(count + "\t");
		count++;
	}
}
