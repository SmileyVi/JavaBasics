import java.util.*;

	public class GenerateWords {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Input: ");
			String let = input.nextLine();
			
			char[] letters = let.toCharArray();
			for (int i1 = 0; i1 < letters.length; i1++) {
				for (int i2 = 0; i2 < letters.length; i2++) {
					for (int i3 = 0; i3 < letters.length; i3++) {
						System.out.printf("%s%s%s", letters[i1], letters[i2], letters[i3] + " ");
					}
				}
			}
		}
}