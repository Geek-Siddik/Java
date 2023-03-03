public class TextBook extends Book
{
	private int standard;
	
	public TextBook()
	{
		System.out.println("Default Constructor of TB");
	}
	
	public TextBook(String isbn, String bookTitle, String authorName, double price,int availableQuantity, int standard)
	{
		super(isbn, bookTitle, authorName, price, availableQuantity);
		this.standard = standard;
		System.out.println("Parameterized Constructor of Textbook");
	}
	
	public void setStandard(int standard)
	{
		this.standard=standard;
	}
	
	public int getStandard() 
	{
		return standard;
	}
}