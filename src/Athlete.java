
class Athlete {
	String name;
	int speed;
	int bibNumber;
	static int count;
	static String location = "New York";
	static String startTime = "9:00";
	Athlete(String name, int speed){
		this.name = name;
		this.speed = speed;
		count++;
		this.bibNumber = count;
	}
	public static void main(String[] args) {
		Athlete john = new Athlete("John", 10);
		Athlete sara = new Athlete("Sara", 11);
		System.out.println(sara.name + "'s bib number is " + sara.bibNumber);
		System.out.println("The total number of athletes is " + count);
		location = "San Diego";
		System.out.println(john.name + " is running in " + john.location);
		john.location = "Chicago";
		System.out.println(sara.name + " is running in " + sara.location);
		
	}
}
