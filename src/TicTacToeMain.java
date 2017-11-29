import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeMain {
    public static void main(String args[]) {
        //int rows, columns;
        JButton button;
        int count = 1;
        JButton[][] XOboard = new JButton[3][3];
        //btnLayout = new JButton[8][8];
        JFrame frame = new JFrame("Checkers");
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 3, 2, 2));


       for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                XOboard[row][column] = new JButton();
                frame.add(XOboard[row][column]);
                XOboard[row][column].addActionListener(new BtnListener());
            }
        }


        //MineMenu MM = new MineMenu();
        //frame.setJMenuBar(MineMenu.menuBar);

        /*for(i = 0; i < 25; i++)
        {
            JButton Button = new JButton("Button " + i);
            frame.add(Button);
        }*/

        /*JButton One = new JButton("One");
        frame.add(One);
        One.addActionListener(new BtnListener());
        JButton Two = new JButton("Two");
        frame.add(Two);
        Two.addActionListener(new BtnListener());
        JButton Three = new JButton("Three");
        frame.add(Three);
        Three.addActionListener(new BtnListener());
        JButton Four = new JButton("Four");
        frame.add(Four);
        Four.addActionListener(new BtnListener());
        JButton Five = new JButton("Five");
        frame.add(Five);
        Five.addActionListener(new BtnListener());
        JButton Six = new JButton("Six");
        frame.add(Six);
        Six.addActionListener(new BtnListener());
        JButton Seven = new JButton("Seven");
        frame.add(Seven);
        Seven.addActionListener(new BtnListener());
        JButton Eight = new JButton("Eight");
        frame.add(Eight);
        Eight.addActionListener(new BtnListener());
        JButton Nine = new JButton("Nine");
        frame.add(Nine);
        Nine.addActionListener(new BtnListener());
        JButton Ten = new JButton("Ten");
        frame.add(Ten);
        Ten.addActionListener(new BtnListener());*/


        frame.setVisible(true);
    }

    public static class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String btnClick = e.getActionCommand();
            JButton button = (JButton) e.getSource();
            //if (btnClick.equals("Btn: ")) {
            System.out.println("Button was pressed");


        }

    }

}