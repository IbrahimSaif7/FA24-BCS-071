package Library;
public class LibraryApp{

	public static void main(String args[]){

		Library lib = new Library("KNOWLEDGE", new Book("Silence", "232", new Date(4,3,2), new Person("bob","author",new Address("minow","London"))), new Person("Saad","incharge",new Address("grey","karachi")), new Person("Sam","librarian",new Address("Nor","lahore")));



		lib.showLibraryDetails();	

	}



}