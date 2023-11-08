package com.mindgate.main.domain;

import java.util.Date;

public class TravelRequest {
	private int requestId;
	private int employeeId;
	private String travelMedium;
	private String travelStartDate;
	private String travelEndDate;
	private String travelpurpose;
	private String PMAuthorisation;
	private String TMAuthorisation;
	private String DirectorAuthorisation;
	private int documentId;
	
	public TravelRequest() {
		// TODO Auto-generated constructor stub
	}
	

	public TravelRequest(int requestId, int employeeId, String travelMedium, String travelStartDate, String travelEndDate,
			String travelpurpose, String pMAuthorisation, String tMAuthorisation, String directorAuthorisation,
			int documentId) {
		super();
		this.requestId = requestId;
		this.employeeId = employeeId;
		this.travelMedium = travelMedium;
		this.travelStartDate = travelStartDate;
		this.travelEndDate = travelEndDate;
		this.travelpurpose = travelpurpose;
		PMAuthorisation = pMAuthorisation;
		TMAuthorisation = tMAuthorisation;
		DirectorAuthorisation = directorAuthorisation;
		this.documentId = documentId;
	}


	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getTravelMedium() {
		return travelMedium;
	}

	public void setTravelMedium(String travelMedium) {
		this.travelMedium = travelMedium;
	}

	public String getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	public String getTravelEndDate() {
		return travelEndDate;
	}

	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	public String getTravelpurpose() {
		return travelpurpose;
	}

	public void setTravelpurpose(String travelpurpose) {
		this.travelpurpose = travelpurpose;
	}

	public String getPMAuthorisation() {
		return PMAuthorisation;
	}

	public void setPMAuthorisation(String pMAuthorisation) {
		PMAuthorisation = pMAuthorisation;
	}

	public String getTMAuthorisation() {
		return TMAuthorisation;
	}

	public void setTMAuthorisation(String tMAuthorisation) {
		TMAuthorisation = tMAuthorisation;
	}

	public String getDirectorAuthorisation() {
		return DirectorAuthorisation;
	}

	public void setDirectorAuthorisation(String directorAuthorisation) {
		DirectorAuthorisation = directorAuthorisation;
	}

	public int getDocumentId() {
		return documentId;
	}

	public void setDocumentId(int documentId) {
		this.documentId = documentId;
	}

	@Override
	public String toString() {
		return "TravelRequest [requestId=" + requestId + ", employeeId=" + employeeId + ", travelMedium=" + travelMedium
				+ ", travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate + ", travelpurpose="
				+ travelpurpose + ", PMAuthorisation=" + PMAuthorisation + ", TMAuthorisation=" + TMAuthorisation
				+ ", DirectorAuthorisation=" + DirectorAuthorisation + ", documentId=" + documentId + "]";
	}
	
	
	
	
	
}
