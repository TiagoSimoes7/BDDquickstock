package BDDquickstock.StepDefinitions;

import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.Generaterandomstringwithspecificboundsandlength;
import BDDquickstock.SupportClasses.GenericDriver;
import BDDquickstock.SupportClasses.ProjectParameters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.DriverBuilder;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.TestProjectCapabilityType;
import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class RegistSteps {


    public static String appURL = "http://34.116.153.60:3000/";
    By by;

    @Given("I have the website open on the login page to test {string}")
    public void iHaveTheWebsiteOpenOnTheLoginPageToTest(String arg0) throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(
                TestProjectCapabilityType.CLOUD_URL,
                "https://oauth-tiagosssimoes-bd7fc:9eea4c97-4f7d-40c4-9aa6-32f9045db782@ondemand.eu-central-1.saucelabs.com:443/wd/hub");

        GenericDriver.driver = new DriverBuilder<ChromeDriver>(chromeOptions)
                .withToken("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1")
                .withProjectName("QS_QuickStock")
                .withJobName(arg0)
                .build(ChromeDriver.class);

       /* driver = new RemoteWebDriver("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1", new ChromeOptions(),
                "QS_QuickStock", arg0);*/

        GenericDriver.driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        GeneratedUtils.sleep(500);

        GenericDriver.driver.navigate().to(appURL);
    }

    @When("I click on the {string} button")
    public void iClickOnTheButton(String arg0) throws Exception{
        GeneratedUtils.sleep(500);
        switch (arg0) {
            case "Create Account":
                by = By.xpath("//button[. = 'Sign Up']");
                break;
            case "Regist Account":
                by = By.xpath("//a[. = 'create one']");
                break;
            case "Create a Product Type":
                by = By.xpath("//button[. = 'Create a product type']");
                GenericDriver.driver.findElement(by).click();

                // 6. Does 'Create a new product type' contain 'Create a new product type'?
                GeneratedUtils.sleep(500);
                by = By.xpath("//h1[. = 'Create a new product type']");
                Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Create a new product type"));
                break;
            case "Edit Type Product":
                by = By.xpath("//tr[1]//button[. = 'Edit']");
                break;
            case "Delete Type Product":
                // 6. Click 'Delete1'
                GeneratedUtils.sleep(500);
                by = By.xpath("//tr[9]//button[. = 'Delete']");
                GenericDriver.driver.findElement(by).click();

                // 7. Click 'Delete Product'
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[. = 'Delete Product']");
                GenericDriver.driver.findElement(by).click();
                break;
            case "Manage Company":
                by = By.xpath("//span[. = 'Manage Company']");
                break;
            case "Submit Product Type":
                by =  by = By.xpath("//button[. = 'Submit']");
            default:
                break;
        }
        if(!arg0.equals("Create a Product Type") && !arg0.equals("Delete Type Product") ){
            GenericDriver.driver.findElement(by).click();
        }
    }

    @And("I input a valid {string}")
    public void iInputAValid(String arg0) throws Exception{
        Generaterandomstringwithspecificboundsandlength.GenerateRandomStringWithFormat generateRandomStringWithFormat;
        GeneratedUtils.sleep(500);
        switch (arg0) {
            case "email":
                by = By.cssSelector("#inputEmail");
                generateRandomStringWithFormat = Generaterandomstringwithspecificboundsandlength.generateRandomStringWithFormat("qwertyuiopasdfghjklçzxcvbnm","7");
                generateRandomStringWithFormat = (Generaterandomstringwithspecificboundsandlength.GenerateRandomStringWithFormat)((ReportingDriver)GenericDriver.driver).addons().execute(generateRandomStringWithFormat);
                GenericDriver.driver.findElement(by).sendKeys(generateRandomStringWithFormat.output);
                return;
            case "password":
                by = By.cssSelector("#inputPassword");
                GenericDriver.driver.findElement(by).sendKeys("123456");
                return;
            case "token":
                by = By.cssSelector("#inputToken");
                GenericDriver.driver.findElement(by).sendKeys("NGnvX3S4Jzl6PL84DEPl3PeCuw");
                return;
            default:
                return;
        }
    }

    @And("I input a invalid {string}")
    public void iInputAInvalid(String arg0) throws Exception{
        GeneratedUtils.sleep(500);
        switch (arg0) {
            case "email":
                by = By.cssSelector("#inputEmail");
                GenericDriver.driver.findElement(by).sendKeys("a@");
                return;
            case "password":
                by = By.cssSelector("#inputPassword");
                GenericDriver.driver.findElement(by).sendKeys("123");
                return;
            case "token":
                by = By.cssSelector("#inputToken");
                GenericDriver.driver.findElement(by).sendKeys("NGnv");
                return;
            default:
                return;
        }
    }

    @And("I input a {string} already taken")
    public void iInputAAlreadyTaken(String arg0) throws Exception{
        GeneratedUtils.sleep(500);
        switch (arg0) {
            case "email":
                by = By.cssSelector("#inputEmail");
                GenericDriver.driver.findElement(by).sendKeys("test");
                return;
            default:
                return;
        }
    }

    @Then("I can see the notification {string}")
    public void iCanSeeTheNotification(String arg0) throws Exception{
        GeneratedUtils.sleep(500);
        if(arg0.equals("Product Type Deleted")){
            GeneratedUtils.sleep(500);
        }else {
            by = By.xpath(String.format("//div[. = '%s']", arg0));
            GenericDriver.driver.findElement(by).isDisplayed();
        }


        if (GenericDriver.driver != null) {
            GenericDriver.driver.quit();
        }
    }

}
