package view;

import java.awt.*;
import java.util.*;

public abstract class ViewComponent implements View{
	protected Container container;
	private ArrayList<ViewComponent> components = new ArrayList<ViewComponent>();
	
	public abstract void draw();
	
	public void drawComponents(){
		for (ViewComponent vc : components){
        	vc.draw();
        }
	}
	
	public void addView(ViewComponent comp){
		components.add(comp);
	}

}
