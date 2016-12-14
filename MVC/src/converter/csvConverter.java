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
	public String getMutantCode(int number, int line) throws IOException{
		String moo = "";
		int count = 0;
		buf = new BufferedReader(new FileReader(file+"//mutation_results/mutants/"+(number+1)+"/triangle/Triangle.java"));
		while(buf.ready()){
			if(count == (line-1) ){
				for(int j= 0; j<3; j++){
					moo += buf.readLine()+"\n";
				}
				return moo;
			}
			buf.readLine();
			count++;
		}
		return moo;
	}

	/*
	*
	*/
	public String getOriginalCode(int line) throws IOException{
		String moo = "";
		int count = 0;
		buf = new BufferedReader(new FileReader(file+"//mutation_results/triangle/Triangle.java"));
		while(buf.ready()){
			if(count == line-1){
				for(int j= 0; j<3; j++){
					moo += buf.readLine()+"\n";
				}
				return moo;
			}
			buf.readLine();
			count++;
		}
		return moo;
	}

	/*
	*
	*/
	public boolean[] getKillInfo() throws IOException{
		List<String> killInfo = new ArrayList<String>();
		buf = new BufferedReader(new FileReader(file+"/mutation_results/killed.csv"));
		buf.readLine();
		while(buf.ready()){
			String line = buf.readLine();
			String [] info = line.split(",");
			killInfo.add(info[1]);
		}
		boolean[] kil = new boolean[killInfo.size()];
		for(int j=0; j<killInfo.size(); j++){
			kil[j] = killInfo.get(j).equals("FAIL");
		}
		return kil;
	}
	
	public String[] getMutantInfo() throws IOException{
		List<String> mutantInfo = new ArrayList<String>();
		buf = new BufferedReader(new FileReader(file+"/mutation_results/mutants.log"));
		while(buf.ready()){
			String mutant_info = "";
			String line = buf.readLine();
			
			//Getting the typ of mutant
			int param = line.indexOf(":");
			String temp = line.substring(param+1, param+4);
			//add type to the mutant info string
			mutant_info += temp+",";
			
			//Getting the line number of the mutant
			param = line.indexOf("@classify:");
			temp = line.substring(param+10);
			param = temp.indexOf(":");
			String m_code = temp.substring(0, param);
			//add number to the mutant info string
			mutant_info += m_code;
			//add mutant info to list
			mutantInfo.add(mutant_info);
		}
		String[] inf = new String[mutantInfo.size()];
		for(int j=0; j<mutantInfo.size(); j++){
			inf[j] = mutantInfo.get(j);
		}
		return inf;
	}
}
