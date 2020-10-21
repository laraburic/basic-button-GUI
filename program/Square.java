package lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Square {
    public static void main(String[] args) {
        FilledFrame frame = new FilledFrame();
        frame.setVisible(true);
    }
}

class FilledFrame extends JFrame {
    int size = 400;
    public FilledFrame() {
        JButton butSmall = new JButton("Small");
        JButton butMedium = new JButton("Medium");
        JButton butLarge = new JButton("Large");
        JButton butMessage = new JButton("Say Hi!");

        SquarePanel panel = new SquarePanel(this);
        JPanel butPanel = new JPanel();

        butPanel.add(butSmall);
        butPanel.add(butMedium);
        butPanel.add(butLarge);
        butPanel.add(butMessage);
        add(butPanel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setSize( size+100, size+100 );

        //action
        butSmall.addActionListener(new ButtonHandler(this, 100));
        butMedium.addActionListener(new ButtonHandler(this, 300));
        butLarge.addActionListener(new ButtonHandler(this, 500));
        butMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hiiii");
            }
        });
    }
}

class ButtonHandler implements ActionListener {
    //variable of type filled frame
    FilledFrame theApp;
    //variable of type int to store size used to resize the coloured shape
    int newSize;

    ButtonHandler(FilledFrame app, int size) {
        theApp = app;
        newSize = size;
        // set the parameters passed into the constructor to instance variables defined above
    }
        public void actionPerformed(ActionEvent e) {
                theApp.size = newSize;
                theApp.repaint();
            }

// The action of resizing the coloured shape that is performed when the button is pressed
// Set the filledframe size to the size you have assigned to your instance variable (in the consstructor)

// you need to perform a refresh on the frame in order to effectively redraw the resized shape
        }

class SquarePanel extends JPanel
{
    FilledFrame theApp;
    SquarePanel(FilledFrame app)
    {
        theApp = app;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(20, 20, theApp.size, theApp.size);
    }
}
