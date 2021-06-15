package core.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bag")
public class Bag {
	
	private Book book;
	public Bag() {
		
	}
	
	@Autowired
	public Book getBook() {
		return book;
	}
	
	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}

//	@Override
	public String toString() {
		return "Bag [book=" + book + "]";
	}
	
}
