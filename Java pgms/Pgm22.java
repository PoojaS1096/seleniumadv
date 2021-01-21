class Pgm22 
{
	static String extraEnd(String str1)
	{
		String s1=str1.substring(str1.length()-2,str1.length());
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		//return s1+s1+s1;
		//return rev+rev+rev;
		String s2=rev.substring(0,1);
		String s3=rev.substring(1,2);
		//String s4=rev.substring(2);

		return s2+s2+s2+s3+s3+s3;

	}
	public static void main(String[] args) 
	{
		System.out.println(extraEnd("hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("hi"));
	}
}
