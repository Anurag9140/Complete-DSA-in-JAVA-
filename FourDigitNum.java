import java.util.Scanner;
public class FourDigitNum {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Number:-");
    int n=sc.nextInt();
    if(n>999 && n<10000){
        System.out.println(n + " is a FourDigit Number!");}
    else{
        System.out.println(n+ "is not a FourDigit Number!");
    }

 }   
}
