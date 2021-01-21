class Pgm23 
{
	static String doubleChar(String str1)
	{
		String s1="";
		for(int i=0;i<str1.length();i++)
		{
			s1=s1+str1.charAt(i)+str1.charAt(i);
		}
		return s1;
	}

	public static void main(String[] args) 
	{
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));
	}
}
