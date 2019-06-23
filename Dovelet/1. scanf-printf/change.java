
import java.util.Scanner;
public class Main {  // calculate the change
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		int change = 1000 - money;
		int change1 = (int) Math.floor(change / 100);
		int change2 = (int) Math.floor((change - 100 * change1) / 50);
		int change3 = (int) Math.floor((change - (100 * change1) - (50 * change2)) / 10);
		
		System.out.print(change1+" "+change2+" "+change3);
	}
}
