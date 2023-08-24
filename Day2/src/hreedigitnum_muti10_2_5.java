import java.util.Scanner;

public class hreedigitnum_muti10_2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c >= 100 && c<=999 && c%10 == 0 && c%2 == 0 && c%5 == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
