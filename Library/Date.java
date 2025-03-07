package Library;
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

	public void showDate(){

		System.out.println(day + "/" + month + "/" + year);
	}

	public boolean equals(Object obj){

		Date date=(Date) obj;
		if(date.day==this.day && date.month==this.month && date.year==this.year){

			return true;
		}
		else{
			return false;
		}

	}


		public int getDay(){

			return day;

		}

		public void setDay(int day){

			this.day=day;
		}

		public int getMonth(){

			return month;
		}

		public void setMonth(int month){

			this.month=month;
		}

		public int getYear(){

			return year;
		}

		public void setYear(int year){

			this.year=year;
		}


	

}