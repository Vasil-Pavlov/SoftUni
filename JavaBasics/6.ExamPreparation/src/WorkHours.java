import java.util.*;

public class WorkHours {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hours = scanner.nextInt();
		int days = scanner.nextInt();
		int productivity = scanner.nextInt();
		
		double workingHours = days - (0.1 * days);
		double total = (Math.floor((workingHours * 12) * 0.01 * productivity));
		
		if ((int)(total) - hours >= 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.println((int)(total) - hours);
	}

}
