package Library;
public class Person{

	private String name;
	private String role;
	private Address address;

	public Person(String name, String role, Address address){

        this.name = name;
        this.role = role;
        this.address = address;

        }

	public Person(Person other){

        this.name = other.name;
        this.role = other.role;
        this.address = other.address;

        }

	public void showPersonDetails(){

        System.out.println("Name: " + name + ", Role: " + role);
        address.showAddress(); 
	
	}

        public boolean equals(Object obj){

		Person person = (Person) obj;
		
		if(person.name==this.name && person.role==this.role && person.address==this.address){
			return true;

		}

		else{
			return false;
		}


	}




}