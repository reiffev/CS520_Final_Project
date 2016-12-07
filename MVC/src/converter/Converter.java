package converter;

public interface Converter {

	/*
	*
	*/
	private String file;

	/*
	*
	*/
	private BufferedReader buf;

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
	*
	*/
	public boolean[] getKillInfo();

}
