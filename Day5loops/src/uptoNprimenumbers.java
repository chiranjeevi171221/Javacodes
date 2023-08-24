import java.util.Scanner;

public class uptoNprimenumbers {
	static boolean prime3way(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	static void primerange(int d) {
		int count =0;
		for(int i=2; count <d ; i++) {
			if(prime3way(i)) {
				System.out.println(i);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c = sc.nextInt();
		
		primerange(c);
	}
	}
