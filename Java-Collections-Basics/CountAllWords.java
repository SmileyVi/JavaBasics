
import java.util.Scanner;

public class CountAllWords {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		scanner.nextLine();
		String str=scanner.nextLine();
		String [] words=str.split("\\w+");
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {
		count++;
		}
		System.out.println(count);
	}
}
		
