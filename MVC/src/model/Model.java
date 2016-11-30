package model;

import view.View;

public interface Model extends Iterable<Double>{

	/**
     * Register a view that should be notified about changes in the model.
     * 
     * @param v The view to register.
     */
	public void register(View v);
    
    /**
     * Remove a view from the set of registered views.
     * 
     * @param v The view to remove.
     */
    public void unregister(View v);
    
    /**
     * Indicate that the data in the model has changed and should be propagated.
     */
    public void changed();
}
