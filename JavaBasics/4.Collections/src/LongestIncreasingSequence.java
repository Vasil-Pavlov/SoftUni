import java.util.*;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] numbers = input.split(" ");
		
		int currentLongestSequence = 1;
		int overallLongestSequence = 0;
		String currentSequence = "";
		String overallSequence = "";
		
		for (int i = 0; i < numbers.length; i++) {
			
			currentSequence += numbers[i] + " ";
			if (currentLongestSequence > overallLongestSequence) {
				
				overallLongestSequence = currentLongestSequence;
				overallSequence = currentSequence;
			}
			
			if (i < numbers.length - 1) {
				
				if (Integer.parseInt(numbers[i]) <
						Integer.parseInt(numbers[i + 1])) {
					currentLongestSequence++;
					continue;
				}
				else {
					System.out.println(currentSequence);
					currentLongestSequence = 1;
					currentSequence = "";
				}
			}
			else {
				System.out.println(currentSequence);
			}
		}
		
		System.out.println("Longest: " + overallSequence);
	}
}
