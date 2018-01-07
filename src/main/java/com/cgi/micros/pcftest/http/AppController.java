package com.cgi.micros.pcftest.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	public AppController() {
		
	}

	@RequestMapping("/kill")
	public void kill() {
		System.exit(1);
	}

	@RequestMapping("/app-details")
	public String info()  {
		return "This app is a pcf REST app. \n";

	}
	
	@RequestMapping("/user")
    public User greeting(@RequestParam(value="vorName", defaultValue="World") String vorName,
    							@RequestParam(value="nachName", defaultValue="World") String nachName,
    								@RequestParam(value="telfonnummer", defaultValue="World") String telefonnummer,
    									@RequestParam(value="personalnummer", defaultValue="World") String personalnummer) {
        return new User(vorName, nachName, telefonnummer, personalnummer);
    }
	
}
