import java.util.Scanner;
class TwoDArray 
{
	public static void main(String[] args) 
	{
		int [][]ar=new int[2][3];
		Scanner scan=new Scanner(System.in);
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar[i].length ;j++ )
			{
				System.out.println("Enter the marks of class "+i+" Student "+j);
				ar[i][j]=scan.nextInt();
			}
		}
		System.out.println("The marks of all the students are: ");
		for (int i=0;i<ar.length ;i++ )
		{
			for (int j=0;j<ar[i].length ;j++ )
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
