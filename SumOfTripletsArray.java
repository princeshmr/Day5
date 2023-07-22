import java.util.Scanner;
class SumOfTripletsArray 
{
	static void findTriplets(int ar[])
	{
		int count=0;
		for (int i=0;i<=ar.length-3 ;i++ )
		{
			for (int j=i+1;j<=ar.length-2 ;j++ )
			{
				for (int k=j+1;k<=ar.length-1 ;k++ )
				{
					if (ar[i]+ar[j]+ar[k]==0)
					{
					    System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);
					    count++;
					}
					
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of size of aaray");
		int size=scan.nextInt();
		int []ar=new int[size];
		
		for (int i=0;i<ar.length ;i++ )
		{
			System.out.println("Enter the "+(i+1)+"th Element");
			ar[i]=scan.nextInt();
		}
		findTriplets(ar);
	}
}
