import java.util.Scanner;
public class Main {  // calculate the second
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;
	
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+mul);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+rem);
	}
}
