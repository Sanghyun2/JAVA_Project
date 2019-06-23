
import java.util.Scanner;
public class Main {  // printF
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for( int i=0; i<n; i++) {
			if( i==0 || i==n-n/2-1 ) {
				for( int j=0; j<n; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else { System.out.println("*");}
		}
	}
}
