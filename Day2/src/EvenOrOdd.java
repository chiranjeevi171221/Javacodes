import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		if(c%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd");
		}

	}

}
