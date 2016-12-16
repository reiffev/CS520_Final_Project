import model.*;
import view.*;
import controller.*;
import mutant.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import reader.TriangleMutantReader;

public class Main {

    public static void main(String ... args) {
    
    //Model
    	MutantModel mutant_model = new MutantModel();
    	ArrayList<Mutant> start = mutant_model.getMutants();
    	
    //Controllers
    	MutantController controller = new MutantController();
    	controller.setModel(mutant_model);
    	
    //Create the view
    	ComplexView main = new ComplexView();
    	BarView bar = new BarView(start);
    	main.addView(bar);
    	MutantsView mutantView = new MutantsView(start);
    	main.addView(mutantView);
    	OriginalCodeView ocv = new OriginalCodeView(start.get(0));
    	main.addView(ocv);
    	MutantCodeView mcv = new MutantCodeView(start.get(0));
    	main.addView(mcv);
    	
    	mutantView.connectMutantController(controller);
    	
    	mutant_model.register(bar);
    	mutant_model.register(mutantView);
    	mutant_model.register(ocv);
    	mutant_model.register(mcv);
    	
    	main.draw();
    	
    }
}