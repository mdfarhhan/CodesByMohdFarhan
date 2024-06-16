import java.util.Scanner;

public class PalinString {
    public static void main(String[] args) {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a String: ");
        str = in.nextLine();
        System.out.println(checkpalin(str));
        

    }
    static boolean checkpalin(String str){
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            int start = str.charAt(i);
            int end = str.charAt(str.length()-1-i);
            if (start!=end) {
                return false;
            }
        }
        return true;
    }
}
