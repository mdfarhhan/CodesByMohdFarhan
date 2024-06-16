public class Box{
    public static void main (String ar[])
    {
       VolSurface Objects = new VolSurface();
       Objects.input(4,6,2);
       Objects.Surface();
       Objects.volume();
       Objects.display(); 
    }
}
class VolSurface {
    int l,b,h,area,vol,length,width,height;
    public void input(int length,int width, int height)
    {
        l=length;
        b=width;
        h=height;

    }
    void Surface()
    {
        area = (2*(l*b)*h)+(l*b);
    }
    void volume()
    {
        vol = l*b*h;
    }
    void display()
    {
        System.out.println("total surface area of box = " + area + " and volume of box = " + vol);
    }

}
