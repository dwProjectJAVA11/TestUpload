package DB2;

public class BookVO {
	/*	BOOKTBL 필드와 동일하게 만든다.
		한꺼번에 넘겨주기 위해서 봉투에 담는다고 생각해!
	 */
	
	private int book_id;
	private String title;
	private String publisher;
	private String year;
	private int price;
	
	public int getBook_id()
	{
		return book_id;
	}
	
	public void setBook_id(int book_id)
	{
		this.book_id = book_id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	
	public String getYear()
	{
		return year;
	}
	
	public void setYear(String year)
	{
		this.year = year;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "BookVO [book_id=" + book_id + ", title=" + title + ", publisher=" + publisher + ", year=" + year
				+ ", price=" + price + "]";
	}
	
}
