package OOP_Encapsulation;

public class Company {
	
	private String name;
	private int empCount;
	private int shareCount;
	
	
	
	// we can use a constructor for setting the values instead of the setters
	public Company(String name, int empCount, int shareCount) { // --> right-click --> Source --> Generate Constructor using Fields
	
		this.name = name;
		this.empCount = empCount;
		this.shareCount = shareCount;
	}

	
	
	//public getters and setters: only for private variables by creating  --> right-click --> Source --> Generate Getters and Setters 
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getEmpCount() {
		return empCount;
	}
	
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	
	public int getShareCount() {
		return shareCount;
	}
	
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}

	
	
	
	
	
	
	
	
	
	

}
