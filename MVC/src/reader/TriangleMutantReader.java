package reader;
import mutant.*;

import java.io.IOException;
import java.util.ArrayList;

import converter.*;


public class TriangleMutantReader implements Reader{
	
	Converter conv;
	//Constructor takes in the converter type and file path
	public TriangleMutantReader(String type){
		//will eventually change based on the type
		conv = new csvConverter(System.getProperty("user.dir"));
		
	}
	//Will return an array of mutants or null
	public ArrayList<Mutant> getResults(){
		boolean[] info;
		try {
			info = conv.getKillInfo();
			ArrayList <Mutant> cow_ants = new ArrayList<Mutant>();
			for(int j = 0; j < cow_ants.size(); j++){
				cow_ants.add(new caseMutant());
				cow_ants.get(j).setKilled(info[j]);
			}
			return cow_ants;
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}