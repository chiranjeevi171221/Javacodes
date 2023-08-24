import java.util.*;
public class Nevennums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i=1;i<=c;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

	}

}
