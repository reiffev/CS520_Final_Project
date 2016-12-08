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
    	BarView bar = new BarView();
    	frame.add(bar.getPanel());
    	OriginalCodeView ocv = new OriginalCodeView();
    	frame.add(ocv.getPanel());
    	MutantCodeView mcv = new MutantCodeView();
    	frame.add(mcv.getPanel());
    	MutantsView mutantView = new MutantsView();
    	frame.add(mutantView.getPanel());
    	frame.setLocationRelativeTo(null);
    	frame.setResizable(false);
    	frame.setVisible(true);
    	TriangleMutantReader red = new TriangleMutantReader("this");
    	caseMutant[] mutants = red.getResults();
    	System.out.print(mutants[0].isKilled());
    	
    }
}