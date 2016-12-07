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
	public String[] getMutantCode(){

	}

	/*
	*
	*/
	public String[] getOriginalCode(){

	}

	/*
	*
	*/
	public boolean[] getKillInfo(){
		List<boolean> killInfo = new List();
		buf = new BufferedReader(new FileReader(file));
		buf.readLine();
		while(buf.ready()){
			String line = buf.readLine();
			String [] info = line.split(",");
			killInfo.add(info[1].equals("FAIL"));
		}
		return killInfo.toArray();
	}
}