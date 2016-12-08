package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import mutant.Mutant;

public class MutantsView implements View{
	
	private JPanel mutantPanel;
	
	private JScrollPane mutantScroll;
	
	public MutantsView(){
		
	}
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	
	public void createView(){
		JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
		content.setSize(150, 650);
		content.setLocation(0, 30);
		content.add(new JLabel("Mutants"));
		//content.add(scrollView);
		content.setVisible(true);
		JScrollPane scrollView = new JScrollPane(content);
		scrollView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollView.setBounds(0, 30, 150, 400);
		mutantPanel = content;
		mutantScroll = scrollView; 
	}
	
	public JScrollPane getView(){
		return mutantScroll;
	}

}
