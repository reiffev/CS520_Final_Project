package mutant;

public interface Mutant {
	//Variables
	/**
	 * @variable 
	 */
	boolean killed = false;
	
	/**
	 * @variable 
	 */
	String mutant = "";
	
	/**
	 * @variable 
	 */
	String original = "";
	
	/**
	 * @variable 
	 */
	String my_type = "";
	
	/**
	 * @variable 
	 */
	int line_number = -1;
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean isKilled();
	
	//Methods
	/**
	 * @param mutants
	 * 
	 * @return void
	 */
	public void addMutant(String mutant);
	
	/**
	 * @param orig
	 * 
	 * @return void
	 */
	
	public void addOriginal(String orig);
	
	/**
	 * 
	 * @return String
	 */
	public String showMutant();
	
	/**
	 * 
	 * @return void
	 */
	public String showOriginal();
	
	/**
	 * @param status
	 * 
	 * @return void
	 */
	public void setKilled(boolean status);
	
	/**
	 * @param type
	 * 
	 * @return void
	 */
	public void setType(String type);
	
	/**
	 * 
	 * 
	 * @return String
	 */
	public String getType();
	
	/**
	 * @param line
	 * 
	 * @return void
	 */
	public void setLine(int line);
	
	/**
	 * 
	 * 
	 * @return integer
	 */
	public int getLine();
}
