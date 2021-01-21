class Pgm29
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="hi";
		String s3="";
		System.out.println("\nBEFORE SWAP");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
		s3=s1;
		s1=s2;
		s2=s3;
		System.out.println("\n\nAFTER SWAP");
		System.out.println("s1 "+s1);
		System.out.println("s2 "+s2);
	}
}
