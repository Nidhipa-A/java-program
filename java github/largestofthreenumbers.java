import java .util.Scanner;
 public class largestofthreenumbers {
   public static void main (String []args){
     Scanner scanner =new Scanner(System.in);
     int num1,num2,num3;
     System.out.println ("Enter the First Number:");
     num1 = scanner.nextInt();

     System.out.println ("Enter the Second Number:");
     num2 = scanner.nextInt();
   
     System.out.println ("Enter the Thrid Number:");
     num3 = scanner.nextInt();

     int largest;
     if (num1>=num2&&num1>=num3){
         largest=num1;
     } else if (num2>=num1&&num2>=num3){
         largest=num2;
        } else {
            largest=num3;
          }
     System.out.println ("The largest number is "+largest);
     
     scanner.close ();
  }
}
