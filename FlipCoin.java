import java.util.Scanner;
class FlipCoin 
{
	public static void main(String[] args) 
	{
		int heads=0;
		int tails=0;
		int count=1;
		double random=0.0;
		
		System.out.println("How many times you filp the coins");
		Scanner scan=new Scanner(System.in);
		int flips=scan.nextInt();

		while (count<=flips)
		{
			random=Math.random();
			System.out.println(count+"   "+random);

			if (random<0.5)
			{
				heads++;
				System.out.println("Heads");
			}
			else
			{
				tails++;
				System.out.println("Tails");
			}
			count++;
		}
		System.out.println("Number of heads: "+heads);
		System.out.println("Number of tails: "+tails);

		double headPercent=(double)heads/flips*100;
		double tailPercent=(double)tails/flips*100;

		System.out.println("Percentage of heads: "+headPercent);
		System.out.println("Percentage of tails: "+tailPercent);

	}
}
