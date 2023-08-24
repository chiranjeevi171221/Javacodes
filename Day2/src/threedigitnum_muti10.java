import java.util.Scanner;

public class threedigitnum_muti10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c >= 100 && c<=999 && c % 10 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
