import java.util.*;

public class SortAnArray {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numbers.length - 1; i++) {
			
			int exchanger;
			for (int j = i; j < numbers.length; j++) {
				
				if (numbers[i] > numbers[j]) {
					exchanger = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = exchanger;
				}
			}
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

	}

}
