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
		OGCodePanel.setSize(250, 175);
		OGCodePanel.setLocation(150, 30);
		OGCodePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		OGCodePanel.add(new JLabel("Original Code"));
		
	}
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void draw() {
		container.add(OGCodePanel, BorderLayout.CENTER);
		drawComponents();
	}
	
	

}
