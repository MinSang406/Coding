import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int q = sc.nextInt();
		int l = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		int p = sc.nextInt();
				
		int k1 = 1, q1 = 1, l2 = 2, b2 = 2, n2 = 2, p8 = 8;
		System.out.printf("%d %d %d %d %d %d", k1-k, q1-q, l2-l, b2-b, n2-n, p8-p  );

		
		sc.close();
	}

}