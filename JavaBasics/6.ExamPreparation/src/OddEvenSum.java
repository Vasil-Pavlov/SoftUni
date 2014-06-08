import java.util.*;

public class OddEvenSum {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 0; i < 2 * n; i++) {
			int currentNumber = scanner.nextInt();
			
			if (i % 2 == 0) {
				oddSum += currentNumber;
			}
			else {
				evenSum += currentNumber;
			}
		}
		
		if (oddSum == evenSum) {
			System.out.println("Yes, sum=" + oddSum);
		}
		else {
			System.out.println("No, diff=" + Math.abs(oddSum - evenSum));
		}
	}
}
