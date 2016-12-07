package view;

import java.util.Collection;

public class MutantsView implements View{
	
	public JPanel getView(){
		JPanel panel = new JPanel();
		JScrollPane scrollView = new JScrollPane(panel);
		scrollView.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollView.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
		content.setPreferredSize(new Dimension(150,300))
		content.add(scrollView);
		content.setVisible(true);
		return content; 
	}

	@Override
	public void update(Collection<Double> data) {
		// TODO Auto-generated method stub
		
	}

}
