import java.util.Scanner;

public class Primenumbers2ndway {
	static void primenumber(int n) {
		for(int i = 2; i<=n/2;i++) {
			if(n%i == 0) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime number");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c = sc.nextInt();
		primenumber(c);

	}

}
