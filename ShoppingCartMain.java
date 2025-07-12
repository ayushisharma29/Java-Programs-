class QuantityException extends Exception
{
	public String getMessage()
	{
		return "Item is invalid!";
	}
}
class ShoppingCart
{
	String name;
	int quantity;
	void addItem(String name, int quantity)throws QuantityException
	{
		this.name = name;
		this.quantity = quantity;
		if(quantity<=0)
		{
			throw  new QuantityException();
		}
	}
}
class ShoppingCartMain
{
	public static void main(String args[]) 
	{
		String name = args[0];
		int quantity = Integer.parseInt(args[1]);
		ShoppingCart item = new ShoppingCart(name, quantity);
		try
		{
			item.addItem(name,quantity);
			System.out.println(item);
		}
		catch(Exception qe)
		{	
			System.out.println(qe.getMessage());
		}
	}
}
			
	
	
