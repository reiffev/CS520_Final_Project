package controller;

import java.awt.event.ActionListener;

import model.Model;

public interface Controller extends ActionListener{
	
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
