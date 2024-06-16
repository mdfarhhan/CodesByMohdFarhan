import java.io.*;
import java.util.Stack;
 
class prefix {
 
    static Boolean isOperand(char c)
    {
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }
 
    static double evaluatePrefix(String exprsn)
    {
        Stack<Integer> stack = new Stack<>();
 
        for (int j = exprsn.length() - 1; j >= 0; j--) {
            if (isOperand(exprsn.charAt(j)))
                stack.push((double)(exprsn.charAt(j) - 48));
 
            else {
                double o1 = stack.peek();
                stack.pop();
                double o2 = stack.peek();
                stack.pop();
                switch (exprsn.charAt(j)) {
                case '+':
                    stack.push(o1 + o2);
                    break;
                case '-':
                    stack.push(o1 - o2);
                    break;
                case '*':
                    stack.push(o1 * o2);
                    break;
                case '/':
                    stack.push(o1 / o2);
                    break;
                }
            }
        }
 
        return stack.peek();
    }
 
    public static void main(String[] args) throws Exception
    {
        String exprsn = "+9*26";
        System.out.println(evaluatePrefix(exprsn));
    }
}