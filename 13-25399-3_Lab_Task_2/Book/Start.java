//This is the main method of Book Class

public class Start

{
	public static void main (String[] args)
	{
		Book b1=new Book("ABC12345","Java","Kawser Irom Rushee",1500.50,20);
		b1.showDetails ();
		b1.addQuantity(1);
		b1.sellQuantity(6);
		
		Book b2=new Book("KJHG1654","Introduction to Database","Rezwan Ahmed",1200.50,100);
		b2.showDetails ();
		b2.addQuantity(100);
		b2.sellQuantity(50);
	}
}