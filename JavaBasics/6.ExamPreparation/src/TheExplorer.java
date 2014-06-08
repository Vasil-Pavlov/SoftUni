import java.util.*;

public class TheExplorer {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for (int i = 0; i < n / 2; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if (j == n / 2 + i || j == n / 2 - i) {
					System.out.print('*');
				}
				else {
					System.out.print('-');
				}
			}
			System.out.println();
		}
		
		for (int i = n / 2; i >= 0; i--) {
			
			for (int j = 0; j < n; j++) {
				
				if (j == n / 2 + i || j == n / 2 - i) {
					System.out.print('*');
				}
				else {
					System.out.print('-');
				}
			}
			System.out.println();
		}
	}

}
