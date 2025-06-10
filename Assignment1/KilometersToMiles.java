import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    int distance = sc.nextInt();
	    double miles = distance * 0.621371;
		System.out.println(miles);
	}
}
