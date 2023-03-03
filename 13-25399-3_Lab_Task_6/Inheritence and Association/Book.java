public class Book
{
	protected String isbn;
	protected String bookTitle;
	protected String authorName;
	protected double price;
	protected int availableQuantity;
	
	public Book()
	{
		System.out.println("Default Constructor of Book Class");
	}
	
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		System.out.println("Parameterized Constructor of Book Class");
	}
	
	//set methods
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void setBookTitle(String bookTitle)
	{
		this.bookTitle = bookTitle;
	}
	
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}
	
	//get methods
	public String getIsbn()
	{
		return isbn;
	}
	
	public String getBookTitle ()
	{
		return bookTitle;
	}
	
	public String getAuthorName ()
	{
		return authorName;
	}
	
	public double getPrice ()
	{
		return price;
	}
	
	public int getAvailableQuantity ()
	{
		return availableQuantity;
	}
	
	//add quantity method
	public void addQuantity (int amount)
	{
		if (amount>0)
		{
			this.availableQuantity+=amount;
			System.out.println("Updated Quantity after adding is: "+this.availableQuantity);
		}
		else
		{
			System.out.println("Can not add 0 book or negative amount of book");
		}
	}
	
	//sell quantity method
	public void sellQuantity (int amount)
	{
		if (this.availableQuantity>=amount)
		{
			this.availableQuantity-=amount;
			System.out.println("Updated Quantity after selling is: "+this.availableQuantity);
		}
		else
		{
			System.out.println("No books available");
		}
	}
	
	public void showDetails()
	{	
		System.out.println("\nShowing Details>>>>>>>>>>>>>>");
		System.out.println("Book ISBN Number : " + this.isbn);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Writer's Name: " + this.authorName);
		System.out.println("Book Price: " + this.price);
		System.out.println("Total in Stock: " + this.availableQuantity);
	}
	
}	