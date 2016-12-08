package view;

import java.util.*;

public interface View {
	
	/**
	 * Update the view, using the provided data.
	 * @param data
	 */
    public void update(Collection<Double> data);
}
