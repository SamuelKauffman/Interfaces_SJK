
import java.util.Scanner;

/**
 * @author sam Kauffman
 * @Version 1.0
 * 
 * comparing 2 numbers
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your 1st denominator: ");
		int den1 = scan.nextInt();
		System.out.println("Enter your 1st Numerator");
		int numer1 = scan.nextInt();
		RationalNumber r1 = new RationalNumber(den1,numer1);
		
		System.out.println("Enter your 2nd denominator: ");
		int den2 = scan.nextInt();
		System.out.println("Enter your 2nd Numerator");
		int numer2 = scan.nextInt();
		RationalNumber r2 = new RationalNumber(den2, numer2);
		
		System.out.println(r1.compareTo(r2));
		
	}//end main

}
