package mutant;

public interface Mutant {
	
	/**
	 * @variable 
	 */
	boolean killed = false;
	
	/**
	 * @variable 
	 */
	String mutant = "";
	
	/**
	 * 
	 * @return
	 */
	public boolean isKilled();
	
	/**
	 * @param mutants
	 * 
	 * @return void
	 */
	public void addMutant(String mutant);
	
	/**
	 * 
	 * @return void
	 */
	public void showMutant();
	
	/**
	 * @param status
	 * 
	 * @return void
	 */
	public void setKilled(boolean status);
}
