import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;
import java.awt.BorderLayout;
class Manchester_City_VS_Bayren_Munchen {
    static void myGameText() throws InterruptedException {
        System.out.println("Hello watchers and welcome to the friendly game between Manchester City and Bayren Munchen in Lambeau Field, Green Bay, Wisconsin, U.S.A.");
        Thread.sleep(2000);
        System.out.println("This is City' starting 11 in a 4-3-3 formation:");
        Thread.sleep(2000);
        System.out.println("      J. Grealish    Halland    R. Marhrez      ");
        Thread.sleep(2000);
        System.out.println("     B. Silva     R. Hernandez  K. De Bruyne ");
        Thread.sleep(2000);
        System.out.println("G. Wilson-Asbrand    R. Dias   N. Ake   J. Canselo ");
        
        System.out.println("This is Bayren's starting 11 in a 4-2-3-1 formation:");
        Thread.sleep(2000);
        System.out.println("                   T. Muller                    ");
        Thread.sleep(2000);
        System.out.println(" K. Coman          S. Gnabry       L. Sane");
        Thread.sleep(2000);
        System.out.println("       M. Stabzier          J. Kimmich");
        Thread.sleep(2000);
        System.out.println("B. Parr    D. Opamechano   L. Hernandes   A. Davies ");
        Thread.sleep(2000);
        System.out.println("The game will start late due to the heavy rain with the chance of lightning bolts around the area.");
        Thread.sleep(2000);
        System.out.println("And here the game starts...");
        Thread.sleep(6000);
        System.out.println("               3rd Minute                  ");
        Thread.sleep(2000);
    }
public static void main(String args[]) throws InterruptedException{
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 280);
    JPanel panel = new JPanel(new BorderLayout());
    frame.add(panel);
    JButton buttonStart = new JButton("Start");
    panel.add(buttonStart, BorderLayout.NORTH);
    JTextField tf = new JTextField();
    panel.add(tf);
    buttonStart.setSize(300, 20);
    buttonStart.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                myGameText();
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }
    });
    frame.setVisible(true);
}

}


