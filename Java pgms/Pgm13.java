//package Programming;
class Pgm13
{
	public static void main(String[] args)
	{
		String s1="ja#45894*()HSSH";
		String alpha="";
		String number="";
		String special="";

		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if((ch>=97 && ch<=122)||(ch>=65 && ch<=90))
			{
				alpha=alpha+ch;
			}else if(ch>=48 && ch<=57)
			{
				number=number+ch;
			}
			else
			{
				special=special+ch;
			}
		}
		System.out.println("Alphabets "+alpha+" total = "+alpha.length());
		System.out.println("Alphabets "+number+" total = "+number.length());
		System.out.println("Alphabets "+special+" total = "+special.length());
	}
}
		
