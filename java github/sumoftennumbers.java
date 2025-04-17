import java.util.Scanner;

public class sumoftennumbers{
 public static void main(String[]args){
  Scanner scanner=new Scanner(System.in);
  int sum=0;
 
  System.out.println("enter 10 numbers:");
  for (int i=1;i<=10;i++){
     System.out.print("enter number"+i+":");
     int number = scanner.nextInt();
     sum+=number;
  }
  System.out.println("The sum of the 10 number is : " +sum);
  
  scanner.close();
 }
}