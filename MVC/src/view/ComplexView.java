package view;

import java.util.Collection;
import java.util.List;

import javax.swing.*;

import java.awt.Dimension;
import java.util.ArrayList;
import mutant.Mutant;

public class ComplexView extends ViewComponent {
	
	private JFrame plexView;
	
	public ComplexView(){
		plexView = new JFrame("Mutant Summary");
		super.container = plexView.getContentPane();
	}

	@Override
	public void update(Collection<Mutant> data, Mutant current, JButton Button) {
		// not used
		
	}

	@Override
	public void addView(ViewComponent component){
		component.container = this.container;
		super.addView(component);
	}

	@Override
	public void draw() {
		plexView.setPreferredSize(new Dimension(400, 400));
		//plexView.setResizable(false);
		plexView.setLayout(null);
        plexView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plexView.setPreferredSize(new Dimension(600,402));
        drawComponents();
        plexView.pack();
        plexView.setLocationRelativeTo(null);
        plexView.setVisible(true);
        plexView.setResizable(false);
		
	}
	
	

}
