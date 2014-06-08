import java.util.*;

public class JoroTheFootballPlayer {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String isLeap = scanner.next();
		int holidays = scanner.nextInt();
		int weekendsHometown = scanner.nextInt();
		int normalWeekends = 52 - weekendsHometown;
		double holidaysPlay = 0.5 * holidays;
		double normalWeekendsPlay = ((2.0/3.0) * normalWeekends);
		
		double total = holidaysPlay + weekendsHometown + normalWeekendsPlay; 
		
		if (isLeap.matches("t")) {
			total += 3;
		}
		
		System.out.println((int)(Math.floor(total)));
		
	}
	
	
	

	
}
