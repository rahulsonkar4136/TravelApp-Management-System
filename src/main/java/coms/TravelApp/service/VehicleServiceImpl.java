package coms.TravelApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.TravelApp.models.Vehicles;

@Service
public class VehicleServiceImpl implements VehicleService  {
	
	@Autowired
	JdbcTemplate jdbctemp;
	
	@Override
	public String AddVehicle(Vehicles vch) {
		String sqlcmd="INSERT INTO Vehicles (VechName, VechNo, OwnerName, Seats, Phone) VALUES(?,?,?,?,?)";
		int res=jdbctemp.update(sqlcmd, new Object[] { vch.getVechName(), vch.getVechNo(), vch.getOwnerName(), vch.getSeats(), vch.getPhone()});
		if(res>=1)
			return "Success";
		return "Err";
		
	}

	@Override
	public List<Vehicles> VehicleAll() {
		String sqlcmd="select * from Vechicles";
		List<Vehicles> vchall=jdbctemp.query(sqlcmd, new BeanPropertyRowMapper(Vehicles.class));
		return vchall;
	}

	@Override
	public Vehicles SearchVehicle(int Vid) {
		String sqlcmd="Select * from Vehicles where Vid=?";
		Vehicles vch=null;
		try {
			vch=(Vehicles)jdbctemp.queryForObject(sqlcmd, new Object[] {Vid}, new BeanPropertyRowMapper(Vehicles.class));
			
		}catch(Exception e)
		{
			vch=null;
		}
		
		return vch;
	}

}
