class Pgm20 
{
	static String makeOutWord(String str1,String str2)
	{
		String s1=str1.substring(0,2);
		String s2=str1.substring(2,4);
		return s1+str2+s2;
	}
	public static void main(String[] args) 
	{
		System.out.println(makeOutWord("<<>>","Yay"));
		System.out.println(makeOutWord("<<>>","WooHoo"));
		System.out.println(makeOutWord("[[]]","word"));
	}
}
