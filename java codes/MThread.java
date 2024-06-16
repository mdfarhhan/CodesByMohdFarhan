class MThread
{
        public static void main(String ar[])
        {
                MyThread th=new MyThread();
                Thread t=new Thread(th);
                t.start();
                try
                {
                        //System.in.read();
                        System.out.println("Main");
                }
                catch(Exception e)
                {
                        System.out.println(e.getMessage());
                }
        }
}
class MyThread implements Runnable
{
        public void run()
        {
                for(int i=1;i<=10;i++)
                {
                        System.out.println("i="+i);
                }
        }
}

