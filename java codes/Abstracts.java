class Abstract1{
    public static void main(String[] args)
    {
        C a= new C();
        a.dimension(2, 2, 2);
        a.volume();
    
    }
    }
    abstract class P{
        int length;
        int breadth;
        int height;
        void dimension(int l, int b, int h){
            length=l;
            breadth=b;
            height=h;
        }
        abstract void volume();
    }
    
    class C extends P{
        void volume(){
            System.out.println("The volume of cuboid is "+length*breadth*height);
    
        }
    
    }