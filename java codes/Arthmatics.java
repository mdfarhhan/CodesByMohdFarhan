
public class Arthmatics{
    public static void main (String ar[])
    {
        Maths1 cal = new Maths1();
        cal.input(3);
        cal.Square();
        cal.Cube();
        cal.display(); 
    }
}
class Maths1{
    int s,n,a,b;
    void input (int s)
    {
        n=s;
    }
    void Square()
    {
        a=n*n;
    }
    void Cube()
    {
        b=n*n*n;
    }
    void display()
    {
        System.out.print( "square = "+a + ", Cube = "+ b);
    }
}
