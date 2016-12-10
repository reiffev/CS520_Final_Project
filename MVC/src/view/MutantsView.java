package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import mutant.Mutant;

public class MutantsView extends ViewComponent{
	
	protected JScrollPane mutantPane;
	private JPanel innerPanel;
	
	public MutantsView(){
		innerPanel =  new JPanel(new FlowLayout(FlowLayout.CENTER));
		mutantPane = new JScrollPane(innerPanel);
	}
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		//innerPanel.setLocation(0, 30);
		innerPanel.add(new JLabel("Mutants"));
		for(int i = 0; i < 100; i++){
			JButton temp = new JButton("Mutant " + i);
			temp.setLocation(0, 10+(10*i));
			innerPanel.add(temp);
		}
		innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
		mutantPane = new JScrollPane(innerPanel);
		//mutantPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//mutantPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mutantPane.setBounds(0, 30, 200, 547);
		
		container.add(mutantPane, BorderLayout.CENTER);
	}
	

	

}
