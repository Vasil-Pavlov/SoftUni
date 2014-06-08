import java.util.*;

public class HalfSum {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int firstSum = 0;
		int secondSum = 0;
		
		for (int i = 0; i < n * 2; i++) {
			int currentElement = scanner.nextInt();
			
			if (i < n) {
				firstSum += currentElement;
			}
			else {
				secondSum += currentElement;
			}
		}
		
		if (firstSum == secondSum) {
			System.out.println("Yes, sum=" + firstSum);
		}
		else {
			System.out.println("No, diff=" + Math.abs(secondSum - firstSum));
		}
		
		
	}
}
