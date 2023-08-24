import java.util.Scanner;

public class DollorToRupee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int doller = sc.nextInt();
		double inr = doller * 82.73;
		
		System.out.printf("%.4f",inr);

	}

}
