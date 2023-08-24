import java.util.Scanner;

public class Threedigitnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c >= 100 && c<=999) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
