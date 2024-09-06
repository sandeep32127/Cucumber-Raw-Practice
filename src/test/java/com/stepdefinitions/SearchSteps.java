package com.stepdefinitions;

import io.cucumber.java.en.*;

public class SearchSteps {
	
	@Given("User is on the Amazon home page")
	public void user_is_on_the_amazon_home_page() {
	    System.out.println("User is on home page");
	}

	@Given("Uer enters {string} in Amazon Search Box")
	public void uer_enters_in_amazon_search_box(String product) {
	    System.out.println("User enters the : "+ product);
	}

	@Then("^User gets displayed with (.*) having INR (\\d+)$")
	public void user_gets_displayed_with_having_inr(String product, Integer price) {
	    System.out.println("The product "+product + " gets displayed with "+ price );
	}

}
