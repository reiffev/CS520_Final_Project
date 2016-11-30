package mutant;

import java.util.List;

public interface Original {
	/**
	 * @variable
	 */
	List<Mutant> mutants = null;
	
	/**
	 * @variable
	 */
	String code = "";
	
	/**
	 * @param
	 * 
	 * @return
	 */
	public String showOriginal();
	
	/**
	 * @param
	 * 
	 * @return void
	 */
	public void addOriginal(String code);
	
	/**
	 * @param
	 * 
	 * @return
	 */
	public List<Mutant> getMutants();
	
	/**
	 * @param
	 * 
	 * @return
	 */
	public void setMutants(List<Mutant> list);
}
