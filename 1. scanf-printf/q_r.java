
import java.util.Scanner;
public class Main {  // calculate the portion and the rest
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int p = a/b;
		int r = a%b;
		
		System.out.print((int)Math.floor(p)+" "+(int)Math.floor(r));
	}
}
