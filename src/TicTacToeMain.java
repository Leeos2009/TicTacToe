import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeMain extends JFrame {
    static JButton[] XOboard = new JButton[9];
    //public static void main(String args[]) {
    //int rows, columns;
    JButton button;
    Boolean Winner = false;
    private int XorO = 0;
    String XorOtag;
    JPanel TTTpanel;
    boolean Draw = false;
    //String XorOtext = "";


    public TicTacToeMain() {
            /*JFrame frame = new JFrame("TicTacToe");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(3, 3, 2, 2));*/
        JPanel TTTpanel = new JPanel();
        TTTpanel.setLayout(new GridLayout(4, 3, 5, 5));
        add(TTTpanel);

        //for (int row = 0; row < 3; row++) {
        for (int btn = 0; btn < 9; btn++) {
            XOboard[btn] = new JButton("");
            TTTpanel.add(XOboard[btn]);
            XOboard[btn].addActionListener(new BtnListener());
        }
        //MineMenu MM = new MineMenu();
        //frame.setJMenuBar(MineMenu.menuBar);

        /*JButton One = new JButton("One");
        TTTpanel.add(One);
        One.addActionListener(new BtnListener());
        JButton Two = new JButton("Two");
        TTTpanel.add(Two);
        Two.addActionListener(new BtnListener());
        JButton Three = new JButton("Three");
        TTTpanel.add(Three);
        Three.addActionListener(new BtnListener());
        JButton Four = new JButton("Four");
        TTTpanel.add(Four);
        Four.addActionListener(new BtnListener());
        JButton Five = new JButton("Five");
        TTTpanel.add(Five);
        Five.addActionListener(new BtnListener());
        JButton Six = new JButton("Six");
        TTTpanel.add(Six);
        Six.addActionListener(new BtnListener());
        JButton Seven = new JButton("Seven");
        TTTpanel.add(Seven);
        Seven.addActionListener(new BtnListener());
        JButton Eight = new JButton("Eight");
        TTTpanel.add(Eight);
        Eight.addActionListener(new BtnListener());
        JButton Nine = new JButton("Nine");
        TTTpanel.add(Nine);
        Nine.addActionListener(new BtnListener());*/
        JButton Exit = new JButton("Exit");
        TTTpanel.add(Exit);
        Exit.setBackground(Color.green);
        Exit.addActionListener(new ExitListener());
        JButton Restart = new JButton("Restart");
        TTTpanel.add(Restart);
        Restart.setBackground(Color.cyan);
        Restart.addActionListener(new RestartListener());

        /*if(XOboard[0].getText().equals("Red")){
            if(XOboard[1].getText().equals("Red")){
                if(XOboard[2].getText().equals("Red")){
                    Winner = true;
                    System.out.println("Red Player Won");
                }
            }
        }
        if(Winner = true)
        {
            System.out.println("Broke");
        }*/
        /*if (XOboard[0].equals(XOboard[1]) && XOboard[1].equals(XOboard[2]) && XOboard[0].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[3].equals(XOboard[4]) && XOboard[4].equals(XOboard[5]) && XOboard[3].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[6].equals(XOboard[7]) && XOboard[7].equals(XOboard[8]) && XOboard[6].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[0].equals(XOboard[3]) && XOboard[3].equals(XOboard[6]) && XOboard[0].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[1].equals(XOboard[4]) && XOboard[4].equals(XOboard[7]) && XOboard[2].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[2].equals(XOboard[5]) && XOboard[5].equals(XOboard[8]) && XOboard[2].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[0].equals(XOboard[4]) && XOboard[4].equals(XOboard[8]) && XOboard[0].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        else if (XOboard[2].equals(XOboard[4]) && XOboard[4].equals(XOboard[6]) && XOboard[2].equals(""))
        {
            Winner = true;
            System.out.println("Winner");
        }
        if(Winner = true)
        {
            System.out.println("Broken");

        }*/

    }

    public class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //String btnClick = e.getActionCommand();
            //if (btnClick.equals("Btn: ")) {
            //System.out.println("Button was pressed");
            JButton BtnClick = (JButton) e.getSource();
            BtnClick.setEnabled(false);
            //BtnClick.setText(XorOtag);
            if (XorO % 2 == 0) {
                BtnClick.setText("Blue");
                BtnClick.setBackground(Color.blue);
                XorOtag = "Blue";
                System.out.println("Player Blue took their turn");
            } else {
                //XorOtext = "Red";
                BtnClick.setBackground(Color.red);
                XorOtag = "Red";
                BtnClick.setText("Red");
                System.out.println("Player Red took their turn");

            }
            XorO++;
            if (XorO == 9) {
                System.out.println("The Match Ended in a Draw");
            }
            if(WinCheck()==true)
            {
                int GameOver = JOptionPane.showConfirmDialog(null, "Game Over");
                if (GameOver == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
                if (GameOver == JOptionPane.NO_OPTION) {
                    removeAll();
                    new TTTframe();
                }
            }
        }
    }
//
    public boolean checkLine(int a, int b) {
        if (XOboard[a].getText().equals(XOboard[b].getText()) && !XOboard[a].getText().equals("")) {
            return true;
        } else
            return false;
    }
    public boolean WinCheck() {
        if (checkLine(0, 1) && checkLine(1, 2)) {
            return true;
        } else if (checkLine(3, 4) && checkLine(4, 5)) {
            return true;
        }else if(checkLine(6,7) && checkLine(7,8))
        {
            return true;
        }
        else if(checkLine(0,3) && checkLine(3,6))
        {
            return true;
        }
        else if(checkLine(1,4) && checkLine(4,7))
        {
            return true;
        }
        else if(checkLine(2,5) && checkLine(5,8))
        {
            return true;
        }else if(checkLine(0,4) && checkLine(4,8))
        {
            return true;

        }
        else if(checkLine(2,4) && checkLine(4,6))
        {
            return true;
        }
        else {
            return false;
        }
    }
    public class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton ExitClick = (JButton) e.getSource();
            System.exit(0);
        }
    }

    public class RestartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton RestartClick = (JButton) e.getSource();
            repaint();
        }
    }
}
  /* public void winningCriteria(int[][] XOboard) {
        /*if(XOboard[0][0] == Integer.parseInt("Red"))
      return true;
   }*/

