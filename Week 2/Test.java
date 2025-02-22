import java.util.Scanner;
public class Test{

	public static void main(String args[]){
		String usernamein,passin;


		Product pro1=new Product("Shampoo",20,30,"beauty");
		pro1.display();
		System.out.println("");

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter username: ");
 		usernamein= sc.nextLine();

		if(usernamein.equals(UserInfo.username))
			System.out.println("VALID");

		System.out.print("Enter Password: ");
 		passin= sc.nextLine();
		

		if(passin.equals(UserInfo.password))
			System.out.println("VALID");
	
		


		





	}






}