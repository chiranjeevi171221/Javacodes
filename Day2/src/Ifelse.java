import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c%3 == 0 && c%5 == 0) {
			System.out.println("BTM");
		}
		else if(c%3 ==0) {
			System.out.println("TAP");
		}
		else if(c%5 ==0) {
			System.out.println("ACAD");
		}
		else{
			System.out.println("NOTHING");
		}
	}

}
