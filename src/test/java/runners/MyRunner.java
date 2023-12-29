package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/com/epam/training/stepDefinitions",
        glue = {"stepDefinitions"}
)

public class MyRunner {

}
