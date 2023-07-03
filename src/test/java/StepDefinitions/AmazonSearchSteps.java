package StepDefinitions;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class AmazonSearchSteps {

	WebDriver driver = null;
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable{
	    System.out.println("Inside- Browser is open ");
	    System.setProperty("webdriver.chrome.driver","C:/Users/mahtabalam01/Downloads/chromedriver_win32/chromedriver.exe");
	    
	    driver =new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("^user is on amazon search page$")
	public void user_is_on_amazon_search_page() throws Throwable {
		 System.out.println("Inside- user is on search page ");
         //driver.navigate().to("https://www.amazon.in/");
        	 driver.navigate().to("https://www.google.co.in");
	}

	@When("^user enters texts in search box$")
	public void user_enters_texts_in_search_box() throws Throwable {
		 System.out.println("Inside- user_enters_texts_in_search_box ");
	    // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phone");
		 driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("facebook");
	}

	@And("^hits enter$")
	public void hits_enter() throws Throwable {
		 System.out.println("Inside- Hits enter ");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		 driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys(Keys.ENTER);
	}

	@Then("^user is navigated to next desired page$")
	public void user_is_navigated_to_next_desired_page() throws Throwable {
		 System.out.println("Inside- user_is_navigated_to_next_desired_page ");
		 driver.getPageSource().contains("Log In");

		 //driver.close();
//	     driver.quit();
	}
	
	//==========================================================================
	
	
	@Given("^User gives uname and password mag\\.stricker(\\d+)@gmail\\.comand admin(\\d+)$")
	public void user_gives_uname_and_password_mag_stricker_gmail_comand_admin(String uname, String pswd) throws Throwable {
		System.out.println("Step 2 : user eners user name and password ");
		//driver.findElement(By.className("nav-flyout-buffer-top")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pswd);
	}

	@Given("^click on login button$")
	public void click_on_login_button() throws Throwable {
		System.out.println("Step 3 : user click on lohin button ");
	}

	@Then("^user should face invalid credentials error$")
	public void user_should_face_invalid_credentials_error() throws Throwable {
		System.out.println("Step 2 : user get error of invalid credentials ");
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.close();
	    driver.quit();
	}

}
