
import java.util.Scanner;
public class Main {  // print out the number between two numbers on after the other
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if ( a>b ) { 
			for( int i = 0 ; i<=(a-b) ; i++ ) {
				System.out.print(b+i+" ");
				}
			}
		else if ( b>a ) { 
			for( int i = 0 ; i<=(b-a) ; i++ ) {
				System.out.print(a+i+" ");
				}
			}
		else { System.out.print(a); }
		}
}
