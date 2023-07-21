import java.util.Scanner;
class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first number");
		int x=scan.nextInt();
                System.out.println("Enter the second number");
		int y=scan.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swaping: x="+x+" y="+y);
	}
}
