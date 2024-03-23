package coms.TravelApp.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.TravelApp.models.BookCab;
import coms.TravelApp.service.BookCabService;


@Controller
public class BookCabController {
	@Autowired
	BookCabService bcabs;
	
	@GetMapping("/newbcab")
	public String NewBcab(Model m)
	{
		m.addAttribute("bcab", new BookCab());
		return "NewBookCab";
		
	}
	@PostMapping("newbcabinfo")
	public String NewBcab(@ModelAttribute  BookCab bcab, Model m ) {
		String res=bcabs.AddBookCab(bcab);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Cab is Booked");
			m.addAttribute("bcab", new BookCab());
		}	
		return "NewBookCab";
	}

	@GetMapping("bcaball")
	public String ViewBookAll(Model m)
	{
		List<BookCab> bcablist=bcabs.BookCabAll();
		m.addAttribute("bcablist" ,bcablist);
		
		return "ViewAllBcab";
	}
}
