package libraryExample;

public abstract class LibraryBook extends Book
	implements Comparable<LibraryBook> {
	
	protected long callNumber;
	
	LibraryBook(String theAuthor, String theTitle, long theIsbn, long theCallNumber) {
		super(theAuthor, theTitle, theIsbn);
		callNumber = theCallNumber;
	}
	
	// Getter Method
	public long getCallNumber() {
		return callNumber;
	}
	
	//Setter Method
	public void setCallNumber(long theCallNumber) {
		callNumber = theCallNumber;
	}
	
	public abstract void checkout();
	
	public abstract void returned();
	
	public abstract String circulationStatus();
	
	public int compareTo(LibraryBook c) {
		if(c.getCallNumber() > callNumber) {
			return 1;
		} 
		else if (c.getCallNumber() == callNumber){
			return 0;
		}
		else {
			return -1;
		}
	}
	
	/* IMPLEMENT THIS */
	public String toString() {
		return 
	}


}
