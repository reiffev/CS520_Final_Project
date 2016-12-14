package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mutant.Mutant;

public class MutantCodeView extends ViewComponent{
	
	protected JTextArea textArea;
	
	private Mutant m;
	
	public MutantCodeView(Mutant start){
		m = start;
	}
	
	@Override
	public void update(Collection<Mutant> data, Mutant current) {
		m = current;
		textArea.setText(current.showMutant());
	}
	

	@Override
	public void draw() {
		JPanel mcv = new JPanel(new FlowLayout(FlowLayout.CENTER));
		mcv.setSize(450, 175);
		mcv.setLocation(150, 205);
		mcv.setBorder(BorderFactory.createLineBorder(Color.black));
		mcv.add(new JLabel("Mutant Code"));
		textArea = new JTextArea();
		textArea.setPreferredSize(new Dimension(400,50));
		textArea.setEditable(false);
		textArea.setText(m.showOriginal());
		mcv.add(textArea);
		container.add(mcv, BorderLayout.CENTER);
	}



}
