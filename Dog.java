class Dog extends Animal{
	
	public Dog(String name, int legs) {
		super(name, legs);
	}

	public String toStirng() {
		return name + legs;
	}
	public String getName() {
		return name;
	}
	public int getLegs() {
		return legs;
	}
	
}