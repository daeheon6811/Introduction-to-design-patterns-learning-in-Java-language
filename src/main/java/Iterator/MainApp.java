package Iterator;

import java.util.Iterator;

public class MainApp {
	public static void main(String[] args) {
		
		BookShelf bookShelf = new BookShelf(5);
		bookShelf.appendBook(new Book("1~~"));
		bookShelf.appendBook(new Book("2~~"));
		bookShelf.appendBook(new Book("3~~"));
		bookShelf.appendBook(new Book("4~~"));
		bookShelf.appendBook(new Book("5~~"));
		
		Iterator<Object> it = bookShelf.iterator();
		
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
	}

}
