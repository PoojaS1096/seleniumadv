class Pgm24 
{
	static int CountHi(String str1)
	{
		int count=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			if((str1.substring(i,i+2).equals("hi")))
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(CountHi("abchiho"));
		System.out.println(CountHi("Abchi hi"));
		System.out.println(CountHi("hihi"));
	}
}
