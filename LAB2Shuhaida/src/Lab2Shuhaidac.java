import java.util.Scanner;

public class Lab2Shuhaidac {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("RetailPrice");
		double RetailPrice =input.nextDouble();
		
		System.out.println(" SalesTaxRate ");
		double SalesTaxRate=input.nextDouble();
		
		double total_sales_tax = RetailPrice * SalesTaxRate/100;
		double total= RetailPrice + total_sales_tax;
		
		System.out.println("Sales Tax is ="+ String.format("%.2f",total_sales_tax));
		System.out.println("Total Sale is ="+ String.format("%.2f",total));
		//NUR SHUHAIDA BINTI MOHD NOOR ZAHKI 
		//213519
		//LAB NO. 3
		}
        }
