import java.util.Random;
import java.util.Scanner;
class RockPaperScissorsGame
{
	public static void main(String args[])
	{
		//taking input from user to select his move....
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Let's begin the Game!");
		System.out.println("Enter 1 for choosing Rock!");
		System.out.println("Enter 2 for choosing Paper!");
		System.out.println("Enter 3 for choosing Scissors!");
		System.out.println("Enter you move:");
		int humanMove = sc.nextInt();

		if(humanMove>3)
		{
			System.out.println("You have given invalid input");
		}

		//Selecting random move by the machine......
			
		Random rd = new Random();
		int compMove = rd.nextInt(3)+1;	

		//Comparison of the moves selected by the user and the machine to 		decide results of the game

		if(humanMove==compMove)
		{
			System.out.println("the game has Tied!");
		}
		if(humanMove==1 && compMove==2 || humanMove==2 && compMove==3 || humanMove==3 && compMove==1)
		{
			System.out.println("Oops, You Lose!");
		}
		if(humanMove==2 && compMove==1 || humanMove==3 && compMove==2 || humanMove==1 && compMove==3)
		{
			System.out.println("Congratulations, You win!");
		}
	}
}
	