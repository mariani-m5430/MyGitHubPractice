/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author cheng
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=0;
		StringBuilder phonenum;
		StringBuilder quit = new StringBuilder("999");		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Please input 10 digit (or input 999 to quit) >>");
			phonenum = new StringBuilder(sc.nextLine());
			for(int i = 0 ; i<phonenum.length(); ++i) {
				if(!(Character.isDigit(phonenum.charAt(i)))){
					a=1; 
					i=phonenum.length();}	
			}

			if(phonenum.toString().equals(quit.toString()))
				System.out.println("Thank you for using this program! Stay safe and stay healthy");
			else if (a==1 || phonenum.length()!=10) {
				System.out.println("The number you entered is not 10 digit");
				a=0;
				}
			    else 
			    	System.out.println("the phone number is (" + phonenum.substring(0, 3) + ")" 
			               + phonenum.substring(3, 6) + "-" + phonenum.substring(6, 10));
		} while(phonenum.compareTo(quit)!=0);


	}

}
