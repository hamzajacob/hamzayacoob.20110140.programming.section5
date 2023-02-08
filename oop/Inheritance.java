package oop;

public class Inheritance extends Attributes {

	
	private String fourth;
	
	public Inheritance(String first, String second, String third) {
		this.fourth="Yacoub";
	}

	public Inheritance(String first, String second, String third, String fourth){
		this.fourth=fourth;
	}
	
	public String getFourth()
	{
		return fourth;
	}
	public void setFourth()
	{
		this.fourth = fourth;
	}
}
