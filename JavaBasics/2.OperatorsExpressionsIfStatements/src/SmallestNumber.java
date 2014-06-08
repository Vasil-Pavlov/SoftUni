import java.util.*;

public class SmallestNumber {

	public static void main(String [] args){
		
		Scanner scanner = new Scanner(System.in);
		
		float firstNumber = scanner.nextFloat();
		float secondNumber = scanner.nextFloat();
		float thirdNumber = scanner.nextFloat();
		float smallestNumber = 0;
		
		if (firstNumber < secondNumber && firstNumber < thirdNumber) {
			smallestNumber = firstNumber;
		}
		else if (secondNumber < firstNumber && secondNumber < thirdNumber) {
			smallestNumber = firstNumber;
		}
		else {
			smallestNumber = thirdNumber;
		}
		
		System.out.println(smallestNumber);
	}
}
