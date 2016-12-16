package model;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;

import mutant.Mutant;
import view.View;
import reader.TriangleMutantReader;

public class MutantModel implements Model{

	private ArrayList<View> views = new ArrayList<View>();

		// Store all collected numbers
	private ArrayList<Mutant> mutants = new ArrayList<Mutant>();

	private Mutant current;
	private JButton button;

	TriangleMutantReader reader = new TriangleMutantReader("this");
	
	@Override
	public Iterator<Mutant> iterator() {
		return mutants.iterator();
	}

	@Override
	public void register(View v) {
		views.add(v);
	}

	@Override
	public void unregister(View v) {
		views.remove(v);
	}

	@Override
	public void changed() {
		for (View v : views){
			v.update(mutants, current, button);
		}
	}

	public ArrayList<Mutant> getMutants(){
		mutants = reader.getResults();
		current = mutants.get(0);
		return mutants;
	}

	public void changeCurrentMutant(int num, JButton b){
		current = mutants.get(num-1);
		button = b;
		//System.out.println(current.showMutant());
		this.changed();
	}

}
