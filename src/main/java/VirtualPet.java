
public class VirtualPet {

	private String petName;
	private String petDescription;
	private int hunger;
	private int thirst;
	private int water;
	private int activity;
	private int boredom;

	public VirtualPet(String petName, int hunger, int thirst, int activity, boolean getsBath , boolean getsTreat, String petDescription, int boredom) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hunger = hunger;
		this.thirst = thirst;
		this.activity = activity;
	}

	public String getName() {
		return petName;
	}

	public String getDescription() {
		return petDescription;
	}

	public void feed(int feed) {
		hunger -= feed; 
	}

	public int getHunger() {
		return hunger;
	}

	public void thirst(int thirst) {
		thirst -= water;
	}

	public int getThirst() {
		return thirst;
	}

	public void activity(int activity) {
		boredom -= activity;
	}

	public int getActivity() {
		return activity;
	}

}
