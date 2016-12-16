package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import model.Model;
import model.MutantModel;
import mutant.Mutant;
import reader.TriangleMutantReader;

public class MutantController implements Controller{

	private MutantModel model;
	private TriangleMutantReader reader = new TriangleMutantReader("this");
	private JButton lastButton = null;
	
	@Override
	public void setModel(Model m) {
		this.model = (MutantModel) m;
	}

	@Override
	public Model getModel() {
		return model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
    	try {
            //do something with the registered model
    		//System.out.println("hello "+ e.getSource());
    		JButton temp = (JButton) e.getSource();
    		temp.setBorder(BorderFactory.createLineBorder(Color.black));
    		if(lastButton != null && lastButton != temp){
    			lastButton.setBorder(BorderFactory.createEtchedBorder());
    		}
    		lastButton = temp;
    		int n = Integer.parseInt(temp.getName());
    		//System.out.println(n);
    		model.changeCurrentMutant(n, temp);
    	} catch (Exception exception){
    		//System.out.println(exception.);
    		exception.printStackTrace();
    	}
		
	}
	
	public void readMutants(){
		ArrayList<Mutant> mutants = reader.getResults();
		model.setMutant(mutants);
	}

}
