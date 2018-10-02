package libraryExample;

public class ReferenceBook extends LibraryBook {
	protected String collection;
	
	/**
	 * custom constructor
	 * @param theAuthor
	 * @param theTitle
	 * @param theIsbn
	 * @param theCallNumber
	 * @param theCollection
	 */
	ReferenceBook(String theAuthor, String theTitle, String theIsbn, 
			String theCallNumber, String theCollection) {
		super(theAuthor, theTitle, theIsbn, theCallNumber);
		collection = theCollection;
	}
	
	/**
	 * 
	 * @return the collection
	 */
	public String getCollection() {
		return collection;
	}
	
	/**
	 * set the collection to given value
	 * @param theCollection
	 */
	public void setCollection(String theCollection) {
		collection = theCollection;
	}
	
	/**
	 * checkout handles processing for a patron to check out a book. 
	 * @param theCurrentHolder
	 * @param theDueDate
	 */
	public void checkout(String theCurrentHolder, String theDueDate) {
		System.out.println("cannot check out a reference book");
	}
	
	/**
	 * returned handles processing for when a book is returned after having been checked out. 
	 */
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
	}
	
	/**
	 * circulationStatus indicates whether the book is on the shelves, checked, 
	 * or non-circulating in the reference collection. 
	 * @return the currentHolder's name and due date
	 */
	public String circulationStatus() {
		return "non-circulating reference book";
	}
	
	/**
	 * reports Title, Author, ISBN, Circulation Status, Call number, and Collection information
	 */
	public String toString() {
		return super.toString() + "\t" + "collection: " + collection;
	}
	
	
	public static void main(String []args) {
		ReferenceBook rb1 = new ReferenceBook("Henry Walker", "Mr.Walker", "042519647X", "874th9h8j9", "Autobiographies");
		System.out.println(rb1);
		
		rb1.checkout("Hunain", "10/11/18");
		System.out.println(rb1.circulationStatus());
		rb1.returned();

		System.out.println(rb1.getCollection());
		
		rb1.setCollection("Non-Fiction");
		
		System.out.println(rb1.getCollection());
		
		System.out.println(rb1);
		
	}
	
	
	
	
}
