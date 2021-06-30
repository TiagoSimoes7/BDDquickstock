package BDDquickstock;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "io.testproject.sdk.internal.reporting.extensions.cucumber.CucumberReporter"})
public class RunCucumberTest {

}
