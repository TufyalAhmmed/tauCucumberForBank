package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {

    public WebDriver driver;

    @Given("I am in the login page of the Para Bank Application")
    public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");


    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.name("username")).sendKeys("xyz");
        driver.findElement(By.name("password")).sendKeys("Tufyal12@");
        driver.findElement(By.name("username")).submit();

    }

    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_Overview_page() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("form.login")).isDisplayed();
        driver.findElement(By.cssSelector("a[href='https://parabank.parasoft.com/parabank/logout.htm'")).click();


    }

}
