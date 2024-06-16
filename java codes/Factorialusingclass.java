public class Factorialusingclass {
    public static void main(String[] args) {
        Factorial F = new Factorial();
        int factorial = F.fact(5);
        System.out.println("Factorial = " + factorial);
    }
}
class Factorial{
    int fact(int n)
    {
       if(n==1 || n==0)
       {
           return 1;
       } 
       else
       {
           return n*fact(n-1);
       }
    }
}
