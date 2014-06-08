import java.util.*;

public class SortArrayOfStrings {
	
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int numberOfStrings = scanner.nextInt();
		String [] words = new String[numberOfStrings];
		
		for (int i = 0; i < numberOfStrings; i++) {
			words[i] = scanner.next();
		}
		
		Arrays.sort(words);
		
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
	}
}
