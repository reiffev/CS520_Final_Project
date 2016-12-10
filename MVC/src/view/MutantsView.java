package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import mutant.Mutant;

public class MutantsView extends ViewComponent{
	
	protected JScrollPane mutantPane;
	private JPanel innerPanel;
	
	public MutantsView(){
		innerPanel =  new JPanel(new FlowLayout(FlowLayout.CENTER));
		innerPanel.setSize(150, 650);
		innerPanel.setLocation(0, 30);
		
		mutantPane = new JScrollPane(innerPanel);
		mutantPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		mutantPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mutantPane.setBounds(0, 30, 150, 400);
		mutantPane.add(new JLabel("Mutants"));
	}
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		innerPanel.setSize(150, 650);
		innerPanel.setLocation(0, 30);
		innerPanel.add(new JLabel("Mutants"));
		mutantPane = new JScrollPane(innerPanel);
		mutantPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		mutantPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mutantPane.setBounds(0, 30, 150, 400);
		
		container.add(mutantPane, BorderLayout.CENTER);
	}
	

	

}
