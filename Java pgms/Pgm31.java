class Pgm31 
{
	public static void main(String[] args) 
	{
		int[] arr={10,20,30,10,40,20,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
