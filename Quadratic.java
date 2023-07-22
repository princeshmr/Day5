import java.util.Scanner;
class Quadratic 
{
	public static void main(String[] args) 
	{
                Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		double c=scan.nextDouble();
                double delta=b*b-4.0*a*c;
		if (delta>0.0)
		{
			double x1=(-b + Math.pow(delta,0.5))/(2.0*a);
			double x2=(-b - Math.pow(delta,0.5))/(2.0*a);

			System.out.println("rootes is "+x1+"   "+x2);
		}
		else if (delta==0)
		{
			double x1=-b/(2.0*a);
			System.out.println("rootes is "+x1);
		}
		else
		{
			System.out.println("rootes are not real");
		}

	}
}
