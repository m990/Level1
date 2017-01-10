
public class HarryPotter {

	private boolean cloakOn;
	
	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}
	
	void complain(String reason){
		System.out.println("I really need a reason to complain. Oh, I got an idea!!! How about " + reason + "!!! I'm a true genius. Ask anyone but Snape.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter harry = new HarryPotter();
		// 2. become invisible
		harry.makeInvisible(true);
		// 3. spy on professor snape
		harry.spyOnSnape();
		// 4. become visible again
		harry.makeInvisible(false);
		// 5. cast a “stupefy” spell
		harry.castSpell("stupefy");
		harry.complain("It sucks to be a famous wizard");
	}

}