import java.util.Scanner;
class PracticeQues2
{
	public static void main(String args[])
	{
		System.out.println("Here is the program to check What day it is of the week");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		switch(day){
			case 1:{
				System.out.println("It is Sunday dear!");
				break;
			}
			case 2:{
				System.out.println("It is Monday dear!");
				break;
			}
			case 3:{
				System.out.println("It is Tuesday dear!");
				break;
			}
			case 4:{
				System.out.println("It is Wednesday dear!");
				break;
			}
			case 5:{
				System.out.println("It is Thursday dear!");
				break;
			}
			case 6:{
				System.out.println("It is Friday dear!");
				break;
			}
			case 7:{
				System.out.println("It is Saturday dear!");
				break;
			}
		default:
			System.out.println("You have entered a wrong value for day");
		
		}
	}
}		