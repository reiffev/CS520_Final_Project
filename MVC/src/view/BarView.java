package view;


import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class BarView implements View{

	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}

	public JPanel getPanel() {
		JPanel bar = new JPanel(new FlowLayout(FlowLayout.CENTER));
		bar.setSize(400, 30);
		bar.setBorder(BorderFactory.createLineBorder(Color.black));
		bar.add(new JLabel("Live/Killed"));
		bar.setVisible(true);
		return bar;
	}

}
