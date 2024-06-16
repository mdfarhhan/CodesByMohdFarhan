import java.awt.*;
class MyFrame extends Frame{
    public Object str;
    MyFrame(String nm)
    {
        super(nm);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.drawRect(100, 200, 300, 100);
        g.fillRect(100, 200, 100, 100);
        g.setColor(Color.BLUE);
        g.fillRect(200, 200, 200, 100);
        g.drawLine(200, 200, 200, 300);
        g.drawLine(150, 100, 100, 200);
        g.drawLine(150, 100, 200, 200);
        g.drawLine(150, 100, 350, 100);
        g.drawLine(350, 100, 400, 200);
        g.drawOval(140, 150, 20, 20);
        g.setColor(Color.YELLOW);
        g.fillOval(140, 150, 20, 20);
        g.setColor(Color.GREEN);
        g.drawRect(140, 250, 20, 50);
        g.fillRect(140, 250, 20, 50);
        g.setColor(Color.PINK);
        g.drawRect(250,225,20,20);
        g.fillRect(250,225,20,20);
        g.setColor(Color.PINK);
        g.drawRect(350,225,20,20);
        g.fillRect(350,225,20,20);


    }
}
public class Hut{
    

    public static void main(String args[])
    {
       MyFrame fr=new MyFrame("Example");
       fr.setBounds(40,90,100,90);
       fr.setVisible(true);
    }
    
}