package view;

import java.util.*;

import javax.swing.JPanel;

import mutant.Mutant;

public interface View {
	
	/**
	 * Update the view, using the provided data.
	 * @param data
	 */
    public void update(Collection<Mutant> data);
    
    public JPanel getView();
}
