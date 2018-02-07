
import java.util.Scanner;
public class Main {  // calculate the second
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double baseLine = scanner.nextInt();
		double height = scanner.nextInt();
	
		double area = (baseLine*height)/2; 
	
		System.out.printf("%.2f",area);
	}
}
