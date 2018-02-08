
import java.util.Scanner;
public class Main {  // printing the star
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int j = n/2+1;
		
		while(j>0) {
		for( int i=0; i<j; i++ ) {
			for( int m=1; m<j; m++ ) {
				System.out.print(" ");
			}
			for( int p=0; p<n-2*(j-1) ; p++ ) {
				System.out.print("*");
			}
			System.out.println();
			j--;
			}
		}
	}
}
