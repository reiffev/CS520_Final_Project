package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class BarView extends ViewComponent{
	
	private JPanel bar;
	
	private ArrayList<Mutant> d;
	private JButton b;
	private JLabel curr;
	
	public BarView(ArrayList<Mutant> start){
		d = start;
		bar = new JPanel(new FlowLayout(FlowLayout.CENTER));
	}

	@Override
	public void update(Collection<Mutant> data, Mutant current, JButton button) {
		// TODO Auto-generated method stub
		d = (ArrayList<Mutant>) data;
		curr.setText(button.getName());
		if(current.isKilled())
			curr.setForeground(Color.GREEN);
		else
			curr.setForeground(Color.RED);
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
		//bar.add(new JLabel("Live: " + live + "/Killed: " + killed));
		JLabel l = new JLabel("Live: " + live);
		l.setForeground(Color.RED);
		JLabel k = new JLabel("Killed: " + killed);
		k.setForeground(Color.GREEN);
		bar.add(l);
		bar.add(new JLabel("/"));
		bar.add(k);
		
		bar.add(new JLabel("Currently viewing mutant: "));
		
		curr = new JLabel();
		
		bar.add(curr);
		
		bar.setBackground(Color.GRAY);
		
		container.add(bar, BorderLayout.CENTER);
	}


}
