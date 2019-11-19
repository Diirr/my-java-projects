public class Wilder {
	
		private String firstname;
		private boolean present;

		public void setName(String name){
		
			this.firstname=name;
		}

		public void setPresent(boolean isPresent){
			
			this.present=isPresent;
		}

		public String getName(){
			
			return firstname;
		}

		public boolean getPresent(){
			
			return present;
		}

		public void whoAmI(){
		
			if(present==true){

			System.out.println("My name is " +firstname+ " and Iam present");
			}
			else{
			System.out.println("My name is " +firstname+ " and Iam not present");
			}
		}
}
