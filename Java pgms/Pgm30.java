class Pgm30
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hi";
		System.out.println("\nBEFORE SWAP");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		s1=s1+s2;
		s2=s1.substring(0,5);
		s1=s1.substring(5,7);
		System.out.println("\n\nAFTER SWAP");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
	}
}
