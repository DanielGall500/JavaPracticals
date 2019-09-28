//A collection of classes written for our second java assignment

public class Time {
	
	public int hours; 

	public int minutes;

	public int seconds;
	
	public void printTime()
	{
		String t = String.format("[%02d:%02d:%02d]", hours, minutes, seconds);
		
		System.out.println(t);
	}
	
	public static void main(String[] args)
	{
		Time t = new Time();
		
		Time morning = new Time();
		morning.hours = 7;
		morning.minutes = 15;
		morning.seconds = 12;
		morning.printTime();
	}

}

public class TriangleClass {
	
	public static void main(String[] args)
	{
		TriangleClass x = new TriangleClass();
		
		x.printTriangle(3, 'O');
	}
	
	void printTriangle(int size, char pencil)
	{
		if(size < 2 || size > 10)
		{
			System.out.print("Not valid input");
		}
		else 
		{
			int currLen = 1;
			
			while(currLen <= size)
			{
				String tmp = "";
				
				for(int i = 0; i < currLen; i++)
				{
					tmp = tmp.concat(pencil + " ");
				}
				
				System.out.println(tmp);
				
				currLen++;
			}
		}
		
	}

}

public class StrPrinter {
	
	public static void main(String[] args)
	{
		StrPrinter x = new StrPrinter();
		
		x.printString("Hello");
	}
	
	void printString(String inp)
	{
		System.out.println(inp);
		
		int len = inp.length();
		
		System.out.println(String.format("Contains %d characters", len));
	}

}

public class Reverser {
	
	public static void main(String[] args)
	{
		Reverser r = new Reverser();
		
		String s = r.reverseChangeCase("assignment 2 likes strings");
		System.out.println(s);
	}
	
	String reverseChangeCase(String inp)
	{
		String rev = "";
		
		for(int i = 0; i < inp.length(); i++)
		{
			rev += inp.charAt(inp.length() - 1 - i);
		}
		
		return rev.toUpperCase();
	}

}

public class printStrQ {
	
	public static void main(String[] args)
	{
		printStrQ x = new printStrQ();
		
		x.printString("hello my sun");
	}
	
	void printString(String inp)
	{
		System.out.println(inp);
		
		String mod = inp;
		
		if(inp.contains("my"))
		{
			mod = inp.replaceAll("my", "your");
		}
		
		System.out.print(mod);
	}

}