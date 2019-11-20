public class Classroom {

	public static void main(String[] args){
	
		Wilder WilderAObject = new Wilder();
		Wilder WilderBObject = new Wilder();
		WilderAObject.setName("Marcus");
		WilderAObject.setPresent(true);
		WilderBObject.setName("Christoph");
		WilderBObject.setPresent(false);
		System.out.println(WilderAObject.whoAmI());
		System.out.println(WilderBObject.whoAmI());
				
	}
}
