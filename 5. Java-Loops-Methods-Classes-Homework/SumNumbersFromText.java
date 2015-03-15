import java.io.*;
import java.util.*;

	public class SumNumbersFromText {
		public static void main(String[] args) {
			BufferedReader reader;
			double sum = 0;
			try {
				reader = new BufferedReader(new FileReader("src/Homework3/Input08.txt"));
				String line = null;
				while ((line = reader.readLine()) != null) {
					sum += Double.parseDouble(line);
				}
				reader.close();
				System.out.println(sum);
			}
			catch (FileNotFoundException notFound) {
				System.out.println("File not found");
			}
			catch (IOException err) {
				System.out.println("Error" + err.getMessage());
			}
/*File file = new File("src/Input.txt");
double sum = 0;
try {
Scanner sc = new Scanner(file);
while (sc.hasNext()) {
sum += Double.parseDouble(sc.nextLine());
}
sc.close();
System.out.println(sum);
} catch (FileNotFoundException e) {
System.out.println("File not found!");
} catch (IOException ioe) {
System.out.println("Error");
}
*/
		}
	}

    

