import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myShelter = new VirtualPetShelter();

		VirtualPet penny = new VirtualPet("Penny", 0, 0, 0, "Loves to cuddle!");
		VirtualPet charlie = new VirtualPet("Charlie", 0, 0, 0, "Loves to run!");

		myShelter.add(penny);
		myShelter.add(charlie);

		String choice = "";
		do {

			System.out.println("Welcome to Ricky's Rescues! Here you will find the sweetest pups all looking for a place to call home!");
			System.out.println("Wat would you like to do today?");
			myShelter.getAllPets();
			System.out.println();

			System.out.println("1 - Feed the puppies");
			System.out.println("2 - Give the puppies some water");
			System.out.println("3 - Play with a puppy");
			System.out.println("4 - Adopt a puppy");
			System.out.println("5 - Leave the shelter empty handed");
			choice = input.nextLine();

			if (choice.equals("1")) {
				myShelter.feedAll();
				System.out.println("That was yummy!");
			}

			else if (choice.equals("2")) {
				myShelter.waterAll();
				System.out.println("Thanks we were thirsty!");
			}

			else if (choice.equals("3")) {
				myShelter.play(choice);
				System.out.println("Pick a puppy and have fun!");
				System.out.println();
				myShelter.getAllPets();
				String playChoice = input.nextLine();
			}

			else if (choice.equals("4")) {
				System.out.println("Which puppy would you like to adopt?");
				String removePet = input.next();
				System.out.println("Have fun with your new best friend!!");
			}
		} while (!choice.equals("5"));

		input.close();

	}

}