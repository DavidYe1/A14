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
    private JLabel h;
    private JLabel min;
    public int stunde = 00;
    public int minute = 00;
    public static int count = 0;

    public void setInc(int count) {

        if (count == 1) {
            if (stunde == 00 || stunde < 23) {
                this.stunde++;
                this.h.setText(this.stunde + "");
            } else {
                this.stunde = 00;
                this.h.setText(this.stunde + "");
            }
        }

        if (count == 2) {
            if (minute < 59 || minute == 00) {
                this.minute++;
                this.min.setText(this.minute + "");
            } else {
                this.minute = 00;
                this.min.setText(this.minute + "");
                if (this.stunde != 24) {
                    this.stunde++;
                    this.h.setText(this.stunde + "");
                } else {
                    this.stunde = 00;
                    this.h.setText(this.stunde + "");
                }
            }
        }
    }


    /**
     * verringert die Uhrzeit
     *
     * @param count zaehlt wie oft gedrueckt wurde
     */
    public void setDec(int count) {
        if (count == 1) {
            if ((stunde > 00 && stunde <= 24)) {
                this.stunde--;
                this.h.setText(this.stunde + "");
            } else {
                this.stunde = 00;
                this.h.setText(this.stunde + "");
            }
        }

        if (count == 2) {
            if (minute < 59 || minute == 00) {
                this.minute++;
                this.min.setText(this.minute + "");
            } else {
                if (this.stunde != 00) {
                    this.minute = 59;
                    this.min.setText(this.minute + "");
                    this.stunde--;
                    this.h.setText(this.stunde + "");
                }
            }
        }
    }


    public Uhr() {
        set.addActionListener(new ActionListener() {


            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count > 2) {
                    count = 0;
                } else {
                    count++;
                }
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
                setInc(count);
            }
        });

        dec.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                setDec(count);
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
