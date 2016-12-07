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
	public String getMutantCode(int number) throws IOException;

	/**
	*
	*/
	public String getOriginalCode() throws IOException;

	/** 
	 * @throws IOException 
	*
	*/
	public boolean[] getKillInfo() throws IOException;

}
