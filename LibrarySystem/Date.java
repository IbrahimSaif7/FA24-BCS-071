package LibrarySystem;
public class Date{

	private int day;
	private int month;
	private int year;

	Date(int day, int month, int year){

		this.day=day;
		this.month=month;
		this.year=year;

	}

	Date(Date other){

		this.day=other.day;
		this.month=other.month;
		this.year=other.year;
	}

	public void showdate(){

		System.out.printf("Date:",  day,"/n");

		System.out.printf("Month:",  month,"/n");

		System.out.printf("Year:",  year,"/n");

	}


}