import java.util.Scanner;
class PracticeQues4
{
	public static void main(String args[])
	{
		// Program to find wheather the year is a leap year or not
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year: ");
		int year = s.nextInt();
		if((year%400)==0 && (year%100)==0 && (year%4)==0)
		{
			System.out.println("It is a leap year");
		}
		else
			System.out.println("It is not a leap year");
	}
}













