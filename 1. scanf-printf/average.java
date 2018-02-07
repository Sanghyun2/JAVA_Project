
import java.util.Scanner;
public class Main {  // calculate the second
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		double number [] = new double[4];
		double sum=0;
		
		for(int i=0;i<number.length;i++) {
			number[i] = scanner.nextDouble();
			sum += number[i];
		}
		
		double average = sum/4;
		System.out.printf("%.2f",average);
	}
}
