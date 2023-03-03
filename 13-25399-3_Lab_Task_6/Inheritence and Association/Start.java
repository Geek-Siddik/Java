public class Start
{
	public static void main(String args[])
	{
		System.out.println("<<<<<<<<<<<Text Book>>>>>>>>>>>>>>>>>");
	
		TextBook tb1 = new TextBook();
		tb1.setIsbn("1111");
		tb1.setBookTitle("OOP1");
		tb1.setAuthorName("ABU");
		tb1.setPrice(2200);
		tb1.setAvailableQuantity(50);
		tb1.setStandard(100);
	
		TextBook tb2 = new TextBook();
		tb2.setIsbn("2222");
		tb2.setBookTitle("Java");
		tb2.setAuthorName("BAKAR");
		tb2.setPrice(2000);
		tb2.setAvailableQuantity(80);
		tb2.setStandard(99);
	
		TextBook tb3 = new TextBook();
		tb3.setIsbn("3333");
		tb3.setBookTitle("Ecplipes");
		tb3.setAuthorName("ABABAB");
		tb3.setPrice(2500);
		tb3.setAvailableQuantity(50);
		tb3.setStandard(98);
	
		TextBook tb4 = new TextBook();
		tb4.setIsbn("4444");
		tb4.setBookTitle("Oracle");
		tb4.setAuthorName("ABS");
		tb4.setPrice(4000);
		tb4.setAvailableQuantity(40);
		tb4.setStandard(97);
	
		TextBook tb5 = new TextBook();
		tb5.setIsbn("5555");
		tb5.setBookTitle("JDK");
		tb5.setAuthorName("AB");
		tb5.setPrice(500);
		tb5.setAvailableQuantity(100);
		tb5.setStandard(96);
		
		System.out.println("<<<<<<<<<<Story Book>>>>>>>>>>>>>");

		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("6666");
		sb1.setBookTitle("StoryOne");
		sb1.setAuthorName("AAAA");
		sb1.setPrice(1000);
		sb1.setAvailableQuantity(100);
		sb1.setCategory("SB");
	
		StoryBook sb2 = new StoryBook();
		sb2.setIsbn("7777");
		sb2.setBookTitle("StoryTwo");
		sb2.setAuthorName("BBBB");
		sb2.setPrice(1500);
		sb2.setAvailableQuantity(50);
		sb2.setCategory("SB");
	
		StoryBook sb3 = new StoryBook();
		sb3.setIsbn("8888");
		sb3.setBookTitle("StoryThree");
		sb3.setAuthorName("CCCC");
		sb3.setPrice(500);
		sb3.setAvailableQuantity(60);
		sb3.setCategory("SB");
	
		StoryBook sb4 = new StoryBook();
		sb4.setIsbn("9999");
		sb4.setBookTitle("StoryFour");
		sb4.setAuthorName("DDDD");
		sb4.setPrice(1500);
		sb4.setAvailableQuantity(70);
		sb4.setCategory("Book");
	
		StoryBook sb5 = new StoryBook();
		sb5.setIsbn("1010");
		sb5.setBookTitle("StoryFive");
		sb5.setAuthorName("EEEE");
		sb5.setPrice(1000);
		sb5.setAvailableQuantity(80);
		sb5.setCategory("Book");

		BookShop b1=new BookShop();
		b1.setName("Aiub Building C");
		b1.bookShopDetails();
		System.out.println("---------------END----------------");

		TextBook textBooks[]=new TextBook[5];
		textBooks[0]=tb1;
		textBooks[1]=tb2;
		textBooks[2]=tb3;
		textBooks[3]=tb4;
		textBooks[4]=tb5;
		for(int i=0; i<textBooks.length; i++)
		{
			textBooks[i].showDetails();
			System.out.println("-------END------");
		}

		StoryBook storyBooks[]=new StoryBook [5];
		storyBooks[0]=sb1;
		storyBooks[1]=sb2;
		storyBooks[2]=sb3;
		storyBooks[3]=sb4;
		storyBooks[4]=sb5;
		for(int i=0; i< storyBooks.length; i++)
		{
			storyBooks[i].showDetails();
			System.out.println("--------END--------");
		}
	
		BookShop bookShops[]=new BookShop [1];
		bookShops[0] = b1;
		for(int i=0; i<bookShops.length; i++)
		{
			bookShops[i].bookShopDetails();
			System.out.println("-------END-------");
		}
		
		BookShop b2=new BookShop("Aiub BookStore Banani Branch");
		
		StoryBook obj1= new StoryBook("1234566","Eita boi er nam","Boi er lekhok",2000.50,100,"Boi");
		obj1.showDetails();
		
		StoryBook obj2= new StoryBook();
		obj2.setIsbn("2345677");
		obj2.setBookTitle("SHAW");
		obj2.setAuthorName("Nuhash");
		obj2.setPrice(800);
		obj2.setAvailableQuantity(555);
		obj2.setCategory("GolperBoi");
		obj2.showDetails();
		//insertStoryBook Demonstration
		b1.insertStoryBook(obj1);
		b1.insertStoryBook(obj2);
		//removeStoryBook Demonstration
		b1.showAllStoryBooks();
		b1.removeStoryBook(obj2);
		//Show All Story Book After Deletion Demonstration
		b1.showAllStoryBooks();
		//Search Book Demonstration
		b1.searchStoryBook("1234566");
		
		
		
	}
}