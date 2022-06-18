package model;


public class Book {
	
	private long id;
	private String bookName;
	private String bookAuthor;
	private String dayReleased;
	private int pageNumber;
	private String category;
	private String publisher;
	private String language;
	private String itemWeight;
	private String dimensions;
	private long price;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getDayReleased() {
		return dayReleased;
	}
	public void setDayReleased(String dayReleased) {
		this.dayReleased = dayReleased;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getDimensions() {
		return dimensions;
	}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Book(long id, String bookName, String bookAuthor, String dayReleased, int pageNumber, String category,
			String publisher, String language, String itemWeight, String dimensions, long price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.dayReleased = dayReleased;
		this.pageNumber = pageNumber;
		this.category = category;
		this.publisher = publisher;
		this.language = language;
		this.itemWeight = itemWeight;
		this.dimensions = dimensions;
		this.price = price;
	}
	public Book() {
		super();
	}
	
	
}
