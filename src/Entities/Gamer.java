package Entities;

import java.time.LocalDate;

public class Gamer {
	private String firstName;
	private String lastNAme;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Gamer(String firstName, String lastNAme, LocalDate dateOfBirth, String nationalityId) {
		super();
		this.firstName = firstName;
		this.lastNAme = lastNAme;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastNAme() {
		return lastNAme;
	}

	public void setLastNAme(String lastNAme) {
		this.lastNAme = lastNAme;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
