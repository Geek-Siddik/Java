public class BookShop
{
	private String name;
	private TextBook textBooks[]=new TextBook[100];
	private StoryBook storyBooks[]=new StoryBook[100];
	private int totalCount1;
	private int totalCount2;
	private int i;
	
	public BookShop()
	{
		System.out.println("\nDefault Constructor of BookShop");
	}
	
	public BookShop(String name)
	{
		this.name=name;
		System.out.println("\nParameterized Constructor of BookShop");
	}
	
	//set method
	public void setName (String name)
	{
		this.name=name;
	}

	//get method
	public String getName()
	{
		return name;
	}
	
	//boolean insert, remove & search method for TextBook
	public boolean insertTextBook(TextBook tb)
	{
		boolean count=false;
		for(int i=0 ;i<100;i++)
		{
			if(totalCount1<100)
			{
				count=true;
				textBooks[totalCount1]=tb;
				totalCount1++;
				break;
			}
		}
		
		if(count == true)
		{
			System.out.println("TextBook Added: "+tb.getIsbn());
		}
	
        else 
		{
			System.out.println("TextBook can not be added");
		}
		
		return count;
		
	}
	
	public boolean removeTextBook(TextBook tb)
	{
		boolean count=false;
		for(int i=0 ;i<totalCount1;i++)
		{
			if(textBooks[i]==tb)
			{
				count=true;
				textBooks[i]=textBooks[--totalCount1];
				break;
			}
		}
		if(count == true)
		{
			System.out.println("TextBook Removed: "+tb.getIsbn());
		}
        else 
		{
			System.out.println("TextBook can not be removed");
		}
		return count;
	}
	
	public TextBook searchTextBook(String isbn)
	{
		TextBook flag = null;
		for(int i=0;i<totalCount1;i++)
		{
			if(textBooks[i].getIsbn()==isbn)
			{
				flag= textBooks[i];
				break;
			}
		}
		if(flag!=null)
		{
			System.out.println("TextBook Found :"+isbn);
		}
		else
		{
			System.out.println("TextBook Not found");
		}
		return flag;
	}
	
	public void showAllTextBooks()
	{
		for(i=0;i<totalCount1;i++)
		{
		System.out.println("\nISBN of TB: "+textBooks[i].getIsbn());
		System.out.println("Title of TB: " +textBooks[i].getBookTitle());
		System.out.println("Author Name of TB: " +textBooks[i].getAuthorName());
		System.out.println("Price of TB: "+textBooks[i].getPrice());
		System.out.println("Available Quantity of TB: "+textBooks[i].getAvailableQuantity());
		System.out.println("Standard of TB: "+textBooks[i].getStandard());
		}
	}
	
	//boolean insert, remove & search method for StoryBook
	public boolean insertStoryBook(StoryBook sb)
	{
		boolean count=false;
		for(int i=0 ;i<100;i++)
		{
			if(totalCount2<100)
			{
				count=true;
				storyBooks[totalCount2]=sb;
				totalCount2++;
				break;
			}
		}
		if(count == true)
		{
			System.out.println("StoryBook Added: "+sb.getIsbn());
		}
        else 
		{
			System.out.println("StoryBook can not be added");
		}
		return count;
	}
	
	public boolean removeStoryBook(StoryBook sb)
	{
		boolean count=false;
		for(int i=0 ;i<totalCount2;i++)
		{
			if(storyBooks[i]==sb)
			{
				count=true;
				storyBooks[i]=storyBooks[--totalCount2];
				break;
			}
		}
		if(count == true)
		{
			System.out.println("StoryBook Removed: "+sb.getIsbn());
		}
        else 
		{
			System.out.println("StoryBook can not be Removed");
		}
		return count;
	}
	
	public StoryBook searchStoryBook(String isbn)
	{
		StoryBook flag = null;
		for(int i=0;i<totalCount2;i++)
		{
			if(storyBooks[i].getIsbn()==isbn)
			{
				flag= storyBooks[i];
				break;
			}
		}
		if(flag!=null)
		{
			System.out.println("StoryBook Found: "+isbn);
		}
		else
		{
			System.out.println("StoryBook not Found");
		}
		return flag;
	}
	
	
	public void showAllStoryBooks()
	{
		for(i=0;i<totalCount2;i++)
		{
		System.out.println("\nISBN of SB: "+storyBooks[i].getIsbn());
		System.out.println("Title of SB: " +storyBooks[i].getBookTitle());
		System.out.println("Author Name of SB: " +storyBooks[i].getAuthorName());
		System.out.println("Price of SB: "+storyBooks[i].getPrice());
		System.out.println("Available Quantity of SB: "+storyBooks[i].getAvailableQuantity());
		System.out.println("Category of SB: "+storyBooks[i].getCategory());
		
		}
	}
	
	public void bookShopDetails()
	{	
		System.out.println("\nBook Shop Name: "+this.name);
	}

}