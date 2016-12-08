package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import mutant.Mutant;

public class MutantsView implements View{

	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	
	public JScrollPane getView(){
		JPanel panel = new JPanel();
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
		//panel.add(scrollView);
		return scrollView; 
	}

}
