
import java.util.Scanner;
public class Main {  // compare the two fractions
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		double d = scanner.nextDouble();
		double e = a/b;
		double f = c/d;
		// System.out.println(e+" "+f);
		
		if(e > f) {
			System.out.println("1");
		} else if(e < f) {
			System.out.println("-1");
		} else {
			System.out.println("0");
		}
	}
}
