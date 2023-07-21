import java.util.Scanner;
class PowerOfTwo 
{
	public static void main(String[] args) 
	{
                int n=0;
		for(int i=0;i<args.length;i++){
		     n=Integer.parseInt(args[i]);
                }
		int res=0;
		for (int i=0;i<=n && n<=31 ;i++ )
		{
			res=(int)Math.pow(2,i);
			//System.out.println(res);

                        if(res>=1000 && res <=9999)
                        {
			      if ((res%4==0 && res%100 != 0) || (res%400==0))
		              {
			            System.out.println(res+" is leap year");
		              }
	                }
                        else
                        {
                              System.out.println(res+" is Not a leap year");
                        }
                 }	        
	} 
}
