public class Book

{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private String category;
	public static double discountRate;
	
	// Making default constructor for Book class
	public Book () 
	{
		
	}
	
	// Making constructor for Book class and parameterizing them
	public Book(String isbn, String bookTitle, String authorName, 
				double price, int availableQuantity, String category)
	{
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price*discountRate;
		this.availableQuantity =  availableQuantity;
		this.category = category;
	}
	
	//Static Variable for Discount Rate
	public static void setDiscountRate (double discountRate)
	{
		Book.discountRate=discountRate;
	}
	public static double getDiscountRate ()
	{
		return discountRate;
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
	public void setCategory (String category)
	{
		this.category=category;
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
	public String getCategory ()
	{
		return this.category;
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
		if (this.availableQuantity>0 && amount<=availableQuantity)
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
		System.out.println("\nBook ISBN Number : " + this.isbn);
		System.out.println("Book Title: " + this.bookTitle);
		System.out.println("Writer's Name: " + this.authorName);
		System.out.println("Book Price: " + this.price);
		System.out.println("Total in Stock: " + this.availableQuantity);
		System.out.println("Book Category: " + this.category);
		System.out.println("Discount Rate: (" + this.discountRate+"*100)%");
	}
	
	
}











