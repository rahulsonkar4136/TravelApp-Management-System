package coms.TravelApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.TravelApp.models.CabFares;

@Service
public class CabFareServiceImpl implements CabFareService{

	@Autowired
	JdbcTemplate jdbctemp;
	
	@Override
	public String AddFare(CabFares cabf) {
		String sqlcmd="Insert into CabFares (FromLocation, ToLocation, Fare) values (?,?,?)";
		int res=jdbctemp.update(sqlcmd, new Object[] {cabf.getFromLocation(), cabf.getToLocation(), cabf.getFare() });
		if(res>=1)
			return "Success";
		return "Err";
	}

	@Override
	public List<CabFares> CabFaresAll() {
		String sqlcmd="select * from CabFares";
		List<CabFares> cabfall=jdbctemp.query(sqlcmd, new BeanPropertyRowMapper(CabFares.class));
		return cabfall;
		
	}

	@Override
	public CabFares SearchCabFares(int Id) {
		String sqlcmd="Select * from CabFares where Id=?";
		CabFares cabf=null;
		try {
			cabf=(CabFares)jdbctemp.queryForObject(sqlcmd, new Object[] {Id}, new BeanPropertyRowMapper(CabFares.class));
			
		}catch(Exception e)
		{
			cabf=null;
		}
		
		return cabf;
		
	}
	

}
