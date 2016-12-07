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
	public caseMutant[] getResults(){
		boolean[] info;
		try {
			info = conv.getKillInfo();
			caseMutant[] cow_ants = new caseMutant[info.length];
			for(int j = 0; j < cow_ants.length; j++){
				cow_ants[j] = new caseMutant();
				cow_ants[j].setKilled(info[j]);
			}
			return cow_ants;
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}