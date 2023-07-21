import java.util.Scanner;
class AlphabetIsVowelOrConsonant 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
                System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		char ch1=Character.toUpperCase(ch);
		if (ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U' )
		{
		     System.out.println("Vowel");
		}
		else
		{
		     System.out.println("Consonant");
		}
	}
}
