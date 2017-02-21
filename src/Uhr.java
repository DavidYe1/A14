import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by @Autor DavidYe on @Version 16.02.2017.
 */
public class Uhr {


    private JButton set;
    private JButton dec;
    private JButton inc;
    private JPanel Uhr;
    private JLabel hour;
    private JLabel min;

    public Uhr() {
        int count = 1;
        set.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
            }
        });
        inc.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Uhr");
        frame.setContentPane(new Uhr().Uhr);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
