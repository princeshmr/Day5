import java.util.Scanner;
class LargestThreeNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		if (num1>num2 && num1>num3)
		{
			System.out.println("Largest Number "+num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("Largest NUmber "+num2);
		}
		else
		{
			System.out.println("Largest Number "+num3);
		}
	}
}
