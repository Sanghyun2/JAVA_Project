
import java.util.Scanner;
public class Main {  // calculate the fahrenheit temperature
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double celsius = scanner.nextDouble();
		
		double fahrenheit = celsius * 9 / 5 + 32;
		
		System.out.printf("%.1f", fahrenheit);
	}
}
