
import java.util.Scanner;
public class Main {  // calculate the number of the star
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int star = scanner.nextInt();
		
		for(int i=0; i<star ; i++) {
			System.out.print('*');
		}
	}
}
