package converter;

import java.io.*;
import java.util.*;

public class csvConverter implements Converter{
	
	private String file;

	private BufferedReader buf;

	public csvConverter(String f){
		this.file = f;
	}
	/*
	*
	*/
	public String[] getMutantCode(){
		return null;
	}

	/*
	*
	*/
	public String[] getOriginalCode(){
		return null;
	}

	/*
	*
	*/
	public String[] getKillInfo() throws IOException{
		List<Boolean> killInfo = new ArrayList<Boolean>();
		buf = new BufferedReader(new FileReader(file+"/mutation_results/killed.csv"));
		buf.readLine();
		while(buf.ready()){
			String line = buf.readLine();
			String [] info = line.split(",");
			killInfo.add(info[1].equals("FAIL"));
		}
		return (String[]) (killInfo.toArray());
	}
}