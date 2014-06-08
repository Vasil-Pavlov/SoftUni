import java.util.*;

public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String aCoordinates = scanner.nextLine();
		String bCoordinates = scanner.nextLine();
		String cCoordinates = scanner.nextLine();
		
		String [] a = aCoordinates.split(" ");
		String [] b = bCoordinates.split(" ");
		String [] c = cCoordinates.split(" ");
		
		int aX = Integer.parseInt(a[0]);
		int aY = Integer.parseInt(a[1]);
		int bX = Integer.parseInt(b[0]);
		int bY = Integer.parseInt(b[1]);
		int cX = Integer.parseInt(c[0]);
		int cY = Integer.parseInt(c[1]);
		
		double area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
		
		System.out.println((int)(area));
		
	}

}
