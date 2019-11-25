public class Car extends Vehicle{


	public Car(String brand) {
		super (brand);
	}

	@Override
	public String doStuff(){	
		return "I am " + brand + " and I go wrooom wrooom! My number of kilometers is: "+kilometers+ "km";
	}
}
