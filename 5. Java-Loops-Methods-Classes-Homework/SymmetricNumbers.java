import java.util.*;

	public class SymmetricNumbers {
		public static void main(String[] args) {
	
			Scanner input = new Scanner(System.in);
				int a = Integer.parseInt(input.nextLine());
				int b = Integer.parseInt(input.nextLine());
				for (int i = a; i <= b; i++) {
					if (i < 10 && i >= 0) {
						System.out.print(i + " ");
					}
					if (i < 100) {
						if ((i /10) == (i % 10)){
							System.out.print(i + " ");
						}
					}
					if (i > 99 && i <= 999) {
						if ((i / 100) == (i % 10)) {
							System.out.print(i + " ");
						}
					}
				}
		}
}