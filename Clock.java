import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Date;

public class Clock extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    
   

    public Clock() {
        super(" ⒸⓁⓄⒸⓀ ⓉⓄⓌⒺⓇ");
        super.setFont(new Font("Arial", Font.BOLD, 30));

        super.setSize(400, 400);// size of window
        super.setLocation(400, 100);// to set the location of window
        super.getContentPane().setBackground(new Color(225, 205, 205));

        gui(); // call gui method
        startClock(); // start the clock timer

        super.setVisible(true); // make JFrame visible after labels are added
    }

    public void gui() {
        heading = new JLabel("Digital Dream");
        clockLabel = new JLabel("My Clock");
        heading.setFont(new Font("Arial", Font.BOLD, 35));
        clockLabel.setFont(new Font("Arial", Font.BOLD, 24));
        clockLabel.setForeground(Color.blue); // set the text color to white
        
        JPanel box=new JPanel();//to create a boder or a box
        box.setBorder(BorderFactory.createTitledBorder("Time_Flexer"));
        box.add(clockLabel,JLabel.CENTER);
        this.setLayout(new GridLayout(2, 1));
        this.add(heading);//adds a component to the JFrame
        this.add(box);//add box to the jFrame

    }

    private void startClock() {
       Timer timer = new Timer(1000, new ActionListener() {//Timer class is used to 
            //schedule tasks to be executed at a certain time or after a certain interval.
            @Override
            public void actionPerformed(ActionEvent e) {
              String dateTime=new Date().toString();// this class help you to find date and                                                  
                clockLabel.setText(dateTime);//date time setted to clockLabel
            }
        });
        timer.start();
    }
    public static void main(String[] args) {
        Clock clock = new Clock();
    }
}

// as soon as timer class is called after every 1 second (provided in parenthesis,1000ms)
//action performed method will be called 