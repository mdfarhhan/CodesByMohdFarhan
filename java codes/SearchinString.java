import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "Mohd Farhan";
        char ch = 'r';
        int ans = linearserch(name, ch);
        System.out.println("index of element is: " + ans);

    }

    static int linearserch(String name, char ch) {
        for (int i = 0; i <name.length(); i++) {
            if (ch == name.charAt(i)){
                return i;
            }
        }
        return -1;

    }
}
