public class Classroom {

	public static void main(String[] args){
	
		Wilder WilderAObject = new Wilder();
		Wilder WilderBObject = new Wilder();
		WilderAObject.setName("Marcus");
		WilderAObject.setPresent(true);
		WilderBObject.setName("Christoph");
		WilderBObject.setPresent(false);
		WilderAObject.whoAmI();
		WilderBObject.whoAmI();
				
	}
}
