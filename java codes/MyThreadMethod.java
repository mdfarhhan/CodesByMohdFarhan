class Demo extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread is "+currentThread());
        }
    }

}
public class MyThreadMethod {
    public static void main(String[] args) {
        Demo t1= new Demo ();
        Thread th = new Thread (t1);
        t1.start();


    }
}
