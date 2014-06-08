import java.util.*;

public class GenerateWords {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			
			for (int j = 0; j < input.length(); j++) {
				
				for (int j2 = 0; j2 < input.length(); j2++) {
					
					System.out.print(input.charAt(i) + "" + input.charAt(j)
							+ input.charAt(j2) + " ");
				}
				
			}
		}
	}
}
