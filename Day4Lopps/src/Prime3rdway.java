import java.util.*;
public class Prime3rdway {
	
	static void prime3way(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i == 0) {
				System.out.println("Not prime");
			}
		}
		System.out.println("prime");
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c = sc.nextInt();
		
		prime3way(c);
	}

}
