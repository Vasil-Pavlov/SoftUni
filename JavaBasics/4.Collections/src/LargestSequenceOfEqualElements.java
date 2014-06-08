import java.util.*;

public class LargestSequenceOfEqualElements {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		
		int currentSequence = 1;
		int largestSequence = 0;
		String currentLargest = "";
		String overallLargest = "";
		
		for (int i = 0; i < words.length; i++) {
			currentLargest = words[i];
			
			if (currentSequence > largestSequence) {
				largestSequence = currentSequence;
				overallLargest = currentLargest;
			}
			
			if (i < words.length - 1) {
				if (Character.isAlphabetic(words[i].charAt(0))) {
					if (words[i].matches(words[i + 1])) {
						currentSequence++;
						currentLargest = words[i];
					}
					else {
						currentSequence = 1;
					}
				}
				else{
					if (Integer.parseInt(words[i]) == 
							Integer.parseInt(words[i + 1])) {
						currentSequence++;
						currentLargest = words[i];
					}
					else{
						currentSequence = 1;
					}
				}
			}
		}
		
		for (int i = 0; i < largestSequence; i++) {
			System.out.print(overallLargest + " ");
		}

	}
}
