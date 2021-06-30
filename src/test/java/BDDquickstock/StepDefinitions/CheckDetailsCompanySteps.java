package BDDquickstock.StepDefinitions;

import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.WebExtensions;
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

public class CheckDetailsCompanySteps {

    public static WebDriver driver;
    public static String appURL = "http://34.116.153.60:3000/";
    By by;
    WebExtensions.ContainsAnyText containsAnyText;

    @And("I click on the {string} button")
    public void iClickOnTheButton(String arg0) throws Exception{

        // 4. Click 'Manage Company'
        GeneratedUtils.sleep(500);
        by = By.xpath("//span[. = 'Manage Company']");
        driver.findElement(by).click();
    }

    @Then("I can check all the company information")
    public void iCanCheckAllTheCompanyInformation() throws Exception{
        // 5. Is 'Location' visible?
        GeneratedUtils.sleep(500);
        by = By.xpath("//h5[. = 'Location']");
        driver.findElement(by).isDisplayed();

        // 6. Is 'Contact' visible?
        GeneratedUtils.sleep(500);
        by = By.xpath("//h5[. = 'Contact']");
        driver.findElement(by).isDisplayed();

        // 7. 'GetCountry' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[2]/div[2]/div/div/h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

        // 8. 'GetDistrict' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[2]/div[3]/div/div/h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

        // 9. 'GetAddress' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[4]//h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

        // 10. 'GetPostalCode' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[5]//h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

        // 11. 'Company1@company.com' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[3]/div[2]//h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

        // 12. 'GetPhoneNumber' contains any text ?
        GeneratedUtils.sleep(500);
        containsAnyText = WebExtensions.getContainsAnyText();
        by = By.xpath("//div[3]/div[3]//h8[2]");
        containsAnyText = (WebExtensions.ContainsAnyText)((ReportingDriver)driver).addons().execute(containsAnyText, by, -1);

    }
}
