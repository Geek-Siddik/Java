public class Book

{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private static int no;
	
	// Making default constructor
	public Book () 
	{
		System.out.println("New Book added");
		no++;
	}
	
	// Making constructor for book class and parameterizing them
	public Book(String isbn, String bookTitle, String authorName, double price, int availableQuantity)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity =  availableQuantity;
		int x=100;
		System.out.println("Value of x :"+x);
	}
	
	//setter Methods
	public void setIsbn (String isbn)
	{
		this.isbn=isbn;
	}
	public void setBookTitle (String bookTitle)
	{
		this.bookTitle=bookTitle;
	}
	public void setAuthorName (String authorName)
	{
		this.authorName=authorName;
	}
	public void setPrice (double price)
	{
		this.price=price;
	}
	public void setAvailableQuantity (int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	
	//getter Methods
	public String getIsbn ()
	{
		return this.isbn;
	}
	public String getBookTitle ()
	{
		return this.bookTitle;
	}
	public String getAuthorName ()
	{
		return this.authorName;
	}
	public double getPrice ()
	{
		return this.price;
	}
	public int getAvailableQuantity ()
	{
		return this.availableQuantity;
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
	
	public static void showNo()
	{
		System.out.println(" Book No: "+no);
	}
	
	public void showDetails()
	{
		System.out.println("\nBook ISBN Number : " + this.isbn);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Writer's Name: " + this.authorName);
		System.out.println("Book Price: " + this.price);
		System.out.println("Total in Stock: " + this.availableQuantity);
	}
	
	
}











