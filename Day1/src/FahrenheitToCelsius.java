import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		//  celsius = (fahrenheit-32)*5/9
		Scanner sc = new Scanner(System.in);
		int fahrenheit = sc.nextInt();
		float celsius = (fahrenheit - 32)* 5.0f/9;
		System.out.printf("%.4f",celsius);
	}

}
