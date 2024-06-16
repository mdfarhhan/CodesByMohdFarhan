import java.util.Scanner;

public class P56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int j=0;
        for(int i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                j++;
            }
        }
        System.out.println(j);

    }
}
