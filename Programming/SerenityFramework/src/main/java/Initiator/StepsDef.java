package Initiator;

import PageModel.LocatorsInfo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDef {

	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		LocatorsInfo locate = new LocatorsInfo();
		locate.getHome();
	   
	}
//
//	@When("^User Navigate to LogIn Page$")
//	public void user_Navigate_to_LogIn_Page() throws Throwable {
//	   
//	}
//
//	@When("^User enters UserName and Password$")
//	public void user_enters_UserName_and_Password() throws Throwable {
//	   
//	}
//	@Then("^Message displayed Login Successfully$")
//	public void message_displayed_Login_Successfully() throws Throwable {
//	   
//	}
//
//	@When("^User LogOut from the Application$")
//	public void user_LogOut_from_the_Application() throws Throwable {
//	  
//	}
//
//	@Then("^Message displayed LogOut Successfully$")
//	public void message_displayed_LogOut_Successfully() throws Throwable {
//	    
//	}

}
