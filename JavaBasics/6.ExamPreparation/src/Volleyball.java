import java.util.*;

public class Volleyball {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String isLeap = scanner.nextLine();
		int holidays = scanner.nextInt();
		int weekends = scanner.nextInt();
		int weekendsNotHome = 48 - weekends;
		double total = ((2.0 / 3.0) * holidays) + weekends + weekendsNotHome * (3.0 / 4.0);
		double leap = 0.15 * total;
				//
		
		if (isLeap.matches("leap")) {
			total += leap;
		}
		
		System.out.println((int)(Math.floor(total)));
	}
}
