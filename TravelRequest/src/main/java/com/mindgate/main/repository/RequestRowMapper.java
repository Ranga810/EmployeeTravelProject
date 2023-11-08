package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.TravelRequest;

public class RequestRowMapper implements RowMapper<TravelRequest> {

	@Override
	public TravelRequest mapRow(ResultSet rs, int rowNum) throws SQLException {
		int requestId =rs.getInt("travel_request_id");;
	    int employeeId=rs.getInt("employee_id");;
		 String travelMedium=rs.getString("travel_medium");
		 String travelStartDate=rs.getString("travel_start_date");
		 String travelEndDate=rs.getString("travel_end_date");
		 String travelpurpose=rs.getString("travel_purpose");
		 String PMAuthorisation=rs.getString("pm_authorization_status");
		 String TMAuthorisation=rs.getString("tm_authorization_status");
		 String DirectorAuthorisation=rs.getString("d_authorization_status");
		 int documentId=rs.getInt("document_id");
		 
		 TravelRequest travelRequest = new TravelRequest(requestId, employeeId, travelMedium, travelStartDate, travelEndDate, travelpurpose, PMAuthorisation, TMAuthorisation, DirectorAuthorisation, documentId);
		 return travelRequest;
	}

}
