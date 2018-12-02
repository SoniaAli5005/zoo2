package zooExercise;

public class Mammals extends Animals {

	////////////Attributes/////////////
	
	private String species; 
	private char gender;
	
	///////////Constructors////////////
	public Mammals(String vSpecies, char vGender, String vType, String vName, Float vHeight, Float vWeight, int vAge) {
		super(vType, vGender, vName, vHeight, vWeight, vAge);
		this.species = vSpecies;
		this.gender = vGender;
	}

	
	/////////////Methods/////////////

	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}

}
