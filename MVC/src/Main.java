import model.*;
import view.*;
import controller.*;
import mutant.*;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String ... args) {
    	JFrame frame = new JFrame("Mutant Viewer");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(400,400);
    	Container c = frame.getContentPane();
    	c.setBackground(Color.red);
    	frame.setLocationRelativeTo(null);
    	frame.setResizable(false);
    	frame.setVisible(true);
    }
}