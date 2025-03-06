package LibrarySystem;
public class Person{

	private String name;
	private Sting role;
	private Address address;

	Person(String name, String role, Address address){

		this.name=name;
		this role=role;
		this.address=address;

	}
	
	
	Person(Person other){

		this.name=other.name;
		this.role=other.role;
		this.address=other.role;
		
	}

	void showPerson(){



	}

	Boolean equals(Object obj){

		if(this.name==obj.name && this.role==obj.role && this.address==other.address){


			return true;
		}
		return false;

	}
	
	

}