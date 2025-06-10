import java.util.Scanner;
public class VolumeOfCylinder {
    public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    int radius = sc.nextInt();
	    int height = sc.nextInt();
	    double area = 3.14 * Math.pow(radius,2) * height;
		System.out.println(area);
	}
}
