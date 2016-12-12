package mutant;


public class caseMutant implements Mutant{
	
	//Variables
	/**
	 * @variable 
	 */
	private boolean killed = false;
	
	/**
	 * @variable 
	 */
	private String mutant = "";
	
	/**
	 * @variable 
	 */
	private String original = "";
	
	/**
	 * 
	 * @return boolean
	 */
	public boolean isKilled(){
		return this.killed;
	}
	
	//Methods
	/**
	 * @param mutants
	 * 
	 * @return void
	 */
	public void addMutant(String mutant){
		this.mutant = mutant;
	}
	
	/**
	 * @param orig
	 * 
	 * @return void
	 */
	
	public void addOriginal(String orig){

	}
	
	/**
	 * 
	 * @return void
	 */
	public String showMutant(){
		return mutant;
	}
	
	/**
	 * @param status
	 * 
	 * @return void
	 */
	public void setKilled(boolean status){
		this.killed = status;
	}
}