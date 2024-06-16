import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number of lines in pattern you want to print: ");
        int n = in.nextInt();
        pattern6(n);
    }
    static void pattern1(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }


    }
    static void pattern3(int n){
        for (int i = 1; i <=n; i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }


    }
    static void pattern4(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
    static void pattern5(int n){
        for (int i = 1; i <=2*n; i++) {
            int p = i>n ? 2*n-i:i;
            for (int j = 1; j <=p; j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }


    }
    static void pattern6(int n){
        for (int i = 1; i <=2*n; i++) {
            int p = i>n ? 2*n-i:i;
            for (int j2 = 0; j2 < n-p; j2++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=p; j++) {
                
                System.out.print("+ ");
            }
            System.out.println();
        }


    }
}
