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
		boolean[] k_info;
		String[] m_info;
		try {
			k_info = conv.getKillInfo();
			m_info = conv.getMutantInfo();
			ArrayList <Mutant> cow_ants = new ArrayList<Mutant>();
			for(int j = 0; j < k_info.length; j++){
				Mutant m = new caseMutant();
				String[] stuff = m_info[j].split(",");
				m.setType(stuff[0]);
				m.setLine(Integer.parseInt(stuff[1]));
				m.setKilled(k_info[j]);
				m.addMutant(conv.getMutantCode(j, m.getLine()));
				m.addOriginal(conv.getOriginalCode(m.getLine()));
				cow_ants.add(m);
			}
			return cow_ants;
		} catch (IOException e) {
			
			e.printStackTrace();
			return null;
		}
	}
}