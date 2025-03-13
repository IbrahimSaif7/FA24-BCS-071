public class Department{

	private Person incharge;
	private String name;
	Lab labs[]= new Lab[12];

	Department(Person incharge, String name){

		this.incharge=incharge;
		this.name=name;

		for(int i=0; i<labs.length; i++){

			labs[i]= new Lab("Lab"+i+1, new Person("Staff "+ i+1, "Manager"));

		}


	
	}

	public void showDepartment(){
		
		System.out.println("Lab name: "+ name);
		System.out.println("Incharge: ");
		incharge.showPersonDetails();
		System.out.println(" ");

		for(int i=0; i<labs.length; i++){

			labs[i].showLabDetails();

		}


		

	}


}