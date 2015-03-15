import java.util.Scanner;
public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		double b=input.nextDouble();
		double c=input.nextDouble();
		input.close();
		String aBinStr = Integer.toBinaryString(a);
		int BinaryA = Integer.parseInt(aBinStr);
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|", a, BinaryA, b, c);
		
		
	}

}
