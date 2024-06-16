public class Multithread {
    public static void main(String[] args) {
        Mythread th = new Mythread();
        Thread t1 = new Thread(th);
        t1.start();
        
        
    }
}
class Mythread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = "+i);
        }
    }
}
