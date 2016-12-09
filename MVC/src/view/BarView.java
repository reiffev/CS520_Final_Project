package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class BarView extends ViewComponent{
	
	private JPanel bar;
	
	public BarView(){
		bar = new JPanel(new FlowLayout(FlowLayout.CENTER));
		bar.setSize(400, 30);
		bar.setBorder(BorderFactory.createLineBorder(Color.black));
		bar.add(new JLabel("Live/Killed"));
	}

	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		container.add(bar, BorderLayout.CENTER);
		drawComponents();
		
	}


}
