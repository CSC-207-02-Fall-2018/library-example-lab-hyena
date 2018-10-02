package libraryExample;

public class CirculatingBook extends LibraryBook {
	protected String currentHolder;
	protected String dueDate;
	
	/**
	 * custom constructor
	 * @param theAuthor
	 * @param theTitle
	 * @param theIsbn
	 * @param theCallNumber
	 */
	CirculatingBook(String theAuthor, String theTitle, String theIsbn, String theCallNumber){
		super(theAuthor, theTitle, theIsbn, theCallNumber);
		currentHolder = null;
		dueDate = null;
	}
	
	/**
	 * 
	 * @return the current holder
	 */
	public String getCurrentHolder() {
		return currentHolder;
	}
	
	/**
	 * 
	 * @return the due date
	 */
	public String getDueDate() {
		return dueDate;
	}
	
	/**
	 * report the current holder
	 * @param theCurrentHolder
	 */
	public void setCurrentHolder(String theCurrentHolder) {
		currentHolder = theCurrentHolder;
	}
	
	/**
	 * report the current holder
	 * @param theDueDate
	 */
	public void setDueDate(String theDueDate) {
		dueDate = theDueDate;
	}
	
	/**
	 * checkout handles processing for a patron to check out a book. 
	 * @param theCurrentHolder
	 * @param theDueDate
	 */	
	public void checkout(String theCurrentHolder, String theDueDate) {
		currentHolder = theCurrentHolder;
		dueDate = theDueDate;
	}
	
	/**
	 * returned handles processing for when a book is returned after having been checked out. 
	 */	
	public void returned () {
		currentHolder = null;
		dueDate = null;
	}

	/**
	 * circulationStatus indicates whether the book is on the shelves, checked, 
	 * or non-circulating in the reference collection. 
	 * @return the currentHolder's name and due date
	 */	
	public String circulationStatus() {
		if (currentHolder == null) {
			return "book available on shelves";
		} else {
			return "Current Holder: " + currentHolder + "\t" + "Due Date: " + dueDate;
		}
	}
	
	/**
	 * reports Title, Author, ISBN, Circulation Status, Call number, and Collection information
	 */
	public String toString() {
		return super.toString() + "\t" + "Current Holder: " + currentHolder 
				+ "\t" + "Due Date: " + dueDate;
	}
	
	
	public static void main(String []args) {
		CirculatingBook cb1 = new CirculatingBook("Henry Walker", "Prof. Walker", "04694647X", "h0d8mk5o0f");
		System.out.println(cb1);
		
		cb1.checkout("Hunain", "10/11/18");
		System.out.println(cb1.circulationStatus());
		cb1.returned();
		System.out.println(cb1.circulationStatus());
		
		cb1.setDueDate("11/11/18");
		System.out.println(cb1.getDueDate());
		
		cb1.setCurrentHolder("Hun Ali");
		System.out.println(cb1.getCurrentHolder());
		
		System.out.println(cb1);
		
	}
	
	
}
