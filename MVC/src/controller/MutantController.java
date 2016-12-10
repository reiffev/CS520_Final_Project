package controller;

import java.awt.event.ActionEvent;

import model.Model;

public class MutantController implements Controller{

	private Model model;
	
	@Override
	public void setModel(Model m) {
		this.model = m;
	}

	@Override
	public Model getModel() {
		return model;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
    	try {
            //do something with the registered model
    		System.out.println("hello "+ e.getSource());
    		
    	} catch (Exception exception){
    		//System.out.println(exception.);
    		exception.printStackTrace();
    	}
		
	}

}
