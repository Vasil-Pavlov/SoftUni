import java.util.*;

public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		String delimiters = "[\\s;.,:'!?()-]";
		String[] words = sentence.split(delimiters);
		
		System.out.println(words.length - 1);
	}
}
