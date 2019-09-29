package Main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(/* название нашей игры */);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setSize(512, 512);
        frame.setResizable(false);
        Controller c = new Controller(frame.getGraphics());
        MainThread mt = new MainThread(c);
        mt.run();
    }


}
