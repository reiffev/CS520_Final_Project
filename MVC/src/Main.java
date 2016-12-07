import model.*;
import view.*;
import controller.*;
import mutant.*;
import javax.swing.*;
import java.awt.*;
import reader.TriangleMutantReader;

public class Main {

    public static void main(String ... args) {
    	JFrame frame = new JFrame("Mutant Viewer");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setSize(400,400);
    	frame.getContentPane().setLayout(null);
    	View bar = new BarView();
    	frame.add(bar.getView());
    	View ocv = new OriginalCodeView();
    	frame.add(ocv.getView());
    	View mcv = new MutantCodeView();
    	frame.add(mcv.getView());
    	View mutantView = new MutantsView();
    	frame.add(mutantView.getView());
    	frame.setLocationRelativeTo(null);
    	frame.setResizable(false);
    	frame.setVisible(true);
    	TriangleMutantReader red = new TriangleMutantReader("this");
    	caseMutant[] mutants = red.getResults();
    	System.out.print(mutants[0].isKilled());
    	
    }
}