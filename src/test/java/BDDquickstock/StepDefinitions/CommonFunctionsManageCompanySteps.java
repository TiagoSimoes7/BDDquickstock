package BDDquickstock.StepDefinitions;

import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.GenericDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CommonFunctionsManageCompanySteps {


    By by;


    @When("I click on the Administration tab in the sidebar")
    public void iClickOnTheAdministrationTabInTheSidebar() throws Exception {
        GeneratedUtils.sleep(500);
        by = By.xpath("//span[. = 'Administration']");
        GenericDriver.driver.findElement(by).click();
    }


    @And("I click on the Manage Company button")
    public void iClickOnTheManageCompanyButton() throws Exception {
        // 4. Click 'Manage Company'
        GeneratedUtils.sleep(500);
        by = By.xpath("//span[. = 'Manage Company']");
        GenericDriver.driver.findElement(by).click();
    }
}
