
import java.util.Scanner;
public class ScannerDemo {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = scan.nextInt();
		System.out.println("\n" + i);
		scan.close();
	}
	
}
