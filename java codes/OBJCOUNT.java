class OBJCOUNT
{
    static int c=0;
    OBJCOUNT()
    {
        c++;
    }
	void display()
        {
            System.out.print("number of object created: "+c);
        }  
    public static void main(String ar[])
    {
        OBJCOUNT a = new OBJCOUNT();
        OBJCOUNT b = new OBJCOUNT();
        b.display();
        
    }

}