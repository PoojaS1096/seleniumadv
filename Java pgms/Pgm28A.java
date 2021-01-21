class Pgm28A
{
	static String revdigit(String s1)
	{
		//String str="";
		String str2="";
	
		for(int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
	
			for(int j=i+1;j<s1.length();j++)
			{
				char ch2=s1.charAt(j);
				if(ch2>=48 && ch1<=57)
				{
				 str2=str2+ch2;
				}
			}

			 for(int j=str2.length();j>0;j--)
			{
				str2=str2+ch1;
			}
		}
		return str2;
	}

	public static void main(String[] args)
	{
		System.out.println(revdigit("axy1234"));
		System.out.println(revdigit("123xy"));
	}
}
		