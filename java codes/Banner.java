import java.awt.*;

public class Banner {
    public static void main(String args[]) {
        MyFrame fr = new MyFrame("example");
        fr.setBounds(40, 90, 100, 90);
        fr.setVisible(true);
        MV t = new MV(fr);
        t.start();

    }
}

class MyFrame extends Frame {

    MyFrame(String nm) {
        super(nm);
    }

    public String str = "hello";

    public void paint(Graphics g) {

        g.drawString(str, 100, 200);
    }
}

class MV extends Thread {
    MyFrame fr1;

    MV(MyFrame f) {
        fr1 = f;

    }

    public void run() {
        while (true) {
            fr1.str = fr1.str.substring(1, fr1.str.length()) + fr1.str.charAt(0);
            fr1.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block

            }

        }
    }

}