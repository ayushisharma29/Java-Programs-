import java.util.Scanner;
class PracticeQues3
{
	public static void main(String args[])
	{
		System.out.println("Here is the program to check the tax slabs for a person's salary");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your annual Salary");
		int income = sc.nextInt();
		if(income<=250000)
			System.out.println("You don'nt need to pay tax");
		if(income>250000 && income<=500000)
			System.out.println("You have to pay "+(5*income)/100+" Rs as tax");
		else if(income>500000 && income<=1000000)
			System.out.println("You have to pay "+(20*income)/100+" Rs as tax");
		else if(income>1000000)
			System.out.println("You have to pay "+(30*income)/100+" Rs as tax");
		System.out.println("Its all about the tax slabs");
	}
}