package javaFile_Storage;

public class Employee {
	
	private int eId;
	private String eName;
	private String eCity;
	
	public Employee(int eId, String eName, String eCity){
		this.eId = eId;
		this.eName = eName;
		this.eCity = eCity;
	}

	
	public String toString() {
		return this.eId + " " + this.eName + " " + this.eCity;
	}


	int geteId() {
		return eId;
	}


	void seteId(int eId) {
		this.eId = eId;
	}


	String geteName() {
		return eName;
	}


	void seteName(String eName) {
		this.eName = eName;
	}


	String geteCity() {
		return eCity;
	}


	void seteCity(String eCity) {
		this.eCity = eCity;
	}
	
}
