package if_else;
import java.util.Scanner;
public class is_Integer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int x=(int)n;
        if(n-x==0){
            System.out.println("Is an integer");
        }
        else{
            System.out.println("Not an Integer");
        }
    }
}
