package coms.TravelApp.service;

import java.util.List;

import coms.TravelApp.models.CabFares;

public interface CabFareService {
	public String AddFare(CabFares cabf);
	public List<CabFares> CabFaresAll();
	public CabFares SearchCabFares(int Id);

}
