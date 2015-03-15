 import java.util.Scanner;

public class SumTwoNumbers {

   public static void main(String[] args) {

       
       int a;
       int b;
       Scanner in = new Scanner(System.in);
       
       a = in.nextInt();
       b=in.nextInt();
       in.close();
       int result=a+b;            
       System.out.println(result);
      
    }
}