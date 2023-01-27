package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepsWithExamples {

   private WebDriver driver;
    @Given("the user is at the login page of the application")
    public void theUserIsAtTheLoginPageOfTheApplication() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        System.out.println("The user is at the login page of the Application");
    }

    @When("the user enters {string} and {string}")
    public void theUserEntersAnd(String arg0, String arg1) {
        System.out.println(arg1);
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(arg0);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(arg1);
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("the user is present with the landing page")
    public void theUserIsPresentWithTheLandingPage() {
        System.out.println("Login Successful");
        driver.close();
    }
}
