package converter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface Converter {

	/*
	*
	*/
	String file = "";

	/*
	*
	*/
	BufferedReader buf = null;

	//Combine these next two methods?

	/**
	*
	*/
	public String getMutantCode(int number, int line) throws IOException;

	/**
	*
	*/
	public String getOriginalCode(int line) throws IOException;

	/** 
	 * @throws IOException 
	*
	*/
	public boolean[] getKillInfo() throws IOException;
	
	/** 
	 * @throws IOException 
	*
	*/
	public String[] getMutantInfo() throws IOException;

}
