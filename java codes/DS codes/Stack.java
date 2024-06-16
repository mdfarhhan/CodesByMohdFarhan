public class Stack
{
public static void main(String[] args)
{
// {    Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//     int arr[]=new int[n];
    Stack1 ob=new Stack1();
    ob.push(12);
    ob.push(2);
    ob.push(25);
    ob.pop();
    ob.push(23);
    ob.pop();
   System.out.println(ob.peek());
   
   
}
}
class Stack1

{  
   static int n=3;
   static int arr[]=new int[n];

   static int top=-1;
    void push(int x)
    {
       if(top>=n-1)
       {
           System.out.println("Stack Overflow");
       }
       top++;
       arr[top]=x;
    }
   int  pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        int result=arr[top];
        top--;
        return result;  
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    int peek()
    {  if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        return arr[top];
    }
   
}