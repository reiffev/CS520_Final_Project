import model.*;
import view.*;
import controller.*;
import mutant.*;
import javax.swing.*;
import java.awt.*;
import reader.TriangleMutantReader;

public class Main {

    public static void main(String ... args) {
    	ComplexView main = new ComplexView();
    	BarView bar = new BarView();
    	main.addView(bar);
    	OriginalCodeView ocv = new OriginalCodeView();
    	main.addView(ocv);
    	MutantCodeView mcv = new MutantCodeView();
    	main.addView(mcv);
    	MutantsView mutantView = new MutantsView();
    	main.addView(mutantView);
    	main.draw();
    	TriangleMutantReader red = new TriangleMutantReader("this");
    	caseMutant[] mutants = red.getResults();
    	System.out.print(mutants[0].isKilled());
    	
    }
}