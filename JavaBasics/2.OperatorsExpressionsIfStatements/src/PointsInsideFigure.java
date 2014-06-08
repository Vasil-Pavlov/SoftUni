import java.util.*;

public class PointsInsideFigure {
	
	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String [] points = input.split(" ");
		
		float x = Float.parseFloat(points[0]);
		float y = Float.parseFloat(points[1]);
		
		String result = " ";
		
		if (y < 6 || y > 13.5 || x > 22.5 || x < 12.5 ||
				x > 17.5 && x < 20 && y > 8.5 ) {
			result = "Outside";
		}
		else {
			result = "Inside";
		}
		
		System.out.println(result);
	}
}
