package Library;
public class Address{

	private String street;
	private String city;

	public Address(String street, String city){

		this.street=street;
		this.city=city;

	}

	public Address(Address other){
		
		this.street=other.street;
		this.city=other.city;
	
	}

	public void showAddress(){

		System.out.println(street + ", " + city);		

	}

	public boolean equals(Object obj){

		Address address=(Address) obj;
		if(address.street==this.street && address.city==this.city){
		
			return true;
		}	
		else{
			return false;
		}
	}

	public String getStreet(){
		return street;
	}

	public void setStreet(String street){
		
		this.street=street;
	}

	public String getcity(){

		return city;
	}


	public void setCity(String city){

		this.city=city;
	
	}

}	