package coms.TravelApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import coms.TravelApp.models.Vehicles;
import coms.TravelApp.service.VehicleService;

@Controller
public class VehicleController {
	@Autowired
	VehicleService vs;
	
	@GetMapping("/newvch")
	public String NewVch(Model m)
	{
		m.addAttribute("vch", new Vehicles());
		return "NewVch.jsp";
		
	}
	
	@PostMapping("newvchinfo")
	public String NewVch(@ModelAttribute  Vehicles vch, Model m ) {
		String res=vs.AddVehicle(vch);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Vehicle is Added");
			m.addAttribute("vch", new Vehicles());
		}	
		return "NewVch";
	}
	@GetMapping("vchall")
	public String ViewVehicleAll(Model m)
	{
		List<Vehicles> vchlist=vs.VehicleAll();
		m.addAttribute("vchlist" ,vchlist);
		
		return "ViewAllVch";
	}
	

}
