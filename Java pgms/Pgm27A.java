class Pgm27A
{
	public static void main(String[] args) 
	{	
		String str1="JavaIcecream";
		str1=str1.toLowerCase();
		int count=0;
		String charr="";

		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
				charr=charr+ch;
			}
		}
		System.out.println("vowels "+count);
		System.out.println("vowels name present in String "+charr);
	}
}
