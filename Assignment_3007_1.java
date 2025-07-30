import java.util.*;
public class Assignment_3007_1 
{
	public static void main(String[] args) 
	{

        	List<String> menu = new ArrayList<>(Arrays.asList("Burger", "Pizza", "Pasta", "Salad"));
        	List<Runnable> actions = new ArrayList<>();
		actions.add(() -> System.out.println("You selected Burger"));
        	actions.add(() -> System.out.println("You selected Pizza"));
        	actions.add(() -> System.out.println("You selected Pasta"));
        	actions.add(() -> System.out.println("You selected Salad"));

        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Menu:");
        	for (int i = 0; i < menu.size(); i++) 
		{
            		System.out.println((i + 1) + ". " + menu.get(i));
       		}

        	System.out.print("Enter your choice (1-" +menu.size()+ "): ");
		int choice = scanner.nextInt();

       	 	if (choice >=1  && choice <= menu.size()) 
		{
            		actions.get(choice - 1).run();  // trigger the corresponding lambda
        	} 
		else 
		{
           	 	System.out.println("Invalid choice.");
        	}
	}
}