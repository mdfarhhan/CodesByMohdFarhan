class TimeSeries2
{
        public static void main(String ar[])
        {
                
                MyThread4 th=new MyThread4();
                Thread t=new Thread(th);
                t.start();
                try
                {
                        Thread.sleep(10000);
                        System.out.println("Main");
                }
                catch(Exception e)
                {
                        System.out.println(e.getMessage());
                }
        }
}
class MyThread4 implements Runnable
{
        int h=4,m=59,s=53;

        public void run()
        {
                for(int i=1;i<=10;i++)
                {
                        if(s>=60){m++;s=0;}
                        if(m>=60){h++;m=0;}
                        System.out.println(h+":"+m+":"+s);
                        s++;
                        try
                        {
                                Thread.sleep(1000);
                        }
                        catch(InterruptedException e){}
                }
        }
}
