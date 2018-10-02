package libraryExample;

public abstract class LibraryBook extends Book
	implements Comparable<LibraryBook> {
	
	protected String callNumber;

	/**
	 * custom constructor
	 * @param theAuthor
	 * @param theTitle
	 * @param theIsbn
	 * @param theCallNumber
	 */
	LibraryBook(String theAuthor, String theTitle, String theIsbn, String theCallNumber) {
		super(theAuthor, theTitle, theIsbn);
		callNumber = theCallNumber;
	}

	/**
	 * 
	 * @return the call number
	 */
	public String getCallNumber() {
		return callNumber;
	}
	
	/**
	 * set the call number to given value
	 * @param theCallNumber
	 */
	public void setCallNumber(String theCallNumber) {
		callNumber = theCallNumber;
	}
	
	/**
	 * checkout handles processing for a patron to check out a book. 
	 * @param theCurrentHolder
	 * @param theDueDate
	 */
	public abstract void checkout(String theCurrentHolder, String theDueDate);
	
	/**
	 * returned handles processing for when a book is returned after having been checked out. 
	 */
	public abstract void returned();
	
	/**
	 * circulationStatus indicates whether the book is on the shelves, checked, 
	 * or non-circulating in the reference collection. 
	 * @return the currentHolder's name and due date
	 */
	public abstract String circulationStatus();
	
	/**
	 *  compareTo allows comparison/ordering of library books, 
	 *  following the format of Java's Comparable interface 
	 */
	public int compareTo(LibraryBook c) {
		return c.getCallNumber().compareTo(callNumber);
	}

	/**
	 * reports Title, Author, ISBN, Circulation Status, and Call number information
	 */
	public String toString() {
		return super.toString() + "\t" + "CirculationStatus: " + circulationStatus()
				+ "\t" + "call number: " + callNumber;
	}
	
	

}
