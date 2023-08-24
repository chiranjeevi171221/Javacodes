import java.util.*;
public class RectanglePeremeter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		
		int peremeter = 2 * (length + width);
		
		System.out.println(peremeter);
	}

}
