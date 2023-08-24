import java.util.Scanner;

public class PositiveandNwgative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c>0) {
			System.out.println("Positive");
		}
		else if (c<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}

	}

}
