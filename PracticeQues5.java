import java.util.Scanner;
class PracticeQues5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the url:");
		String url = s.next();
		if(url.endsWith(".com"))
		{
			System.out.println("it is a commercial website");
		}
		if(url.endsWith(".org"))
		{
			System.out.println("it is an organisational website");
		}
		if(url.endsWith(".in"))
		{
			System.out.println("it is an Indian website");
		}
	}
}