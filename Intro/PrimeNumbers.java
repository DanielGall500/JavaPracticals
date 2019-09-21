package myP;

public class PrimeNumbers {
	
	private boolean is_prime(int num)
	{
		
		if(num == 1)
		{
			return false;
		}
		else if (num == 2)
		{
			return true;
		}
		
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
				return false;
		}
		
		
		return true;
	}
	
	public static void main(String[] args)
	{
		PrimeNumbers pn = new PrimeNumbers();
		
		for(int i = 1; i <= 1000; i++)
		{
			if(pn.is_prime(i))
			{
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}

}
