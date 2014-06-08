import java.util.*;

public class SumOfElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		long sum = 0;
		long max = Long.MIN_VALUE;
		
		for (int i = 0; i < numbers.length; i++) {
			
			sum += Long.parseLong(numbers[i]);
			
			if (Long.parseLong(numbers[i]) > max) {
				
				max = Long.parseLong(numbers[i]);
			}
		}
		
		if (sum == 2 * max) {
			System.out.println("Yes, sum=" + max);
		}
		else {
			System.out.println("No, diff=" + Math.abs(sum - 2 * max));
		}
	}
}
