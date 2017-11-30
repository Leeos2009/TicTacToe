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
        frame.setLocation(600,250);
        JMenuBar mb = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenu menu2 = new JMenu("Information");
        mb.add(menu);
        mb.add(menu2);
        JMenuItem New = new JMenuItem("New Game");
        JMenuItem Restart = new JMenuItem("Restart");
        JMenuItem Exit = new JMenuItem("Exit");
        JMenuItem Info = new JMenuItem("Info");
        New.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TTTframe();
            }
        });
        Restart.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "Are you sure you wish to restart? ", "Restart Message", JOptionPane.YES_NO_OPTION);
            }
    });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ExitGame = JOptionPane.showConfirmDialog(null, "Are you sure you wish to Exit? ", "Exit Message", JOptionPane.YES_NO_OPTION);
                if(ExitGame == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
            else {

                }
        }});
        Info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Game: TicTacToe\nNumber of Players: 2\nPlayer 1: Blue\nPlayer 2: Red", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        menu.add(New);
        menu.add(Exit);
        menu.add(Restart);
        menu2.add(Info);
        frame.setJMenuBar(mb);
        frame.setVisible(true);

    }

}


