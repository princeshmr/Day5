import java.util.Scanner;
class QuotientAndRemainder 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the dividend");
		int dividend=scan.nextInt();
		System.out.println("Enter the divisor");
		int divisor=scan.nextInt();

		int quotient=dividend/divisor;
		int remainder=dividend%divisor;

		System.out.println("quotient "+quotient);
		System.out.println("remainder "+remainder);
	}
}
