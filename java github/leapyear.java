import java.util.Scanner;
 public class leapyear{
  public static void main (String[]args){
   Scanner scanner = new Scanner(System.in);
   System.out.println("enter a year :");
   int year=scanner.nextInt();
   boolean isleapyear; 
   if (year%4==0){
     isleapyear=true;
   } else{
      isleapyear=false;
    }
   if (isleapyear){
      System.out.println (year+"is a leap year.");
   } else{ 
       System.out.println (year+"is not a leap year.");
    }
   scanner.close(); 
 }
}