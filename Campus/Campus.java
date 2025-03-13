public class Campus{

	private String name;
	private Person director;
	Department departments[] = new Department[4];

	Campus(String name, Person director){

		this.name=name;
		this.director=director;

		for(int i=0; i<departments.length; i++){

			departments[i]= new Department(new Person("incharge" + i+1, "incharge"), "Department"+ i+1);

		}
		
	}


	public void showCampus(){

		System.out.println("Name: "+ name);
		System.out.println("Director: ");
		director.showPersonDetails();
		
		System.out.println("");

		for(int i=0; i<departments.length; i++){

			departments[i].showDepartment();

		}




	}

	


}