import java.util.*;

	public class AngleUnitConverter {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter how many conversions you would like: ");
			
			int n = Integer.parseInt(input.nextLine());
			String[] convertedType = new String[n];
			
			double[] convertedValues = new double[n];
			
			for (int i = 0; i < n; i++) {
				double numValue = input.nextDouble();
				
				String typeValue = input.next();
				
				if (typeValue.equals("rad")) { //saves the inverted type in the convertedType array
					convertedType[i] = "deg";
				}
				else {
					convertedType[i] = "rad";
				}
				convertedValues[i] = unitConverter(numValue, typeValue); //saves the converted values in the convertedValues array
			}
			for (int i = 0; i < n; i++) {
				System.out.printf("%.6f %s\n", convertedValues[i], convertedType[i]);
			}
		}
		public static double unitConverter(double val, String type) {
			if (type.equals("rad")) {
				return Math.toDegrees(val);
			}
			else {
				return Math.toRadians(val);
			}
		}
	}