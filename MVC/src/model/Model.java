package model;

import view.View;

public interface Model extends Iterable<Double>{

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
