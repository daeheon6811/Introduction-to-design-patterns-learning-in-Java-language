package Iterator;

import java.util.Iterator;

public class BookShelf implements Aggregate{
	private Book[] books;
	private int last = 0;
	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}
	public Book getBookAt(int index) {
		return books[index];
	}
	public int getLength() {
		return last;
	}
	public void appendBook(Book book) {
		this.books[last]= book;
		last++;
	}
	
	public MyIterator iterator() {
		return new BookShelfIterator(this);
	}


}
