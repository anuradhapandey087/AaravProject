package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/main/resources/Test.Feature",
        glue = {"stepdef"},
        dryRun = false

)

public class RunnerTest {


}
