package libraryExample;

public class Book {
	
	protected String author;
	protected String title;
	protected long isbn;
	
	Book() {
		author = null;
		title = null;
	    isbn = 0;
	}
	
	Book(String theAuthor, String theTitle, long theIsbn) {
		author = theAuthor;
		title = theTitle;
	    isbn = theIsbn;
	}

	// Getter Methods
	
	public String getAuthor() {
		return author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public long getIsbn() {
		return isbn;
	}
	
	// Setter Methods
	
	public void setAuthor(String theAuthor) {
		author = theAuthor;
	}
	
	public void setTitle(String theTitle) {
		title = theTitle;
	}
	
	public void setIsbn(int theIsbn) {
		isbn = theIsbn;
	}
	
	//returns a string of the description of the class
	public String toString() {
		return "Book: " +"\t"+ "Title: " +title+"\t"
				+ "Author: " + author+"\t"+ "ISBN: " + isbn; 
	}
	
	public static void main(String []args) {
		Book b1 = new Book("Steph", "CS", 29829534);
		b1.setTitle("SCIFI");
		b1.setAuthor("HUN");
		b1.setIsbn(111111111);
		System.out.println(b1);
	}
	
	
	
	
}
