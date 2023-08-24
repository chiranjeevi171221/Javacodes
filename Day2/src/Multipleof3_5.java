import java.util.Scanner;

public class Multipleof3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c%5 == 0 && c%3 ==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
