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
	 * @variable 
	 */
	private String my_type = "";
	
	/**
	 * @variable 
	 */
	private int line_number = -1;
	
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
		this.original = orig;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String showMutant(){
		return mutant;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String showOriginal() {
		return original;
	}
	
	/**
	 * @param status
	 * 
	 * @return void
	 */
	public void setKilled(boolean status){
		this.killed = status;
	}

	@Override
	public void setType(String type) {
		my_type = type;
	}

	@Override
	public String getType() {
		return my_type;
	}

	@Override
	public void setLine(int line) {
		line_number = line;
		
	}

	@Override
	public int getLine() {
		return line_number;
	}
	
}