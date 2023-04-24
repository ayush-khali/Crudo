import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Timer timer;

    public Clock() {
        super("My Clock");
        super.setSize(400, 400);// size of window
        super.setLocation(400, 100);// to set the location of window
        super.getContentPane().setBackground(new Color(0, 255, 255));

        gui(); // call gui method
        startClock(); // start the clock timer

        super.setVisible(true); // make JFrame visible after labels are added
    }

    public void gui() {
        heading = new JLabel("Clock 🅲🅻🅾🅲🅺");
        clockLabel = new JLabel("My Clock");
        heading.setFont(new Font("Arial", Font.PLAIN, 35));
        clockLabel.setFont(new Font("Arial", Font.PLAIN, 35));
        clockLabel.setForeground(Color.WHITE); // set the text color to white

        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(clockLabel);
    }

    private void startClock() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                String time = sdf.format(new Date());
                clockLabel.setText(time);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        new Clock();
    }
}
