import java.util.*;

public class DecimalToHexadecimal {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		String hexadecimal = Integer.toHexString(number);
		
		System.out.println(hexadecimal);
	}
}
