
import java.util.Scanner;
public class Main {  // calculate the amperes of the fuse
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int computer = scanner.nextInt();
		int printer = scanner.nextInt();
		int router = scanner.nextInt();		
		
		double sum = ( computer * 2.5 + printer * 2 + router * 0.5  ) * 2 ;
		
		if(sum%10 != 0) {
			sum = sum + 10 - (sum%10);
		}
		
		System.out.println((int)sum+" amperes");
	}
}
