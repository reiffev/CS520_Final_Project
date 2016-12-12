package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class BarView extends ViewComponent{
	
	private JPanel bar;
	
	private ArrayList<Mutant> d;
	
	public BarView(){
		bar = new JPanel(new FlowLayout(FlowLayout.CENTER));
	}

	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		d = (ArrayList<Mutant>) data;
	}

	@Override
	public void draw() {
		bar.setSize(600, 30);
		bar.setBorder(BorderFactory.createLineBorder(Color.black));
		int live = 0;
		int killed = 0;
		for(int i = 0; i<d.size(); i++){
			if(d.get(i).isKilled())
				killed++;
			else
				live++;
		}
		bar.add(new JLabel("Live: " + live + "/Killed: " + killed));
		
		container.add(bar, BorderLayout.CENTER);
	}


}
