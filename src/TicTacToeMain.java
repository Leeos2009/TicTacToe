/**This is an instantiable Student Class
 * @author Lee O'Sullivan
 * Version 1.0
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeMain extends JFrame implements TTTinterface {
    //Attributes
    static JButton[] XOboard = new JButton[9];
    //public static void main(String args[]) {
    //int rows, columns;
    JButton button;
    Boolean Winner = false;
    private int XorO = 0;
    String XorOtag;
    boolean Draw = false;
    //String XorOtext = "";


    public TicTacToeMain() {
        //Creating the TicTacToe Board
        int count = 0;
        if(count == 0);
        {
        ImageIcon icon1 = new ImageIcon("TTTimg.png");
        JOptionPane.showMessageDialog(null, "Welcome to TicTacToe", "Welcome", JOptionPane.INFORMATION_MESSAGE, icon1);
        count++;}
            /*JFrame frame = new JFrame("TicTacToe");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(3, 3, 2, 2));*/
        JPanel TTTpanel = new JPanel();
        TTTpanel.setLayout(new GridLayout(4, 3, 5, 5));
        add(TTTpanel);

        //for (int row = 0; row < 3; row++) {

        //Creating the buttons inside the array and adding them to the frame
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


        //Exit, Restart, and Filler Button Creation
        JButton Exit = new JButton("Exit");
        TTTpanel.add(Exit);
        Exit.setBackground(Color.green);
        Exit.addActionListener(new ExitListener());
        JButton Restart = new JButton("Restart");
        TTTpanel.add(Restart);
        Restart.setBackground(Color.cyan);
        Restart.addActionListener(new RestartListener());
        JButton Filler = new JButton("Empty");
        TTTpanel.add(Filler);
        Filler.setBackground(Color.ORANGE);
        Filler.addActionListener(new FillerListener());

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

    /**
     * Method for Restarting the Game
     * @param restart
     * @return restart
     */
    @Override
    public boolean restart(boolean restart) {
        this.dispose();
        new TicTacToeMain();
        restart = true;
        return restart;
    }

    /*public boolean Popup(boolean popUp) {
        ImageIcon icon = new ImageIcon("TTTimg.png");
        JOptionPane.showMessageDialog(null, "Welcome to TicTacToe", "", JOptionPane.INFORMATION_MESSAGE, icon);
        popUp = true;
        return popUp;
    }*/

    /**
     * This method is to Check if either Player has won and display a Winning/Draw message, and for the button
     */
    public class BtnListener implements ActionListener {
        /**
         * This method records which player's turn was taken and changes the button's color to show which player took their move
         * @param e
         */
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
            if (XorO == 9 && WinCheck() == false) {
                int GameDraw = JOptionPane.showConfirmDialog(null, "The game ended in a draw, do you wish to Exit?","TicTacToe", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                if (GameDraw == JOptionPane.OK_OPTION) {
                    System.exit(0);
                    if (GameDraw == JOptionPane.PLAIN_MESSAGE) {

                    }
                }
            }
            if(WinCheck()==true)
            {
                int GameOver = JOptionPane.showConfirmDialog(null, "The Winner was " + XorOtag + " , Do you wish to Exit?", "TicTacToe", JOptionPane.YES_NO_OPTION);
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

    /**
     * This method creates the algorithm to determine a winning combinations
     * @param XOleft
     * @param XOright
     * @return
     */

    /*- Code Tutorials
- Author: Unknown
- https://kodingtutorials.weebly.com/Tic-tac-toe-gui.html
- Date 29/11/2017
*****************************************************/

    public boolean checkLine(int XOleft, int XOright) {
        if (XOboard[XOleft].getText().equals(XOboard[XOright].getText()) && !XOboard[XOleft].getText().equals("")) {
            return true;
        } else
            return false;
    }

    /**
     * This method outlines all possible winning combinations possible and returns WinCheck if one of the combinations is found
     * @return is used if a winning combination is made
     */
    public boolean WinCheck() {
        if (checkLine(0, 1) && checkLine(1, 2)) {
            return true;
        }
        //Below here: Code was determined by myself using the code commented out above to create all possible outcomes.
        //***********************************************************************
        else if (checkLine(3, 4) && checkLine(4, 5)) {
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

    /**
     * This method allows the user to exit the game once they click the Exit button
     */
    public class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton ExitClick = (JButton) e.getSource();
            System.out.println("Exit was Clicked");
            System.exit(0);
        }
    }

    /**
     * This method allows the user to restart the game once they click the Restart button
     */
    public class RestartListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton RestartClick = (JButton) e.getSource();
            System.out.println("Restart was Clicked");
            repaint();
            restart(true);
        }
    }

    /**
     * This method is used to allow a button to be clicked and a message to appear. The purpose of the button is to fill the space on the JFrame.
     */
    public class FillerListener implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent e)
        {
            JButton FillerClick = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null,"Emptiness", "Magic Button", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Magic Button was Clicked");
        }
    }
}//end class
  /* public void winningCriteria(int[][] XOboard) {
        /*if(XOboard[0][0] == Integer.parseInt("Red"))
      return true;
   }*/


