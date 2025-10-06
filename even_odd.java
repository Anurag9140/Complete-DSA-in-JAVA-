package if_else;

import java.util.Scanner;

public class even_odd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even Number");
    }
        else{
            System.out.println("Odd Number");}

//        Take a positive number as input and tell whether it is divisible by 5 or not!

        int number = sc.nextInt();
        if (number % 5 == 0) {
            System.out.println("Number is divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");

        }

    }
}



