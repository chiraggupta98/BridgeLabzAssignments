import java.util.Scanner;
public class CelciusToFahrenheit{
    public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    int celcius = sc.nextInt();
	    int fahrenheit = ((9/5)*celcius) + 32;
		System.out.println(fahrenheit);
	}
}