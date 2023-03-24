import java.util.Scanner;

public class LabShuhaidad {
	public static void main (String[]args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter a number between 0 and 1000:");
		int number = input.nextInt();
		int lessThan10 = 1+(number-100)/100;
		int tens =(1+(number-10)/10) % 10;
		int hundreds = number % 10;
		
		int sum = lessThan10*tens*hundreds;
		System.out.println("The multiplication of all digit is " + sum);
		//NUR SHUHAIDA BINTI MOHD NOOR ZAHKI
		//213519
		//LAB NO. 3
	    }
      }
