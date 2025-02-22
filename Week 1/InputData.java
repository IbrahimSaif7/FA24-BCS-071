import java.util.Scanner;
public class InputData{

     public static void main(String args[]){

		
		Scanner sc= new Scanner(System.in);
		   
                int i=0;
		
		System.out.println("Enter Integer: ");
		i= sc.nextInt();

		System.out.printf("Value in i: %d\n", i);

		sc.nextLine();

		System.out.println("Enter Name");
		String name= sc.nextLine();

		System.out.printf("Name: %50s\n", name);
      


       }



  }