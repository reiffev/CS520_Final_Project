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
	 * @return void
	 */
	public String showMutant();
	
	/**
	 * @param status
	 * 
	 * @return void
	 */
	public void setKilled(boolean status);
}
