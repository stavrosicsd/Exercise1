import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you now? :)");

	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Please enter your name: ");

	    System.out.println(new HelloUser(scanner.next()).greetUser());
	}

}
