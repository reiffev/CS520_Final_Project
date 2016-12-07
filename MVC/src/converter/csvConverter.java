package coverter;

public csvCoverter extends Coverter{
	
	private String file;

	private BufferedReader buf;

	public csvConverter(String f){
		this.file = f;
	}
	/*
	*
	*/
	public List<String> getMutantCode(){

	}

	/*
	*
	*/
	public List<String> getOriginalCode(){

	}

	/*
	*
	*/
	public List<boolean> getKillInfo(){
		List<boolean> killInfo = new List();
		buf = new BufferedReader(new FileReader(file));
		buf.readLine();
		while(buf.ready()){
			String line = buf.readLine();
			String [] info = line.split(",");


		}
	}
}