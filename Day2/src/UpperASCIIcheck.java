import java.util.Iterator;
import java.util.Scanner;

public class UpperASCIIcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c >= 65 && c <= 90) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
