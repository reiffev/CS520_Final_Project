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
	
	public MutantCodeView(){
		mcv = new JPanel(new FlowLayout(FlowLayout.CENTER));
	}
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public void draw() {
		mcv.setSize(400, 175);
		mcv.setLocation(200, 205);
		mcv.setBorder(BorderFactory.createLineBorder(Color.black));
		mcv.add(new JLabel("Mutant Code"));
		
		container.add(mcv, BorderLayout.CENTER);
	}



}
