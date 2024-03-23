package coms.TravelApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.TravelApp.models.CabFares;
import coms.TravelApp.service.CabFareService;

@Controller
public class CabFareController {
	@Autowired
	CabFareService cabfs;
	
	@GetMapping("/newcabf")
	public String NewCabF(Model m)
	{
		m.addAttribute("cabf", new CabFares());
		return "NewCabF";
		
	}
	@PostMapping("newcabfinfo")
	public String NewVch(@ModelAttribute  CabFares cabf, Model m ) {
		String res=cabfs.AddFare(cabf);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Fare is Added");
			m.addAttribute("vch", new CabFares());
		}	
		return "NewCabF";
	}
	
	@GetMapping("cabfall")
	public String ViewFareAll(Model m)
	{
		List<CabFares> cabflist=cabfs.CabFaresAll();
		m.addAttribute("cabflist" ,cabflist);
		return "ViewAllCabf";
			
	}
	

}
