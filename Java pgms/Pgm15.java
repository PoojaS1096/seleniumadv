class Pgm15 
{
	public static void main(String[] args) 
	{
		String s1="Quadcom";
		String s2=s1.substring(4,7);
		String rev="";
		String s3=s1.substring(0,4);
		for(int i=s2.length()-1;i>=0;i--)
		{
		 rev=rev+s2.charAt(i);
		}
		
		System.out.println("input is "+s1);
		System.out.println("output is "+s3+rev);
	}
}
