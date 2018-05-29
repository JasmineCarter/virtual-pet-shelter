import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {

	
	@Test 
	public void shouldReturnPetNamePenny() {
		VirtualPet underTest = new VirtualPet("Penny", 0,0,0,""); 
		String check = underTest.getName(); 
		assertEquals(check, "Penny"); 
	}
	
	@Test 
	public void shouldReturnLovesToRun() {
		VirtualPet underTest = new VirtualPet("",0,0,0,"Loves to run!"); 
		String check = underTest.getDescription(); 
		assertEquals(check, "Loves to run!"); 
	}
	
	@Test
	public void shouldReturnHungerof0AfterFeeding50() {
		VirtualPet underTest = new VirtualPet("", 50,0,0,""); 
		underTest.feed(); 
		int check = underTest.getHunger(); 
		assertEquals(40, check); 
	}
	
	@Test
	public void shouldReturnThirstof0AfterWatering25() {
		VirtualPet underTest = new VirtualPet("",0,25,0, ""); 
		underTest.water(); 
		int check = underTest.getThirst(); 
		assertEquals(10, check); 
	}
	
	@Test
	public void shouldHaveBoredomOf0AfterPlay100() {
		VirtualPet underTest = new VirtualPet("",0,0,100, ""); 
		underTest.activity(); 
		int check = underTest.getBoredom(); 
		assertEquals(80, check); 
		
	}
	
	
	

}
