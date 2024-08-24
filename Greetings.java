//Asks for input from user and saves as a string to be printed later in the greeting
import java.util.Scanner;

public class Greetings{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = kboard.nextLine();
		
		System.out.print("Enter your last name: ");
		String lastName = kboard.nextLine();
		
		System.out.println("Hello, " + firstName + " " + lastName);
		System.out.println("Welcome to Java!");
		
		kboard.close();
	}
}