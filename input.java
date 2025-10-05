import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Radius:");
        double r=sc.nextDouble();

        double area=3.14*r*r;
        System.out.print("Area is:");
        System.out.println(area);


        // // Square of a number

        System.out.print("Enter the Number : ");
        int number=sc.nextInt();

        int square=number*number;

        System.out.print("Square of " + number + " is: ");
        System.out.println(square);


        // Take 3 number as input and print their sum
        System.out.print("Enter First Number : ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=sc.nextInt();
        System.out.print("Enter Third Number : ");
        int num3=sc.nextInt();

        int sum=num1+num2+num3;
        System.out.print("Total Sum: ");
        System.out.println(sum);

        System.out.println(5%(-2));

    }
}
