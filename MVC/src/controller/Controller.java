package controller;

import model.Model;

public interface Controller {
	
	/**
	 * Set the model for this controller.
	 * 
	 * @param m The model to use.
	 */
	public void setModel(Model m);
	
	/**
	 * Returns the model that this controller uses.
	 * 
	 * @param m The used model.
	 */
    public Model getModel();
}
