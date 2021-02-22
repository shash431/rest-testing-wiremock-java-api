import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"/Users/laddu/IdeaProjects/rest-testing-wiremock-java-api/src/test/resources/Feature/cucumber.feature:8"},
        plugin = {"json:/Users/laddu/IdeaProjects/rest-testing-wiremock-java-api/target/cucumber-parallel/2.json"},
        monochrome = false,
        glue = {"com.baeldung.rest.cucumber"})
public class Parallel02IT {
}
