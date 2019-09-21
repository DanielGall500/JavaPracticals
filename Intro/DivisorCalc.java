package myP;

public class DivisorCalc {
	
	public static void main(String[] args)
	{
		for(int i = 1; i <= 500; i++)
		{
			if((float)i % 3 == 0 || (float)i % 5 == 0)
			{
				System.out.print(i + " ");
			}
		}
	}

}
