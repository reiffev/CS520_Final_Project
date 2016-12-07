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
	public String[] getMutantCode();

	/**
	*
	*/
	public String[] getOriginalCode();

	/** 
	 * @throws IOException 
	*
	*/
	public String[] getKillInfo() throws IOException;

}
