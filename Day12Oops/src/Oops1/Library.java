package Oops1;

public class Library {
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Library(Book book) {
		super();
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [book=" + book + "]";
	}
	

}
