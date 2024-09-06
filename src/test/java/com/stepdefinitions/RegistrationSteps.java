package com.stepdefinitions;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class RegistrationSteps {
	
	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
	    System.out.println("Usre is on Registration page");
	}

	@Given("User enters the following details as list")
	public void user_enters_the_following_details_as_list(DataTable dataTable) {
		List<List<String>> asLists = dataTable.asLists();
		
		for (List<String> list : asLists) {
			System.out.println(list);
		}
	}
	
	@Given("User enters the following details as maps")
	public void user_enters_the_following_details_as_map(DataTable dataTable) throws HeadlessException, AWTException, IOException {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		for (Map<String, String> map : asMaps) {
			System.out.println(map.get("Name"));
			System.out.println(map.get("phnNum"));
			System.out.println(map.get("mailId"));
			System.out.println(map.get("Id"));
			System.out.println(map.get("City"));
		}
		BufferedImage screenCapture = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(screenCapture, "img/png", new File(""));
	}

	@When("User clicks on OK button")
	public void user_clicks_on_ok_button() {
	    System.out.println("Usre clicks ok button");
	}

	@Then("The registration should be successful")
	public void the_registration_should_be_successful() {
	    System.out.println("Registration is successful");
	}

}
