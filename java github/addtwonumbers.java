import java .util. Scanner;
 public class addtwonumbers{
   public static void main (String[]arg){
    Scanner scanner=new Scanner(System.in);

    System.out.print("enter first number:");
    int num1=scanner.nextInt();

    System.out.print("enter second number:");
    int num2=scanner.nextInt();

    int sum = num1+num2;
    System.out.println("the sum is:"+sum);
  }
}