import java.util.Scanner;

public class LowerASCIIcheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c >=97 && c <=127) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
