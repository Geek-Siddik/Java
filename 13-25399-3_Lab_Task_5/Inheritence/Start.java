public class Start
{
	public static void main(String args[])
	{
		System.out.println("<<<<<<<<<<Story Book>>>>>>>>>>>>>");

		StoryBook sb1 = new StoryBook();
		sb1.setIsbn("1111");
		sb1.setBookTitle("StoryOne");
		sb1.setAuthorName("AAAA");
		sb1.setPrice(1000);
		sb1.setAvailableQuantity(100);
		sb1.setCategory("SB");
		sb1.showDetails();
		System.out.println("Category :" +sb1.getCategory());
	
		StoryBook sb2 = new StoryBook();
		sb2.setIsbn("2222");
		sb2.setBookTitle("StoryTwo");
		sb2.setAuthorName("BBBB");
		sb2.setPrice(1500);
		sb2.setAvailableQuantity(50);
		sb2.setCategory("SB");
		sb2.showDetails();
		System.out.println("Category :" +sb2.getCategory());
	
		System.out.println("<<<<<<<<<<<Text Book>>>>>>>>>>>>>>>>>");
	
		TextBook tb1 = new TextBook();
		tb1.setIsbn("6666");
		tb1.setBookTitle("OOP1");
		tb1.setAuthorName("ABU");
		tb1.setPrice(2200);
		tb1.setAvailableQuantity(50);
		tb1.setStandard(100);
		tb1.showDetails();
		System.out.println("Standard :" +tb1.getStandard());
	
		TextBook tb2 = new TextBook();
		tb2.setIsbn("7777");
		tb2.setBookTitle("Java");
		tb2.setAuthorName("BAKAR");
		tb2.setPrice(2000);
		tb2.setAvailableQuantity(80);
		tb2.setStandard(99);
		tb2.showDetails();
		System.out.println("Standart :" +tb2.getStandard());
	}
}