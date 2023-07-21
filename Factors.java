import java.util.Scanner;
import java.math.BigInteger;
class Factors 
{
	static void isPrimeFactor(int n)
	{
		/*BigInteger b=new BigInteger(""+n);
		if (b.isProbablePrime(1))
		{
			System.out.println(n);
		}*/

		int c=0;
		for (int i=2;i<n ;i++ )
		{
			if (n%i==0)
			{
                            c++;
			}
		}
		if (c==0)
		{
			System.out.println(n);
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                System.out.println("Number to find the prime factors");
		int n=scan.nextInt();
		for (int i=2;i<=n ;i++ )
		{
			if (n%i==0)
			{
				isPrimeFactor(i);
			}
		}
	}
}
