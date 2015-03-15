
import java.util.Scanner;

public class SequencesОfEqualStrings {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		
		String str=scanner.nextLine();
		String [] sequence=str.split(" ");
						
		System.out.print(sequence[0]);
			for (int i = 1; i < sequence.length; i++) {
				if (sequence[i].equals(sequence[i - 1])) {
					System.out.print(" " + sequence[i]);
				} else {
					System.out.println();
					System.out.print(sequence[i]);
				}
			}
		}
}
