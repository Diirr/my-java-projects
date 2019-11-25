public class Boat extends Vehicle{


	 public Boat(String brand) {
                super (brand);
        }

        @Override
        public String doStuff(){
                return "I am " + brand + " and I go glug glug! my number of kilometers is: "+kilometers+ "km";
        }

}
