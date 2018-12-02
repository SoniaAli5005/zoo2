package zooExercise;

public abstract class Animals {

	//////////Attributes///////////
	
	protected String type;
	protected String name;
	protected float height;
	protected float weight;
	protected int age;
	
	/////////Constructors/////////
	
	public Animals(String vType, char vGender, String vName, Float vHeight, Float vWeight, int vAge) {
		this.type = vType;
		this.name = vName;
		this.height = vHeight;
		this.weight = vWeight;
		this.age = vAge;
	}

	/////////Method//////////////
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getweight() {
		return weight;
	}
	public void setwight(float weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return type + " [" + name + "," + height + "," + weight + "," + age + "] ";
	}
	
}
