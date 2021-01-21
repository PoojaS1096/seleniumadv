class Pgm19 
{
	static String makeTags(String str1,String str2)
	{
		return "<"+str1+">"+str2+"</"+str1+">";
	}
	public static void main(String[] args) 
	{
		System.out.println(makeTags("i","Yay"));
		System.out.println(makeTags("i","Hello"));
		System.out.println(makeTags("cite","Yay"));
	}
}
