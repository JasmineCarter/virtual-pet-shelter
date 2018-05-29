import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder; 
import java.util.Collection;
import static org.hamcrest.Matchers.nullValue; 

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2; 
	

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("Penny", 50, 0, 0, false, false, "Loves to cuddle!", 0);
		pet2 = new VirtualPet("Charlie",50,0,0,false, false, "Loves to run!", 0);
	}

	@Test
	public void shouldBeAbleToAddOnePet() {
		underTest.add(pet1);
		VirtualPet check = underTest.getPet("Penny");
		assertThat(check, is(pet1));

	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		Collection<VirtualPet> allPets = underTest.getAllPets(); 
		assertThat(allPets, containsInAnyOrder(pet1, pet2)); 
	}

	@Test 
	public void shouldBeAbleToAdoptOnePet() {
		underTest.add(pet1);
		underTest.add(pet2); 
		underTest.remove(pet1);
		Collection<VirtualPet> allPets = underTest.getAllPets(); 
		assertThat(allPets.size(), is(1)); 
		
	}
	
	@Test 
	public void shouldReturnPetNamePenny() {
		VirtualPet underTest = new VirtualPet("Penny", 0,0,0,false,false,"",0); 
		String check = underTest.getName(); 
		assertEquals(check, "Penny"); 
	}
	
	@Test 
	public void shouldReturnLovesToRun() {
		VirtualPet underTest = new VirtualPet("",0,0,0,false,false,"Loves to run!",0); 
		String check = underTest.getDescription(); 
		assertEquals(check, "Loves to run!"); 
	}
	
	@Test
	public void shouldReturnHungerof0AfterFeeding50() {
		VirtualPet underTest = new VirtualPet("", 0,0,0,false,false,"",0); 
		underTest.feed(50); 
		int check = underTest.getHunger(); 
		assertEquals(50, check); 
	}
	
	@Test
	public void shouldReturnThirstof25AfterWatering25() {
		VirtualPet underTest = new VirtualPet("",0,0,0,false,false,"",0); 
		underTest.thirst(25); 
		int check = underTest.getThirst(); 
		assertEquals(25, check); 
	}
	
	@Test
	public void shouldHaveBoredomOf0AfterPlay100() {
		VirtualPet underTest = new VirtualPet("",0,0,0,false,false,"",0); 
		underTest.activity(100); 
		int check = underTest.getActivity(); 
		assertEquals(100, check); 
		
	}
	
	
	
}

