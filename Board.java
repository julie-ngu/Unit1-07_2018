/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program tells the user how long it will take to microwave a sub, 
 *     pizza or soup according to the portions they choose
 *
 ****************************************************************************/
import java.util.Scanner;

public class Board {
	public static void main(String[] arg) {
		Scanner userInput = new Scanner(System.in);
		double length;
		double width;
		double height;
		
		System.out.print("Enter the length of the board foot (inches): ");
		length = userInput.nextDouble();
		
		System.out.print("Enter the width of the board foot (inches): ");
		width = userInput.nextDouble();
		
		height = boardFoot(length, width);
		if(height <= 0) {
			System.out.print(height);
		}
		else {
		System.out.print("\nThe height of the board is " + height + " inches.");
		
		}
	}
	
	public static double boardFoot(double lenx, double widy) {
		if(lenx < 1 || widy < 1) {
			return -1;
		}
		else {
			double highz;
			double VOLUME;
			
			VOLUME = 144;
			highz = (VOLUME / lenx) / widy;
			
			return highz;
		}
	}
}