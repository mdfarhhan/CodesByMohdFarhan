import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.io.*;
import java.awt.*;

public class ButtonClickFile {
   public static void main(String[] args) throws Exception {

      JButton button1 = new JButton("One");
      Icon icon = new ImageIcon("E:\\editicon.PNG");
      Box box = Box.createVerticalBox();
      box.add(button1);
      JFrame frame = new JFrame();
      frame.add(box);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationByPlatform(true);
      frame.setSize(500, 300);
      frame.setVisible(true);

      FileReader fr = new FileReader("DSLab.txt");
      BufferedReader br = new BufferedReader(fr);
      String fst = "";
      String str = br.readLine();
      while (str != null) {
         fst = fst + str + "\n";
         str = br.readLine();
      }
      MyFrame mf = new MyFrame("example");
      mf.setBounds(70, 100, 90, 150);
      mf.setVisible(true);
      mf.repaint();
   }

}

class MyFrame extends Frame {

   MyFrame(String nm) {
      super(nm);
   }

   public void paint(Graphics g, String fst) {

      g.drawString(fst, 100, 200);
   }
}