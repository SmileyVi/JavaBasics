import java.util.Scanner;
	public class CountOfBitsOne {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			input.close();
		System.out.println(Integer.bitCount(n)); 
	}	
}

