package com.StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.util.List;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	@Before(order = 0)
	@Given("user in login page")
	public void user_in_login_page() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enters userName and password")
	public void user_enters_user_name_and_password() {
	assertTrue(false);
		// Write code here that turns the phrase above into concrete actions
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string + " " + string2);
	}

	/*
	 * @When("user enters userName and password") public void
	 * user_enters_user_name_and_password() { // Write code here that turns the
	 * phrase above into concrete actions }
	 */
	@When("user enters userName and password1")
	public void user_enters_user_name_and_password1(DataTable dataTable) {
		List<List<String>> list = dataTable.cells();
		System.out.println(list.get(0).get(0)+ " "+ list.get(0).get(1));
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
	}

	@When("click the login button")
	public void click_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("user enter into user dash board")
	public void user_enter_into_user_dash_board() {
		// Write code here that turns the phrase above into concrete actions
	}

}
