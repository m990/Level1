public class PetPlatypus {
	private String name;
	public PetPlatypus() {
		// TODO Auto-generated constructor stub
		name = "Perry";
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus crime fighting platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		PetPlatypus perry = new PetPlatypus();
		//2. Call the sayHi method
		perry.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
	}
}
