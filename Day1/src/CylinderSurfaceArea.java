import java.util.*;
public class CylinderSurfaceArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// Formula: 2 * pi* r*(r+h)
		int radius = sc.nextInt();
		int height = sc.nextInt();
		
		double area = 2 * 3.142 * radius * (radius + height);
		
		System.out.printf("%.4f",area);
	}

}
