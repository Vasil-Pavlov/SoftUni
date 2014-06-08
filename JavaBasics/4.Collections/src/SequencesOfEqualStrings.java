import java.util.*;

public class SequencesOfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			System.out.print(words[i] + " ");
			
			if (i < words.length - 1) {
				if (Character.isAlphabetic(words[i].charAt(0))) {
					if (words[i].matches(words[i + 1])) {
						continue;
					}
					else {
						System.out.println();
					}
				}
				else {
					if (Integer.parseInt(words[i]) == 
							Integer.parseInt(words[i + 1])) {
						continue;
					}
					else{
						System.out.println();
					}
				}
			}
		}
	}
}
