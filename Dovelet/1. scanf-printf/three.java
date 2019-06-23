
import java.util.Scanner;
public class Main {  // multiplication by three digits
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		
		int a1 = Integer.parseInt(a);  //  To replace a string with a number
		int b1 = Integer.parseInt(b);
		
		// System.out.println( a1+" "+b1  ); // To check the results
		
		int [] num1 = new int [a.length()];
		int [] num2 = new int [b.length()];
		
		for(int i=0;i<3;i++) {
			num1[i] = a.charAt(i) - '0'; 
		}  // To replace a char with a number, It can be obtained by the difference of a Ascii like a '1'-'0'
		
		for(int i=0;i<b.length();i++) {
			num2[i] = b.charAt(i) - '0';
		}
		
		System.out.println( a1 * (num2[2]));
		System.out.println( a1 * (num2[1]));
		System.out.println( a1 * (num2[0]));
		System.out.println( a1 * b1);
	}
}
