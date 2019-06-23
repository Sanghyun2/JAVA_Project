
import java.util.Scanner;
public class Main {  // print out the number between two numbers on after the other
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = Math.abs(a-b);
		
		if ( a>b ) { 
			for( int i = 0 ; i<=c ; i++ ) {
				System.out.print(b+i+" ");
				}
		} else { 
			for( int i = 0 ; i<=c ; i++ ) {
				System.out.print(a+i+" ");
				}
			}
		}
}
