import java.util.*;

public class MultiandAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int m = sc.nextInt();
		if(c%2==0 && m%2==0) {
			System.out.println(c*m);
		}
		else {
			System.out.println(c+m);
		}

	}

}
