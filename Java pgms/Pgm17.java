class Pgm17
{
	static String makeAbba(String str1,String str2)
	{
		return str1+str2+str2+str1;
	}
	public static void main(String[] args) 
	{
		System.out.println(makeAbba("hi","bye"));
		System.out.println(makeAbba("yo","Alice"));
		System.out.println(makeAbba("What","up"));
	}
}
