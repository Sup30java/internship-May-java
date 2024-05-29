package com.task2;

public class Librarian extends Member {

	public Librarian(int memberId, String name) {
		super(memberId, name, Integer.MAX_VALUE);

	}

	public void addBook(Library library, Book book) {
		library.getBooks().add(book);
	}

	public void removeBook(Library library, Book book) {
		library.getBooks().remove(book);
	}

}
