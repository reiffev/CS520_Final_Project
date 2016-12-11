package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import controller.MutantController;
import mutant.Mutant;

public class MutantsView extends ViewComponent{
	
	protected MutantController mutant_controller;
	protected JScrollPane mutantPane;
	private JPanel innerPanel;
	
	private ArrayList<Mutant> d;
	
	public MutantsView(){
		innerPanel =  new JPanel(new FlowLayout(FlowLayout.CENTER));
		mutantPane = new JScrollPane(innerPanel);
	}
	
	public void connectMutantController(MutantController m){
		mutant_controller = m;
	}
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		d = (ArrayList<Mutant>) data;
	}

	@Override
	public void draw() {
		//innerPanel.setLocation(0, 30);
		//innerPanel.add(new JLabel("Mutants"));
		innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
		for(int i = 0; i < d.size(); i++){
			JButton temp = new JButton("Mutant " + i);
			if(d.get(i).isKilled())
				temp.setBackground(Color.GREEN);
			else
				temp.setBackground(Color.RED);
			temp.setOpaque(true);
			temp.setBorderPainted(false);
			temp.setPreferredSize(new Dimension(30,20));
			temp.addActionListener(mutant_controller);
			innerPanel.add(temp);
		}
		
		mutantPane = new JScrollPane(innerPanel);
		mutantPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//mutantPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		mutantPane.setBounds(0, 30, 200, 350);
		
		container.add(mutantPane, BorderLayout.CENTER);
	}
	

	

}
