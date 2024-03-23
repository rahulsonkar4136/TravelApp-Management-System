package coms.TravelApp.service;

import coms.TravelApp.models.Vehicles;
import java.util.*;

public interface VehicleService {
	
	public String AddVehicle(Vehicles vch);
	public List<Vehicles> VehicleAll();
	public Vehicles SearchVehicle(int Vid);
	

}
