package libraryExample;

public class Book {
	
	protected String author;
	protected String title;
	protected String isbn;
	
	/**
	 * default constructor
	 */
	Book() {
		author = null;
		title = null;
	    isbn = null;
	}
	
	/**
	 * custom constructor
	 * @param theAuthor
	 * @param theTitle
	 * @param theIsbn
	 */
	Book(String theAuthor, String theTitle, String theIsbn) {
		author = theAuthor;
		title = theTitle;
	    isbn = theIsbn;
	}

	/**
	 * 
	 * @return the author name
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * 
	 * @return the book title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @return the ISBN number 
	 */
	public String getIsbn() {
		return isbn;
	}
	
	/**
	 * set the author name to given value
	 * @param theAuthor
	 */
	public void setAuthor(String theAuthor) {
		author = theAuthor;
	}
	
	/**
	 * set the title name to given value
	 * @param theTitle
	 */
	public void setTitle(String theTitle) {
		title = theTitle;
	}
	
	/**
	 * set the isbn to given value
	 * @param theIsbn
	 */
	public void setIsbn(String theIsbn) {
		isbn = theIsbn;
	}
	
	/**
	 * reports Title, Author, and ISBN information
	 */
	public String toString() {
		return "Title: " +title+"\t"
				+ "Author: " + author+"\t"+ "ISBN: " + isbn; 
	}
	
	public static void main(String []args) {
		Book b1 = new Book("Stef", "CS", "29829534");
		b1.setTitle("SCIFI");
		b1.setAuthor("HUN");
		b1.setIsbn("111111111");
		System.out.println(b1);
	}
}
