package Library;
public class Book{

	private String title;
	private String issn;
	private Date publication;
	Person author;

	public Book(String title, String issn, Date publication, Person author){

        this.title = title;
        this.issn = issn;
        this.publication = publication;
        this.author = author;

	}

	public Book(Book other){

        this.title = other.title;
        this.issn = other.issn;
        this.publication = other.publication;
        this.author = other.author;

        }

	public void showBookDetails(){

        System.out.println("Title: " + title + ", ISSN: " + issn);
        publication.showDate();
        author.showPersonDetails();

        }


}