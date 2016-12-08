package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Collection;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mutant.Mutant;

public class OriginalCodeView implements View{

	@Override
	public void update(Collection<Mutant> data) {
		// TODO Auto-generated method stub
		
	}
	
	public JPanel getPanel(){
		JPanel ocv = new JPanel(new FlowLayout(FlowLayout.CENTER));
		ocv.setSize(250, 175);
		ocv.setLocation(150, 30);
		ocv.setBorder(BorderFactory.createLineBorder(Color.black));
		ocv.add(new JLabel("Original Code"));
		ocv.setVisible(true);
		return ocv;
	}

}
