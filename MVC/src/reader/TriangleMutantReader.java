package reader;
import mutant.*;

import java.io.IOException;

import converter.*;


public class TriangleMutantReader implements Reader{
	
	Converter conv;
	//Constructor takes in the converter type and file path
	public TriangleMutantReader(String type){
		//will eventually change based on the type
		conv = new csvConverter(System.getProperty("user.dir"));
		
	}
	//Will return an array of mutants or null
	public Mutant[] getResults(){
		String[] info;
		try {
			info = conv.getKillInfo();
			Mutant[] cow_ants = new Mutant[info.length];
			for(int j = 0; j < cow_ants.length; j++){
				cow_ants[j].setKilled(info[j].equals("FAIL"));
			}
			return cow_ants;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}