public class Classroom {

	public static void main(String[] args){
	
		Wilder WilderAObject = new Wilder("Malte",true);
		Wilder WilderBObject = new Wilder("Robert",false);
		WilderAObject.setName("Markus");
	//	WilderAObject.setPresent(true);
		WilderBObject.setName("Christoph");
	//	WilderBObject.setPresent(false);
		System.out.println(WilderAObject.whoAmI());
		System.out.println(WilderBObject.whoAmI());
				
	}
}
