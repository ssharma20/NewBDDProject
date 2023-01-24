package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Features", glue ={ "StepDefinitions"},
        plugin = {"pretty", "html:target/HtmlReports"})
       // plugin = {"pretty", "json:target/report.json"})
    //plugin = {"pretty","junit:target/report.xml "},tags = "@SmokeTest")
public class LoginStepRunner {

}
