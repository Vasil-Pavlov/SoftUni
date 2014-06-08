import java.util.*;

public class Eclipse {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < 5 * n; i++) {
			if (i > 0 && i <= 2 * n - 2 || i > 3 * n - 1 && i < 5 * n - 2) {
				System.out.print('*');
			}
			else {
				System.out.print(' ');
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 5 * n - 1; i++) {
			if (i == 0 || i == 2 * n - 1 || 
					i == 3 * n - 1 || i == 5 * n - 2) {
				System.out.print('*');
			}
			else if(i >= 2 * n && i <= 3 * n - 2) {
				System.out.print('-');
			}
			else {
				System.out.print('/');
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 5 * n; i++) {
			if (i > 0 && i <= 2 * n - 2 || i > 3 * n - 1 && i < 5 * n - 2) {
				System.out.print('*');
			}
			else {
				System.out.print(' ');
			}
		}
	}
}
