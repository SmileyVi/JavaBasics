import java.util.*;

	public class RandomHandsOfFiveCards {
		public static void main(String[] args) {
			String[] face = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
			char[] suit = {'\u2660', '\u2665', '\u2666', '\u2663'};
			
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of hands: ");
			
			int hands = Integer.parseInt(input.nextLine());
			ArrayList<String> deck = new ArrayList<String>(52);
			
			for (int i = 0; i < face.length; i++) { 
				for (int j = 0; j < suit.length; j++) {
					String card = face[i] + suit[j];
					deck.add(card);
				}
			}
			for (int i = 0; i < hands; i++) {
				Collections.shuffle(deck);
				for (int j = 0; j < 5; j++) {
					System.out.printf("%s ", deck.get(j)); 
				}
				System.out.println();
			}
		}
	}