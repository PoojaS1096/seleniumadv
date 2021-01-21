class Pgm28
{
	static String revdigit(String s1)
	{
		String alpha="";
		String number="";
		String revnumber="";
		for(int j=0;j<s1.length();j++)
		{
			char ch1=s1.charAt(j);
			if((ch1>=97 && ch1<=122)||(ch1>=65 && ch1<=90))
			{
				alpha=alpha+ch1;
			}
			else if(ch1>=48 && ch1<=57)
			{
				number=number+ch1;
			}
		}
		for(int i=number.length()-1;i>=0;i--)
		{
			char ch=number.charAt(i);
			revnumber=revnumber+ch;
			
		}
		return alpha+revnumber;

	}
	public static void main(String[] args)
	{
		System.out.println(revdigit("axy1234"));
		System.out.println(revdigit("123xy"));
	}
	}
		