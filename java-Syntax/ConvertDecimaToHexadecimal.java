import java.util.Scanner;
public class ConvertDecimaToHexadecimal {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int decimal=input.nextInt();
		input.close();
		String hex = Integer.toHexString(decimal);
		System.out.println(hex);

	}

}
