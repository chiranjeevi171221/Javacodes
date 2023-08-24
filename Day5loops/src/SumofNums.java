import java.util.Scanner;

public class SumofNums {
	
	static int sumofnums(int n) {
		int sum=0;
		while(n>0) {
			int rem = n%10;
			sum = sum + rem;
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c = sc.nextInt();
		int result = sumofnums(c);
		
		System.out.println(result);

	}

}
