package OOPendDay6;

import java.util.ArrayList;

class Book{
	public String title;
	public String author;
	
	public static ArrayList<Book> bookcollection = new ArrayList<Book>();
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	
	public static void add_book(Book book) {
		bookcollection.add(book);
	}
	public static ArrayList<Book> get_book() {
		return bookcollection;
	}
	
	  @Override
	    public String toString() {
	        return "Book Title: " + title + ", Author: " + author;
	    }
	
}

public class BookMain7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj = new Book("rich dad poor dad", "rebort");
		Book obj1 = new Book("man in a jungle", "ironman");
		Book.add_book(obj);
		Book.add_book(obj1);
		ArrayList<Book> getbook = Book.get_book();
		System.out.println(getbook);
//		for (Book item : getbook) {
//			System.out.println(item);
//		}
		

	}

}
