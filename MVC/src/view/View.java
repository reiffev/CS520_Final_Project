package view;

import java.util.*;

import mutant.Mutant;

public interface View {
	
	/**
	 * Update the view, using the provided data.
	 * @param data
	 */
    public void update(Collection<Mutant> data);
}
