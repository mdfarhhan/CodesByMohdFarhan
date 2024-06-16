class MThread2
{
        public static void main(String ar[])
        {
                
                MyThread1 th=new MyThread1();
                Thread t=new Thread(th);
                t.start();
                try
                {
                        Thread.sleep(100);
                        System.out.println("Main");
                }
                catch(Exception e)
                {
                        System.out.println(e.getMessage());
                }
        }
}
class MyThread1 implements Runnable
{
        public void run()
        {
                for(int i=1;i<=10;i++)
                {
                        System.out.println("i="+i);
                }
        }
}