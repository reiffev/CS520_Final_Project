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
	public String getMutantCode(int number) throws IOException{
		String moo = "";
		buf = new BufferedReader(new FileReader(file+"/mutation_results/mutants/"+number+"/triangle/Triangle.java"));
		while(buf.ready()){
			moo += buf.readLine();
		}
		return moo;
	}

	/*
	*
	*/
	public String getOriginalCode() throws IOException{
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