package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class SmokeTest {
	

	WebDriver driver;
@Given("^user open chrome browser$")
public void user_open_chrome_browser() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raJon\\Downloads\\SDET\\chromedriver_win32\\chromedriver.exe\\");
	driver=new ChromeDriver();
	
}
   


@Given("^user open url \"([^\"]*)\"$")
public void user_open_url(String url) throws Throwable {
	
	driver.get(url);
   
}
@Given("^user enters name as \"([^\"]*)\" and password as \"([^\"]*)\"$")
public void user_enters_name_as_and_password_as(String uname, String pass) throws Throwable {
	driver.findElement(By.id("email")).sendKeys(uname);
	driver.findElement(By.id("pass")).sendKeys(pass);
    
}

@Given("^user click on login$")
public void user_click_on_login() throws Throwable {
	
  driver.findElement(By.xpath("//button[@name='login']")).click();
}

@Then("^user close the browser$")
public void user_close_the_browser() throws Throwable {
	driver.quit();
    
}

}
