import java.util.Scanner;
public class TheSmallestOfThree {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			double a= input.nextDouble();
			double b= input.nextDouble();
			double c= input.nextDouble();
		input.close();
			boolean smallestA=(a<b)&&(a<c);
			boolean smallestB=(b<a)&&(b<c);
		if (smallestA){
			System.out.print(a);
			}
		else if (smallestB){
			System.out.println (b);
			}
		else {
			System.out.println (c);
		}
	} 
}


