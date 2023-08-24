import java.util.Scanner;

public class Factorsfornumbers {
	static void printFactor(int n) {
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		
		Factorsfornumbers.printFactor(c);

	}

}
