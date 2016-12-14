package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import mutant.Mutant;

public class OriginalCodeView extends ViewComponent{
	
	protected JTextArea textArea;
	
	private Mutant m;
	
	public OriginalCodeView(Mutant start){
		m = start;
	}
	@Override
	public void update(Collection<Mutant> data, Mutant current) {
		m = current;
		textArea.setText(current.showOriginal());
	}
	
	@Override
	public void draw() {
		JPanel OGCodePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		OGCodePanel.setSize(450, 175);
		OGCodePanel.setLocation(150, 30);
		OGCodePanel.setBorder(BorderFactory.createLineBorder(Color.black));
		OGCodePanel.add(new JLabel("Original Code"));
		textArea = new JTextArea(5,20);
		textArea.setEditable(false);
		textArea.setText(m.showOriginal());
		OGCodePanel.add(textArea);
		container.add(OGCodePanel, BorderLayout.CENTER);
	}
	
	

}
