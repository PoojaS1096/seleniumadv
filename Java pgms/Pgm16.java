class Pgm16 
{
	static String helloname(String str)
	{
		return "hello "+str+" !";
	}
	public static void main(String[] args) 
	{
		System.out.println(helloname("Bob"));
		System.out.println(helloname("Alice"));
		System.out.println(helloname("x"));
	}
}
