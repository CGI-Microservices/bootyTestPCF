package com.cgi.micros.pcftest.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Value("${Vorname:#{null}}")
	private String vorName;

	@Value("${Nachname:#{null}}")
	private String nachName;

	@Value("${Telefonnummer:#{null}}")
	private String Telfonnummer;

	@Value("${Personalnummer:#{null}}")
	private String personalnummer;

	@Autowired
	public AppController() {
		
	}

	@RequestMapping("/kill")
	public void kill() {
		System.exit(1);
	}

	@RequestMapping("/app-details")
	public String info()  {
		return "This app is a pcf REST app";

	}
}
