import java.util.Scanner;
class PracticeQues1
{
	public static void main(String args[])
	{

		System.out.println("Solution of Question 1:");
		Scanner s = new Scanner(System.in);
		System.out.println("enter marks for sub1:");
		int marks1 = s.nextInt();
		System.out.println("enter marks for sub2:");
		int marks2 = s.nextInt();
		System.out.println("enter marks for sub3:");
		int marks3 = s.nextInt();
		int total = (marks1+marks2+marks3)*100/300;
		System.out.println("Your total marks are:"+total+"%");
		if(total>=40)
		{
			if(marks1>=33)
			{
				if(marks2>=33)
				{
					if(marks3>=33)
					{
						System.out.println("You are Pass");
					}
				}
			}
		}
		else
			System.out.println("You are fail");
		System.out.println("Thankyou!");
	}
}