import java.awt.*;
public class Face {
    public static void main(String[] args) throws Exception {
        MyFrame mf = new MyFrame("example");
        mf.setBounds(30, 40, 500, 400);
        mf.setVisible(true);

        
    }
}
class MyFrame extends Frame {
    MyFrame(String nm){
        super(nm);
    }
    public void paint(Graphics g)
    {
        g.drawLine(120, 130, 280, 130);
        g.drawLine(120, 130, 200, 65);
        g.drawLine(200, 65, 280, 130);
        g.drawLine(135, 140, 160, 140);
        g.drawLine(240, 140, 265, 140);
        g.drawLine(185, 160, 215, 160);
        g.drawArc(120, 70, 160, 125, 0, -180);
        
        //g.drawOval(150, 65, 160, 160);
        ///draw rect 
        //fill rect
        //drawoval
        //setcolourmethod
        //colouroval
        //setbackground
        //drawarc 
        //drawstring

        //repaint method-->call itself onetime

    }
}
