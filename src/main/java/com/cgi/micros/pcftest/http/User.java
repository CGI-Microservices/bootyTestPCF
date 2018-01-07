package com.cgi.micros.pcftest.http;

public class User {

	private String vorName;
	private String nachName;

	private String telefonnummer;
	private String personalnummer;

	public User(String vorName, String nachName, String telefonnummer, String personalnummer) {
		this.vorName = vorName;
		this.nachName = nachName;
		this.telefonnummer = telefonnummer;
		this.personalnummer = personalnummer;
	}

	public String getVorName() {
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public String getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public String getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(String personalnummer) {
		this.personalnummer = personalnummer;
	}
	
	
	
}
