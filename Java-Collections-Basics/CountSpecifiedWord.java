import java.util.Scanner;

public class CountSpecifiedWord {
	public static void main(String[] args) {
	Scanner scanner=new Scanner (System.in);
	
	String str = scanner.nextLine();
	String keyWord=scanner.nextLine();

	String [] words=str.split("\\W+");
	
	int count=0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(keyWord)) {
				count++;
			}
		}
		System.out.println(count);

	}
}

