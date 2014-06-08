import java.util.*;

public class HayvanNumbers {

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
		
		for (int i = 5; i <= 9; i++) {
			//number = "" + i;
			for (int j = 5; j <= 9; j++) {
				
				for (int j2 = 5; j2 <=9; j2++) {
					
					for (int k = 5; k <= 9; k++) {
						
						for (int k2 = 5; k2 <= 9; k2++) {
							
							for (int l = 5; l <= 9; l++) {
								
								for (int l2 = 5; l2 <= 9; l2++) {
									
									for (int m = 5; m <= 9; m++) {
										
										for (int m2 = 5; m2 <= 9; m2++) {
											
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
			System.out.println("No");
		}
		
	}
}
