import java.util.Scanner;
public class side_of_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Side: ");
        int a=sc.nextInt();

        System.out.print("Enter 2nd Side: ");
        int b=sc.nextInt();

        System.out.print("Enter 3rd Side: ");
        int c=sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("These are valid sides of a Triangle");
        }
        else{
            System.out.println("These are not a valid soides of a Trinagle");
        }
    }
}
