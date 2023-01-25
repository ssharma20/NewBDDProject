package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginSteps {

    @Before
    public void beforeHook(){
        System.out.println("before hook executed");
    }
    @After
    public void afterHook(){
        System.out.println("After hook executed");
    }

    @BeforeStep
    public void beforeStepHook(){
        System.out.println("Before Step hook");
    }
    @AfterStep
    public void afterStepHook(){
        System.out.println("After Step hook");
    }
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on login page");
    }

    @When("User enters correct login and password")
    public void userEntersCorrectLoginAndPassword() {
        System.out.println("User enters correct login and password");
    }

    @And("Clicks on login button")
    public void clicksOnLoginButton() {
        System.out.println("Clicks on login button");
    }

    @Then("User should be presented with landing page")
    public void userShouldBePresentedWithLandingPage() {
        System.out.println("User should be presented with landing page");
    }

    @When("User enters correct login as {string} and password as {string}")
    public void userEntersCorrectLoginAsAndPasswordAs(String arg0, String arg1) {
        System.out.println("Login id is :" + arg0 + "Password is :" + arg1);
    }

    @When("User enters following credentials")
    public void user_enters_following_credentials(DataTable table) {
        List<List<String>> data = table.asLists(String.class);
        String var1 = data.get(0).get(0);
        String var2 = data.get(0).get(1);
        String var3 = data.get(1).get(0);
        String var4 = data.get(1).get(1);

        System.out.println("userid 1 " + var1 + "   password1  " + var2);
        System.out.println("userid 2 " + var3 + "   password2  " + var4);

    }
}



