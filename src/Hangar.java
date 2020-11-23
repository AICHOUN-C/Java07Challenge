
public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car auto1 = new Car ("Peugeot", 289632);
		Car auto2 = new Car ("Renault", 000250);
		
		Boat yatch1 = new Boat("Zodiac", 5600);
		Boat yatch2 = new Boat("Odyssey", 0);
		
		System.out.println(auto1.doStuff());
		System.out.println(auto2.doStuff());
		System.out.println(yatch1.doStuff());
		System.out.println(yatch2.doStuff());
		
	}

}
