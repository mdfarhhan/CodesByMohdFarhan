public class ExceptionEx3 {
    public static void main(String[] args) {
        String a=null;
        try {
            a.toCharArray();
        } catch (Exception e) {
            System.out.println("Null Point Exception Occur! ");
        }
    }
}
