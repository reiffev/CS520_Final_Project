package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class OriginalCodeView extends ViewComponent{
	
	protected JPanel OGCodePanel;
	
	public OriginalCodeView(){
		OGCodePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
	}
	@Override
	public void update(Collection<Mutant> data, Mutant current) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void draw() {
		OGCodePanel.setSize(450, 175);
		OGCodePanel.setLocation(150, 30);
		OGCodePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		OGCodePanel.add(new JLabel("Original Code"));
		
		container.add(OGCodePanel, BorderLayout.CENTER);
	}
	
	

}
