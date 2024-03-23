package coms.TravelApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import coms.TravelApp.models.BookCab;


@Service
public class BookCabServiceImpl implements BookCabService{
	
	@Autowired
	JdbcTemplate jdbctemp;

	@Override
	public String AddBookCab(BookCab bcab) {
		String sqlcmd="INSERT INTO BookCab (Date, FromLocation, ToLocation, VechNo, CustomerName, Phone) VALUES(?,?,?,?,?,?)";
		int res=jdbctemp.update(sqlcmd, new Object[] { bcab.getDate(), bcab.getFromLoc(), bcab.getToLoc(), bcab.getVechNo(), bcab.getCustomerName(), bcab.getPhone()});
		if(res>=1)
			return "Success";
		return "Err";
		
	}

	@Override
	public List<BookCab> BookCabAll() {
		String sqlcmd="select * from BookCab";
		List<BookCab> bcaball=jdbctemp.query(sqlcmd, new BeanPropertyRowMapper(BookCab.class));
		return bcaball;
	}

	@Override
	public BookCab SearchBookCab(int BookId) {
		String sqlcmd="Select * from BookCab where BookId=?";
		BookCab bcab=null;
		try {
			bcab=(BookCab)jdbctemp.queryForObject(sqlcmd, new Object[] {BookId}, new BeanPropertyRowMapper(BookCab.class));
			
		}catch(Exception e)
		{
			bcab=null;
		}
		
		return bcab;
	}
	
	
	

}
