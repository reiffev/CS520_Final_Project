import model.*;
import view.*;
import controller.*;
import mutant.*;
import javax.swing.*;
import java.awt.*;
import reader.TriangleMutantReader;

public class Main {

    public static void main(String ... args) {
    
    //Model
    	MutantModel mutant_model = new MutantModel();
    	
    //Controllers
    	
    //Create the view
    	ComplexView main = new ComplexView();
    	BarView bar = new BarView();
    	main.addView(bar);
    	MutantsView mutantView = new MutantsView();
    	main.addView(mutantView);
    	OriginalCodeView ocv = new OriginalCodeView();
    	main.addView(ocv);
    	MutantCodeView mcv = new MutantCodeView();
    	main.addView(mcv);
    	
    	
    	mutant_model.register(bar);
    	mutant_model.register(mutantView);
    	mutant_model.register(ocv);
    	mutant_model.register(mcv);
    	mutant_model.getMutants();
    	
    	main.draw();
    	
    }
}