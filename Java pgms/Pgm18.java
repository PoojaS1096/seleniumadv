class Pgm18 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		System.out.println("input is " +s1);
		System.out.print("output1 is "+(char)(s1.charAt(0)));
		System.out.print((char)(s1.charAt(1)-32));
		System.out.print((char)(s1.charAt(2)));
		System.out.println((char)(s1.charAt(3)-32));

		System.out.print("output2 is "+(char)(s1.charAt(0)-32));
		System.out.print((char)(s1.charAt(1)));
		System.out.print((char)(s1.charAt(2)-32));
		System.out.print((char)(s1.charAt(3)));


	}
}
