package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MutantsView implements View{

	@Override
	public void update(Collection<Double> data) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public JPanel getView(){
		JPanel panel = new JPanel();
		JScrollPane scrollView = new JScrollPane(panel);
		scrollView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollView.setBounds(0, 30, 150, 300);
		JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
		content.setSize(150, 300);
		content.setLocation(0, 30);
		content.add(new JLabel("Mutant"));
		content.add(scrollView);
		content.setVisible(true);
		return content; 
	}

}
