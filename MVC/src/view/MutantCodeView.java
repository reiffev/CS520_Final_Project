package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class MutantCodeView implements View{
	
	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		JPanel mcv = new JPanel(new FlowLayout(FlowLayout.CENTER));
		mcv.setSize(250, 175);
		mcv.setLocation(150, 205);
		mcv.setBorder(BorderFactory.createLineBorder(Color.black));
		mcv.add(new JLabel("Mutant Code"));
		mcv.setVisible(true);
		return mcv;
	}

}
