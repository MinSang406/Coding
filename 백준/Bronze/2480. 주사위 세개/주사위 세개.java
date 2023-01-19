import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int m ;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a== b && b==c) {
			m = 10000 + a * 1000;
		}
		else if(a == b || a == c) {
			m = 1000 + a * 100;
			}
		else if(b==c) {
			m = 1000 + b * 100;
			}
		
		else {
			m = Math.max(a, b);
			m = Math.max(m, c) * 100;
		}
		
		System.out.println(m);
		
	}
}
	