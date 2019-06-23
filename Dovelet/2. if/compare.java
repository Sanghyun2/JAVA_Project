
import java.util.Scanner;
public class Main {  // compare the two integers
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();
		
		if(int1 > int2) {
			System.out.println(">");
		} else if(int1 < int2) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
	}
}
