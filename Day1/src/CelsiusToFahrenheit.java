import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// fahrenheit= (celsius*9/5)+32
		Scanner sc = new Scanner(System.in);
		int celsius = sc.nextInt();
		float fahrenheit = (celsius * 9.0f/5) + 32;
		System.out.printf("%.1f",fahrenheit);
	}

}
