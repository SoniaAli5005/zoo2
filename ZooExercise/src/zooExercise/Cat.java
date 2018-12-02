package zooExercise;

public class Cat extends Animals{
	
	/////////////Attributes/////////////
	String colour;
	
	
	////////////Constructors////////////

	public Cat(String vColour, String vSpecies, char vGender, String vType, String vName, Float vHeight, Float vWeight, int vAge) {
		//super(vSpecies, vGender, vType, vName, vHeight, vWeight, vAge);
		this.colour = vColour;
		// TODO Auto-generated constructor stub
	}

	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
		
	//////////////Method///////////////
	
	public String sound() {
		return "Meow";
	}
}
