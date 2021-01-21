class Pgm26A
{
	static boolean catDog(String str)
	{
		int count=0;
		int count1=0;
		for(int i=0;i<str.length()-2;i++)
		{
			if(str.substring(i,i+3).equals("cat")) 
			{	
				count=count+1;
			}
			else if(str.substring(i,i+3).equals("dog"))
			{	
				count1=count1+1;
			}
		}
		
		if(count==count1)
		{return true;
		}
		else{
		return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("icatcadodog"));
		System.out.println(catDog("dog"));
		System.out.println(catDog("catHdogIdog"));
	}
}
