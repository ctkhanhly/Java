
public class Address {
	
		private int number;

		private String street;

		private String city;

		private String state;

		private int zip;


		public Address(){
//initialized to nothing
			street= "1";
			city = "SG";
			//all not defined here: int: initialized to 0, string: initialized to null

		}


		public Address(int n,String s, String c, String st, int z){

		number = n;

		street = s;

		city = c;

		state = st;

		zip = z;

		}


		public int getNumber(){

		return number;

		}



		public String getStreet() {

		return street;

		}



		public void setStreet(String street) {

		this.street = street;

		}



		public String getState() {

		return state;

		}



		public void setState(String state) {

		this.state = state;

		}


		public String getCity(){

		return city;

		}


		public void setCity(String c){

		city = c;

		}



		public int getZip() {

		return zip;

		}



		public void setZip(int zip) {

		this.zip = zip;

		}



		public void setNumber(int number) {

		this.number = number;

		}


		public String toString(){

		return number + " " + street + ", " + city + ", " + state;

		}
//green error: override
		


		
}
