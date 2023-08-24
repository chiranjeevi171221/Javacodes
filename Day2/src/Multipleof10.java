import java.util.Scanner;

public class Multipleof10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c%10 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}


}
