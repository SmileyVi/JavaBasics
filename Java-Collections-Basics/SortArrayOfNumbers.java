
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner (System.in);
		
		
		int n= scanner.nextInt();
		scanner.nextLine();
		
		String [] numbers=new String [n];
		for (int i=0; i<n; i++){
		numbers[i]=scanner.next();
		}
		
			Arrays.sort(numbers);
			for (int i=0; i<numbers.length;i++){
				System.out.print(numbers[i]+ " ");
			}

	}

}
