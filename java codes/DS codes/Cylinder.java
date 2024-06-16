public class Cylinder {
    public static void main(String[] args) {
        Shape Objects = new Shape();
        Objects.input(5,5);
        Objects.Surface();
        Objects.volume();
        Objects.display();
        

        
    }
}
class Shape{
    int radius,height,r,h;
    double area , vol;
    void input(int radius, int height)
    {
        r= radius;
        h= height;
    }
    void Surface()
    {
        area = (2*(2*3.14*r*r))+(2*3.14*r*h);
    }
    void volume()
    {
        vol = 3.14*r*r*h; 
    }
    void display()
    {
        System.out.println("Total surface area of cylinder = " + area +" and volume of cylinder is " + vol );
    }
}
