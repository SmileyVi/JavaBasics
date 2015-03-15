import java.util.Scanner;
public class PointsInsideFigure {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float x=input.nextFloat();
		float y=input.nextFloat();
		input.close();
		boolean a=x>=17.499999&&x<=20&&y>=8.5&&y<=13.499999;
		boolean b=x>=12.5&&x<=22.5&&y>=6&&y<=13.5;
			if (b==true&&a==false) {
				System.out.println("Inside");
			} else if (a&&b) {
				System.out.println("Outside");
			}
			else {
				System.out.println("Outside");
			}
	}

}
