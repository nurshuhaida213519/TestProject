import java.util.Scanner;

//NUR SHUHAIDA BINTI MOHD NOOR ZAHKI
//213519
//LAB NO 3

public class Lab3ShuhaidaQ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1st item
		  System.out.print("Item 1:");
		  String item1 = input.nextLine();
		//Quantity of 1st item
		  System.out.print("Quantity:");
		  double quantity1 = input.nextDouble();
		//Price of 1st item
		  System.out.print("Unit Price: RM ");
		  double price1 = input.nextDouble();
		//operations
		  double amountfood1 = quantity1 * price1;
		//Display amount of Item 1
		  System.out.println("");
		  System.out.println("Amount: RM " + String.format("%.2f", amountfood1));
		
		  System.out.println("-------------------------------");
		//2nd item
		  System.out.print("Item 2: ");
		  String item2 = input.next();
		//Quantity of 2nd item
		  System.out.print("Quantity: ");
		  double quantity2 = input.nextDouble();
		//Price of 2nd item
		  System.out.print("Unit Price: RM ");
		  double price2 = input.nextDouble();
		//operations
		  double amountfood2 = quantity2 * price2;
		//Display amount of Item 2
		  System.out.println("");
		  System.out.println("Amount: RM" + String.format("%.2f" , amountfood2));
		  
		//operations
		  double subtotal = amountfood1 + amountfood2;
		  double governmenttax = 0.06* subtotal;
		  double servicecharge = 0.1* subtotal;
		  double total = subtotal + servicecharge + governmenttax;
		  
		//Display results
		  System.out.println("");
		  System.out.println("Subtotal: RM " + String.format("%.2f", subtotal));
		  System.out.println("Government Tax (6%): RM " + String.format("%.2f", governmenttax));
		  System.out.println("Service Charge (10%): RM " + String.format("%.2f", servicecharge));
		  System.out.println("");
		  System.out.println("Total: RM " + String.format("%.2f", total));
		  
	}

}
