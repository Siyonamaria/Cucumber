package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	
	
	 WebDriver driver= new ChromeDriver();



@Given("Launch the browser")
public void launch_the_browser() {
	
	System.out.println("im inside the the step");
   
}

@And("user open the url {string}")
public void user_open_the_url(String string) {
	
	driver.get("https://www.instagram.com");
    }

@When("user enters username and password")
public void user_enters_username_and_password() {
	
	
    
}

@Then("click on login button")
public void click_on_login_button() {
    
}




}
