import java.util.Scanner;
public class RectangleArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    in.close();
	    int area=a*b;
	    System.out.printf("%s",area);
	}
}
