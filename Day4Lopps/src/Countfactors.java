import java.util.Scanner;

public class Countfactors {

		static int printFactor(int n) {
			int count = 0;
			for(int i=1;i<=n;i++) {
				if (n%i==0) {
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int c = sc.nextInt();
			
			int result = printFactor(c);
			System.out.println(result);

	}

}
