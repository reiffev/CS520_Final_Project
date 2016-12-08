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
	
	public JPanel getPanel(){
		JPanel panel = new JPanel();
		JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
		content.setSize(150, 300);
		content.setLocation(0, 30);
		content.add(new JLabel("Mutant"));
		//content.add(scrollView);
		content.setVisible(true);
		JScrollPane scrollView = new JScrollPane(content);
		scrollView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollView.setBounds(0, 30, 150, 300);
		panel.add(scrollView);
		return content; 
	}

}
