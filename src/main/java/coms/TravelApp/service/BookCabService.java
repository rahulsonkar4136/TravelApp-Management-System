package coms.TravelApp.service;

import java.util.List;

import coms.TravelApp.models.BookCab;


public interface BookCabService {
	public String AddBookCab(BookCab bcab);
	public List<BookCab> BookCabAll();
	public BookCab SearchBookCab(int BookId);

}
