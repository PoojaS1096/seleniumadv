class Pgm32B
{
	public static void main(String[] args) 
	{
		String s1="hi Qspiders how are you";
		String[] arr=s1.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			String s3=arr[i];
			String rev=" ";
			for(int j=s3.length()-1;j>=0;j--)
			{
				rev=rev+s3.charAt(j);
			}
			System.out.print(rev);
		}
	}
}
