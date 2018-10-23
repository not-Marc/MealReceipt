import java.util.Scanner;

public class MealReceipt 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the name of your appetizer");
		String appetizer = scan.nextLine();
		
		System.out.println("Enter the price of the appetizer");
		String appetizerPrice = scan.nextLine();
		Double appetizerPrice1 = Double.parseDouble(appetizerPrice);
		
		System.out.println("Enter the name of the entree");
		String entree = scan.nextLine();
		
		System.out.println("Enter the price of the entree");
		String entreePrice = scan.nextLine();
		double entreePrice1 = Double.parseDouble(entreePrice); 
		
		System.out.println("Enter the name of the dessert");
		String dessert = scan.nextLine();
		
		System.out.println("Enter the price of the dessert");
		String dessertPrice = scan.nextLine();
		double dessertPrice1 = Double.parseDouble(dessertPrice);
		
		System.out.println("Enter the name of the drink");
		String drink = scan.nextLine();
		
		System.out.println("Enter the price of the drink");
		String drinkPrice = scan.nextLine();
		Double drinkPrice1 = Double.parseDouble(drinkPrice);
		
		System.out.println("Enter the amount you would like to tip (in decimal form)");
		String tip = scan.nextLine();
		double tip1 = Double.parseDouble(tip);
		
		double generalTax = 1.06;
		
		double tip2 = tip1 + 1;
		
		double tipShown = tip1 * 100;
		
		double total = (appetizerPrice1 + entreePrice1 + dessertPrice1 + drinkPrice1);
		double subTotal = total * tip2;
		double otherTotal = total * tip1;
		double totalWithTip = total * tip2;
		double totalWithTax = totalWithTip * generalTax;
		
		double taxPrice = total * generalTax;
		
		System.out.println("ITEM                     PRICE");
		System.out.println("                                 ");
		System.out.println(appetizer + "                      " + appetizerPrice);
		System.out.println(entree + "                      " + entreePrice);
		System.out.println(dessert + "                      " + dessertPrice);
		System.out.println(drink + "                      " + drinkPrice);
		System.out.println("                                  ");
		System.out.println("Subtotal               " + total);
		System.out.println("Tax                    " + taxPrice);
		System.out.println("Tip (" + tipShown + "%)                  " + otherTotal);
		System.out.println("Total                        " + totalWithTax);
	}
}
 