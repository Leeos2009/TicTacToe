import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTframe {
    public static void main(String args[])
    {
        JFrame frame = new TicTacToeMain();
        frame.setTitle("TicTacToe");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JPanel TTTmain = new JPanel();
        //frame.add(TTTmain);
        //JButton Start = new JButton("Start");
        //TTTmain.add(Start);
        frame.setLocation(500,250);
        frame.setVisible(true);

    }

    }


