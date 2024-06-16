import java.util.Scanner;

public class Empolyee {

    int empolyeeid;
    String name;
    float salary;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the empolyee id: ");
        empolyeeid = in.nextInt();
        System.out.println("enter the empolyee name : ");
        name = in.next();
        System.out.println("enter the Salary: ");
        salary = in.nextFloat();
        in.close();
    }

    public void display() {
        System.out.println("empolyee id = " + empolyeeid);
        System.out.println("empolyee name" + name);
        System.out.println("empolyee salary" + salary);
    }

    public static void main(String[] args) {
        Empolyee e[] = new Empolyee[5];
        for (int i = 0; i < 5; i++) {
            e[i] = new Empolyee();
            e[i].input();

        }
        System.out.println("*Data Entered as below*:");
        for (int i = 0; i < 5; i++) {
            e[i].display();
        }
    }
}
