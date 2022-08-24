package com.automation.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {

	WebDriver driver;
	Scenario scn;

	@Before
	public void setup(Scenario scn)
	{
		this.scn = scn;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


	}

	@After
	public void cleanup()
	{
		driver.quit();
		scn.log("Browser Closed");
	}

	@Given("user navigated to home application url")
	public void user_navigated_to_home_application_url() 
	{
		driver.get("https://www.amazon.in/");
		scn.log("navigated to url");
	}

	@When("search for {string}")
	public void search_for(String productName) {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(productName);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		scn.log("search & click for product laptop");
	}

	@Then("search product is displayed")
	public void search_product_is_displayed() 
	{
		System.out.println(driver.findElement(By.xpath("//div[@class='a-section']/div[@class='sg-row']")).isDisplayed());
	}

	@When("user check for {string}")
	public void user_check_for(String multipleProducts) 
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(multipleProducts);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	@Then("search Result is displayed")
	public void search_result_is_displayed() {
	
	}

}
