
import java.util.Scanner;
public class Main { // get the number of the logs
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int down = 0;
		int sub = number;
		int i = 1;
		int up = 0;
		
		while( true ) {
			sub -= i;
			if(sub<0) {
				down = i ;
				break;
			} else if(sub==0) {
				down = i ;
				break;
			}
			i++;
		}
		
		System.out.print(down+" ");
		
		sub = number;
		while( true ) {
			sub -= down;
			if(sub<=0) {
				up = sub + down;
				break;
			}
			down -- ;
		}
		
		System.out.print(up);
	}
}
