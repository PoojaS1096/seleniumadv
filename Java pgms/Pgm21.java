class Pgm21 
{
	static String firstTwo(String str1)
	{
		String s1=str1.substring(0,2);
		
		return s1;
	}
	public static void main(String[] args) 
	{
		System.out.println(firstTwo("hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));
	}
}
