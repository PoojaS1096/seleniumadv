class Pgm27 
{
	static  int vowels(String str1)
	{
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count=count+1;
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(vowels("javaicecream"));
	}
}
