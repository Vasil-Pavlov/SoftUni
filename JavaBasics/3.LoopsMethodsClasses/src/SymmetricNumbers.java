import java.util.*;

public class SymmetricNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		for (int i = start; i <= end; i++) {
			
			if (i % 10 == i ||
					i % 10 == (i / 100) % 10 ||
					i % 10 == (i / 10) % 10 &&
					i % 10 == (i / 100) % 10) {
				System.out.print(i + " ");
			}
			else  {
				continue;
			}
		}

	}

}
