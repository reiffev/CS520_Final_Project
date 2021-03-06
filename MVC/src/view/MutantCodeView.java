package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mutant.Mutant;
import mutant.caseMutant;

public class MutantCodeView extends ViewComponent{
	
	protected JTextArea textArea;
	
	private Mutant m;
	
	public MutantCodeView(){
		m = new caseMutant();
	}
	
	@Override
	public void update(Collection<Mutant> data, Mutant current, JButton button) {
		m = current;
		if(current != null){
			textArea.setText(m.showMutant());
			textArea.append("Type: "+m.getType()+"\n");
			textArea.append("Line Number: "+m.getLine()+"\n");
		}
	}
	

	@Override
	public void draw() {
		JPanel mcv = new JPanel(new FlowLayout(FlowLayout.CENTER));
		mcv.setSize(450, 175);
		mcv.setLocation(150, 205);
		mcv.setBorder(BorderFactory.createLineBorder(Color.black));
		mcv.add(new JLabel("Mutant Code"));
		textArea = new JTextArea(7,20);
		textArea.setPreferredSize(new Dimension(400,50));
		textArea.setEditable(false);
		if(m!=null){
			textArea.setText(m.showOriginal());
			textArea.append("Type: "+m.getType()+"\n");
			textArea.append("Line Number: "+m.getLine()+"\n");
		}
		mcv.add(textArea);
		container.add(mcv, BorderLayout.CENTER);
	}



}
