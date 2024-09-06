package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SearchHooks {

	@Before("@Smoke")
	public void setBrowser() {
		System.out.println("The user sets the browser");
		//System.out.println(sc.getName());
	}


	/*
	 * @Before(order = 1) public void setURL() {
	 * System.out.println("The user sets the URL"); }
	 */


	@After("@Smoke")
	public void logOut() {
		System.out.println("The user logs out from APP");
	}

	/*
	 * @After(order = 0) public void closeBrowser(Scenario sc) {
	 * System.out.println("The user closes the browsers");
	 * System.out.println(sc.getId()); }
	 */
	
	@BeforeStep
	public void screenshot() {
		System.out.println("The user takes screenshot");
	}
	
	@AfterStep
	public void refresh() {
		System.out.println("The user refreshes the screen");
	}

}
