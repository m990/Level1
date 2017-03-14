import javax.swing.JOptionPane;

public class Person {
	String name;
	String superPower;
	public static void main(String[] args) {
		Person max = new Person();
		String name = JOptionPane.showInputDialog("What is your name?");
		String power = JOptionPane.showInputDialog("What is your super power?");
		max.setName(name);
		max.setSuperPower(power);
		
		String jerry = max.toString();
		System.out.println(jerry);
	}

	 public String getName() {
		 return name;
	}
	 public void setName(String setName){
		 name = setName;
	 }
	 public String getSuperPower(){
		 return superPower;
	 }
	 public void setSuperPower(String newSuperPower){
		 superPower = newSuperPower;
	 }
	 public String toString(){
		 String power = getSuperPower();
		 String name = getName();
		 
		 String sentence = name + "'s super power is " + power + ".";
		 return sentence;
	 }
}