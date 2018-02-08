
import java.util.Scanner;
public class Main {  // calculate the medium
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int mid=0;
		
		if( (int)a == (int)b || (int)b == (int)c || (int)a == (int)c ) { mid = a; }

		if( (int)a == (int)b ) {
			mid = a;
		}
		
		if( (int)b == (int)c ) {
			mid = b;
		}
		
		if( (int)a == (int)c ) {
			mid = a;
		}
		
		if( a > b && a > c ) {
			if ( b > c ) {
				mid = b;
			} else if ( c > b ) {
				mid = c;
			} else { mid = b; }
		}
		
		if( b > a && b > c ) {
			if ( a > c ) {
				mid = a;
			} else if ( c > a ) {
				mid = c;
			} else { mid = a; }
		}
		
		if( c > b && c > a ) {
			if ( b > a ) {
				mid = b;
			} else if ( a > b ) {
				mid = a;
			} else { mid = b; }
		}
		
				
		System.out.println(mid);
	}
} // Let's find the better way
