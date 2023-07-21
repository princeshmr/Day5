import java.util.Scanner;
class EvenOrOddNumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                System.out.println("Enter the number");
		int num=scan.nextInt();
		if (num%2==0)
		{
		     System.out.println(num+" is Even");
		}
	        else
		{
		     System.out.println(num+" is odd");
		}
	}
}
