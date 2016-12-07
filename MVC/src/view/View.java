package view;

import java.util.*;

import javax.swing.JPanel;

public interface View {
	
	/**
	 * Update the view, using the provided data.
	 * @param data
	 */
    public void update(Collection<Double> data);
    
    public JPanel getView();
}
