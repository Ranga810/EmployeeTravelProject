package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.EmployeeDetails;
import com.mindgate.main.domain.Slab;



public class EmployeeRowMapper implements RowMapper<EmployeeDetails> {

	@Override
	public EmployeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		int slabId=rs.getInt("SLAB_ID");
		String role=rs.getString("ROLE");
		String internationalTravel=rs.getString("INTERNATIONAL_TRAVEL");
		int slab_Amount=rs.getInt("SLAB_AMMOUNT");
		String internationalForex=rs.getString("INTERNATIONAL_FOREX");
		
		
		Slab slab=new Slab(slabId, role, internationalTravel, slab_Amount, internationalForex) ;
		
		
		int employeeId=rs.getInt("EMPLOYEE_ID");
		String firstName=rs.getString("FIRST_NAME");
		String lastName=rs.getString("LAST_NAME");
		String loginId=rs.getString("LOGIN_ID");
		String password=rs.getString("PASSWORD");
		String erole=rs.getString("Role");
		String email=rs.getString("EMAIL");
		long contactNo=rs.getLong("CONTACT_NUMBER");
		int managerId=rs.getInt("Manager_id");
		
		EmployeeDetails employeeDetails=new EmployeeDetails(employeeId, firstName, lastName, loginId, password, erole, email, contactNo, managerId, slab);
		return employeeDetails;
	
	}

}
