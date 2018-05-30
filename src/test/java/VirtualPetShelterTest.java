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
		pet1 = new VirtualPet("Penny", 50, 50, 50, "Loves to cuddle!");
		pet2 = new VirtualPet("Charlie", 50, 50, 50, "Loves to run!");

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
	public void shouldHaveFeedOf40WhenFeedingAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.feedAll();
		assertThat(pet1.getHunger(), is(40));
		assertThat(pet2.getHunger(), is(40));
	}

	@Test
	public void shouldHaveThirstOf20WhenWateringAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.waterAll();
		assertThat(pet1.getThirst(), is(35));
		assertThat(pet2.getThirst(), is(35));

	}

	@Test
	public void shouldBeAbleToFindAPet() {
		underTest.add(pet1);
		underTest.play(pet1.getName());
		assertThat(pet1.getBoredom(), is(30));
	}

	@Test
	public void shouldHaveHungerOf55AfterTickForAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);
		underTest.tick();
		assertThat(pet1.getHunger(), is(55));
		assertThat(pet2.getHunger(), is(55));
	}

}