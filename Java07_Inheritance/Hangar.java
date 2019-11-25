public class Hangar{
	
	public static void main(String[] args){
		
		Vehicle bmw = new Car ("BMW");
		bmw.setKilometers(20000);
		System.out.println(bmw.doStuff());


		Boat titanic = new Boat ("Titanic");
		titanic.setKilometers(1000);
		System.out.println(titanic.doStuff());

	}
}
