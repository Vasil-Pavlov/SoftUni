import java.util.*;

public class MagicStrings {
	
	public static int CalculateWeight(String word){
		
		int result = 0;
		int sWeight = 3;
		int nWeight = 4;
		int kWeight = 1;
		int pWeight = 5;
		
		for (int i = 0; i < word.length(); i++) {
			
			if (word.charAt(i) == 'p') {
				
				result += pWeight;
			}
			else if (word.charAt(i) == 'k') {
				
				result += kWeight;
			}
			else if (word.charAt(i) == 'n') {
				
				result += nWeight;
			}
			else {
				
				result += sWeight;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		int diff = scanner.nextInt();
		String[] letters = new String []{"s" , "n" , "p" , "k"};
		String firstHalf = "";
		String secondHalf = "";
		int counter = 0;
		
		for (int i = 0; i < letters.length; i++) {
			
			firstHalf = " ";
			secondHalf = " ";
			for (int j = 0; j < letters.length; j++) {
				
				for (int j2 = 0; j2 < letters.length; j2++) {
					
					for (int k = 0; k < letters.length; k++) {
						
						firstHalf = letters[i] + letters[j] + letters[j2] + letters[k];
						
						for (int k2 = 0; k2 < letters.length; k2++) {
							
							for (int l = 0; l < letters.length; l++) {
								
								for (int l2 = 0; l2 < letters.length; l2++) {
									
									for (int m = 0; m < letters.length; m++) {
										
										secondHalf = letters[k2] + letters[l] + letters[l2] + letters[m];
										
										if ((int)(Math.abs(CalculateWeight(firstHalf) -
												CalculateWeight(secondHalf))) == diff) {
											
											System.out.println(firstHalf + secondHalf);
											counter ++;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (counter < 1) {
			
			System.out.println("No magic strings match the specified difference diff");
		}
	}
}
