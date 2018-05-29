import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>(); 

	public void add(VirtualPet virtualPet) {
		pets.put(virtualPet.getName(), virtualPet); 
	}

	public VirtualPet getPet(String petName) {

		return pets.get(petName);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void remove(VirtualPet pet1) {
		pets.remove(pet1.getName()); 
	}

	public void feedAll() {
		for (VirtualPet pet: pets.values()) {
			pet.feed();
		}
	}

	public void play(String name) {
		pets.get(name).activity();
	}


	
}
