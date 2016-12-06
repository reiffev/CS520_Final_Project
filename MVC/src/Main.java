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
    	frame.getContentPane().setLayout(null);
    	BarView bar = new BarView();
    	frame.add(bar.getView());
    	OriginalCodeView ocv = new OriginalCodeView();
    	frame.add(ocv.getView());
    	frame.setLocationRelativeTo(null);
    	frame.setResizable(false);
    	frame.setVisible(true);
    }
}