import java.util.Scanner;

public class Countnums {
	static int countnums(int n) {
		int count =0;
		while (n>0) {
			n = n/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c =sc.nextInt();
		int result = countnums(c);
		System.out.println(result);
		
	}

}
