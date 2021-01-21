class Pgm25 
{
	static int Qspcount(String s1)
	{
		int count=0;
		for(int i=0;i<s1.length()-2;i++)
		{
			if((s1.substring(i,i+3).equals("Qsp")))
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("Qsp count is "+Qspcount("hiQsphiQspspQsphgdkhQsp"));
	}
}
