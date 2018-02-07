
import java.util.Scanner;
public class Main {  // exchange date to second
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int time = scanner.nextInt();
		
		int day = (int) Math.floor(time / 24 / 60 / 60);
		int hour = (int) Math.floor((time - day*24*60*60) / 60 / 60);
		int minute = (int) Math.floor((time - day*24*60*60 - hour*60*60) / 60);
		int second = (int) Math.floor((time - day*24*60*60 - hour*60*60 - minute*60));
		
		System.out.print(day+" "+hour+" "+minute+" "+second);
	}
}
