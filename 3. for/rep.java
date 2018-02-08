
import java.util.Scanner;
public class Main {  // show the number
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		
		for(int i=0; i<limit ; i++) {
			if( i == limit-1 ) {
				System.out.print(i+1);
			} else { System.out.print(i+1+" "); }
		}
	}
}
