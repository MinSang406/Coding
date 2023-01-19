import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();

		int c = sc.nextInt();
		
		sc.close();

		if(c + m >= 60) {
			h = h + (c + m) / 60;
			m = (c + m) % 60;		
			
			if(h >= 24) {
			h = h -24;
			}
		} 
		else {
			m += c;
		}
		System.out.printf("%d %d", h, m);
	}
}
	