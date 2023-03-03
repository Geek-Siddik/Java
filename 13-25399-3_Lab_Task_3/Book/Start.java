//This is the main method of Book Class & StoryBook Class

public class Start

{
	public static void main (String[] args)
	{
		Book.setDiscountRate (0.50);
		StoryBook.setDiscountRate (0.50);
		
		Book b1=new Book("ABC12345","Java","Kawser Irom Rushee",1500.50,20,"Academic Book");
		b1.showDetails();
		b1.addQuantity(1);
		b1.sellQuantity(6);
		
		
		Book b2=new Book("KJHG1654","Introduction to Database","Rezwan Ahmed",1200.50,100,"Academic Book");
		b2.showDetails ();
		b2.addQuantity(100);
		b2.sellQuantity(50);
		
		
		StoryBook sb1=new StoryBook("2453465234","Harry Potter","J K R",5000.50,110,"Story Book");
		sb1.showDetails ();
		sb1.addQuantity(200);
		sb1.sellQuantity(100);
		
		
		StoryBook sb2=new StoryBook("KA456","Dushtu Cheler Dol","Zafar Iqbal",300.50,50,"Story Book");
		sb2.showDetails ();
		sb2.addQuantity(80);
		sb2.sellQuantity(30);
		
	}
}