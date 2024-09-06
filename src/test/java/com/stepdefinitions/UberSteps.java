package com.stepdefinitions;

import io.cucumber.java.en.*;

public class UberSteps {
	
	@Given("User launches Uber App")
	public void user_launches_uber_app() {
	    
	}

	@Given("User enters login creds")
	public void user_enters_login_creds() {
	    
	}

	@Given("User lands on home page")
	public void user_lands_on_home_page() {
	    
	}

	@Then("User selects destination")
	public void user_selects_destination() {
	    
	}

	@Then("^User selects (.*) for trip A$")
	public void user_selects_sedan_for_trip(String vehicleType) {
	    System.out.println("The user selects "+vehicleType+ " as trip mode");
	}

	@Then("User selects {string} for trip B")
	public void user_selects_suv_for_trip(String vehicleType) {
		System.out.println("The user selects "+vehicleType+ " as trip mode");
	}

	@Then("^User selects (.*) for trip C$")
	public void user_selects_hatchback_for_trip(String vehicleType) {
		System.out.println("The user selects "+vehicleType+ " as trip mode");
	}

}
