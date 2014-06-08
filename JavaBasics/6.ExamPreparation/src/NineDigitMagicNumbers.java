import java.util.*;

public class NineDigitMagicNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = scanner.nextInt();
		int diff = scanner.nextInt();
		String abc = "";
		String def = "";
		String ghi = "";
		int firstDiff = 0;
		int secondDiff = 0;
		String number = " ";
		int total = 0;
		int counter = 0;
		
		for (int i = 1; i <= 7; i++) {
			//number = "" + i;
			for (int j = 1; j <= 7; j++) {
				
				for (int j2 = 1; j2 <=7; j2++) {
					
					for (int k = 1; k <= 7; k++) {
						
						for (int k2 = 1; k2 <= 7; k2++) {
							
							for (int l = 1; l <= 7; l++) {
								
								for (int l2 = 1; l2 <= 7; l2++) {
									
									for (int m = 1; m <= 7; m++) {
										
										for (int m2 = 1; m2 <= 7; m2++) {
											
											number = "" + i +j + j2 + k + k2+
													l + l2 + m + m2;
											abc = "" +i + j + j2;
											def = "" + k + k2 + l;
											ghi = "" + l2 + m + m2;
						
											total = i +j + j2 + k + k2+
													l + l2 + m + m2;
											firstDiff = Integer.parseInt(ghi) - Integer.parseInt(def);
											secondDiff = Integer.parseInt(def) - Integer.parseInt(abc);
											
											if (Integer.parseInt(abc) <= Integer.parseInt(def) &&
													Integer.parseInt(def) <= Integer.parseInt(ghi)) {
												
												if (total == sum && firstDiff == secondDiff 
														&& firstDiff == diff) {
													System.out.println(number);
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
			}
		}
		
		if (counter == 0) {
			System.out.println("No nine-digit magic numbers with sum=" + sum
					 + " and diff=" + diff);
		}
		
	}
}
