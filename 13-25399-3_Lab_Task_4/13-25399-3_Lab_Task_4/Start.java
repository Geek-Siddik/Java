import java.util.Scanner;
public class Start
{
	public static void main (String[] args)
	{
		Book[] b1=new Book [5];
		Scanner bin=new Scanner (System.in);
		for(int i=0;i<b1.length;i++)
		{
			b1[i]=new Book();
			
			System.out.println("ISBN NUMBER: ");
			String isbn=bin.next();
			b1[i].setIsbn(isbn);
			
			System.out.println("BOOK TITLE: ");
			String bookTitle=bin.next();
			b1[i].setBookTitle(bookTitle);
			
			System.out.println("AUTHOR NAME: ");
			String authorName=bin.next();
			b1[i].setAuthorName(authorName);
			
			System.out.println("BOOK PRICE: ");
			double price=bin.nextDouble();
			b1[i].setPrice(price);
			
			System.out.println("AVAILABLE QUANTITY: ");
			int availableQuantity=bin.nextInt();
			b1[i].setAvailableQuantity(availableQuantity);
			
		}
		for (int i=0;i<b1.length;i++)
		{
			b1[i].showDetails();
		}
			Book.showNo();
	}
}