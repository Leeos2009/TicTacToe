import javax.swing.*;

public class TTTframe {
    public static void main(String args[])
    {
        JFrame frame = new TicTacToeMain();
        frame.setTitle("TicTacToe");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
