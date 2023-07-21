import java.util.Scanner;
class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                System.out.println("Enter the Harmonic number");
		int num=scan.nextInt();
		double res=0.0;
		for (int i=num;i>0 ;i-- )
		{
			res=res+(double)1/i;
			System.out.print(res+" , ");
		}
		System.out.println();
	}
}
