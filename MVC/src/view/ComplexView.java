package view;

import java.util.Collection;
import java.util.List;

import javax.swing.JPanel;

import java.util.ArrayList;
import mutant.Mutant;

public class ComplexView implements View {
	private JPanel panel;
	
	private List<View> views = new ArrayList<View>();

	@Override
	public void update(Collection<Mutant> data) {
		for(View v: views) {
			v.update(data);
		}
	}
	
	public void addView(View v) {
		views.add(v);
		panel.add(v.getView());
		
	}

	public void removeView(View v) {
		views.add(v);	
	}
	
	public JPanel getView(){
		return panel;
	}

}
