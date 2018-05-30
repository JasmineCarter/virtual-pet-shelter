
public class VirtualPet {

	private String petName;
	private String petDescription;
	private int hunger;
	private int thirst;
	private int water;
	private int boredom;

	public VirtualPet(String petName, int hunger, int thirst, int boredom, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public void feed() {
		hunger -= 10;
	}

	public int getHunger() {
		return hunger;
	}

	public void water() {
		thirst -= 15;
	}

	public int getThirst() {
		return thirst;
	}

	public void activity() {
		boredom -= 20;
	}

	public int getBoredom() {

		return boredom;
	}

	public void tick() {
		hunger += 5;
	}

}
