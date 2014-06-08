import java.util.*;

public class Sunglasses {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for (int i = 0; i < 5 * N; i++) {
			if (i < 2 * N) {
				System.out.print('*');
			}
			
			if (i >= 2 * N && i < 3 * N ) {
				System.out.print(' ');
			}
			
			if (i >= 3 * N) {
				System.out.print('*');
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 5 * N; i++) {
			if (i == 0 || i == 2 * N - 1 ||
					i == 3 * N || i == 5 * N - 1) {
				System.out.print('*');
			}
			else {
				if (i >= 2 * N && i < 3 * N ) {
					System.out.print('|');
				}
				else {
					System.out.print('/');
				}
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 5 * N; i++) {
			if (i < 2 * N) {
				System.out.print('*');
			}
			
			if (i >= 2 * N && i < 3 * N ) {
				System.out.print(' ');
			}
			
			if (i >= 3 * N) {
				System.out.print('*');
			}
		}
	}
}
