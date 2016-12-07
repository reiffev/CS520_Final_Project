package reader;
import mutant;
import Converter;


public TriangleMutantReader extends Reader{
	
	Converter conv;

	public TriangleMutantReader(String type, String file){
		//will eventually change based on the type
		Converter conv = new csvConverter(file);
	}

	public Mutant[] getResults(){
		boolean[] info = conv.getKillInfo();
		Mutant[] cow_ants = new Mutant[info.length];
		for(int j = 0; j < cow_ants.length; j++){
			cow_ants[j].setKilled(inf[j]);
		}
		return cow_ants;
	}
}