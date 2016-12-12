package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class MutantCodeView extends ViewComponent{
	
	protected JPanel mcv;
	
	private Mutant m;
	
	public MutantCodeView(){
		mcv = new JPanel(new FlowLayout(FlowLayout.CENTER));
	}
	
	@Override
	public void update(Collection<Mutant> data, Mutant current) {
		// TODO Auto-generated method stub
		m = current;
	}
	

	@Override
	public void draw() {
		mcv.setSize(450, 175);
		mcv.setLocation(150, 205);
		mcv.setBorder(BorderFactory.createLineBorder(Color.black));
		mcv.add(new JLabel("Mutant Code"));
		mcv.add(new JLabel(m.showMutant()));
		container.add(mcv, BorderLayout.CENTER);
	}



}
