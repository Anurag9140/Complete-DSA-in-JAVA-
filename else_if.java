import java.util.Scanner;
public class else_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int num=sc.nextInt();

        if(num%5==0 && num%3 ==0){
            System.out.println("Number is Divisible by Both 3 and 5");
        }
        else if(num%3==0){
            System.out.println("Number is divisible by 3");
        }
        else if(num%5==0){
            System.out.println("Number is Divisible by  5");
        }
        else{
            System.out.println("Number is not divisible by both 3 and 5");
        }


        // Take length and breadth of a reactangle and check whther area if greater thanperimeter or not
        System.out.print("Enter Length:");
        int l=sc.nextInt();

        System.out.print("Enter Length:");
        int b=sc.nextInt();

        
        int p=2*(l+b);
        System.out.println("Perimeter is:"+p);

        
        int area=l*b;
        System.out.println("Area is:"+area);

        if(area>p){
            System.out.println("Area is greater than perimeter");
        }
        else if (area==p) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Perimeter is greater than area");
        }



       

        
    }
}
