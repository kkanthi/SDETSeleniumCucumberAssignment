package stepdefs;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;


import pages.*;
import utils.Browser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class OrangeHRPStep {
	LoginPage loginPage;
	WebDriver driver=Browser.chrome();
	
	
	
	
	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application() {
		//launching the browser
		//driver=Browser.chrome();
	  System.out.println("Browser Launched.");
	  //implicit wait statement
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  System.out.println("implicit wait Condition provided.");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage=new LoginPage(driver);
	}
	
	
	@Then("^Login to Application$")
	public void login_to_Application() {
	System.out.println(driver.getTitle());
	loginPage.enterUserName("Admin");
	loginPage.enterpwd("admin123");
	loginPage.clickloginbtn();
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available()  {
	   loginPage.getDashBoardisplayed();
	   System.out.println(driver.getCurrentUrl());
	}

	@When("^click on Admin menu$")
	public void click_on_Admin_menu()  {
		loginPage.settoAdminMenu();
	}

	@Given("^I am logged into Orange Application$")
	public void i_am_logged_into_Orange_Application()  {
		System.out.println(driver.getTitle());
	}

	@When("^I click on Admin Link$")
	public void i_click_on_Admin_Link() {
		loginPage.settoAdminMenu();
	}

	@Then("^Click on Job$")
	public void click_on_Job()  {
		loginPage.settoJobMenu();
	    
	}

	@Then("^validate text – Job Title$")
	public void validate_text_Job_Title() throws InterruptedException  {
		
		//loginPage.settoJobTitle();
		loginPage.getJobTitle();
		
		
	}
	@When("^I click on Recruitment$")
	public void i_click_on_Recruitment()  {
		loginPage.settoRecruitment();
	    
	}

	@Then("^Click on Vacancies$")
	public void click_on_Vacancies()  {
	   loginPage.settoVacancies();
	}
	
	@When("^I click on UserProfile$")
	public void i_click_on_UserProfile()  {
		loginPage.setUserProfile();
	}

	@Then("^Click on Logout$")
	public void click_on_Logout()  {
	    loginPage.setLogout();
	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		
		driver.close();
		
	}


}
