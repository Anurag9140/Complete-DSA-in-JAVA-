import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Square pattern of NUmbers
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Square Pattern of Letters

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }

        // Square pattern of small letters of English alphabet
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }

        // Print Pattern 1111 2222 3333 4444 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // Print Patterns like AAAA BBBB CCCC DDDD

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
       
    }
}
