package BDDquickstock.StepDefinitions;


import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.Generaterandomstringwithspecificboundsandlength;
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
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;


public class CheckProdTypesListSteps {


    //public static WebDriver driver;
    ChromeDriver driver = null;
    public static String appURL = "http://34.116.153.60:3000/";
    Generaterandomstringwithspecificboundsandlength.GenerateRandomStringWithFormat generateRandomStringWithFormat;
    By by;


    @Given("I have the website open on the dashboard of the company to test {string}")
    public void iHaveTheWebsiteOpenOnTheDashboardOfTheCompanyToTest(String arg0) throws Exception {
        GeneratedUtils.sleep(12000);
        System.out.println(driver);
        System.out.println(" I am inside GIVEN");


        /*driver = new RemoteWebDriver("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1", new ChromeOptions(),
               "QS_QuickStock", arg0);*/
        //testwebhook

        /*driver = new DriverBuilder<ChromeDriver>(new ChromeOptions())
                .withRemoteAddress(new URL("192.168.33.1"))
                .withToken("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1").build(MVMVN ChromeDriver.class);*/

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability(
                TestProjectCapabilityType.CLOUD_URL,
                "https://oauth-tiagosssimoes-bd7fc:9eea4c97-4f7d-40c4-9aa6-32f9045db782@ondemand.eu-central-1.saucelabs.com:443/wd/hub");


        driver = new DriverBuilder<ChromeDriver>(chromeOptions)
                .withToken("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1")
                .withProjectName("QS_QuickStock")
                .withJobName(arg0)
                .build(ChromeDriver.class);

        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
        GeneratedUtils.sleep(500);

        driver.navigate().to(appURL);
        GeneratedUtils.sleep(500);
        by = By.cssSelector("#inputEmail");
        driver.findElement(by).click();

        // 2. Type 'test@quickstock.empresa1.com' in 'email'
        GeneratedUtils.sleep(500);
        by = By.cssSelector("#inputEmail");
        driver.findElement(by).sendKeys("test@quickstock.empresa1.com");

        // 3. Click 'password'
        GeneratedUtils.sleep(500);
        by = By.xpath("/html/body/div[1]/div/div/div/div/form/div[2]/input");
        driver.findElement(by).click();

        // 4. Type '123456' in 'password'
        GeneratedUtils.sleep(500);
        by = By.xpath("/html/body/div[1]/div/div/div/div/form/div[2]/input");
        driver.findElement(by).sendKeys("123456");

        // 5. Click 'Log In'
        GeneratedUtils.sleep(500);
        by = By.xpath("//button[. = 'Log In']");
        driver.findElement(by).click();
    }



    @When("I click on the {string} tab in the sidebar")
    public void iClickOnTheTabInTheSidebar(String arg0) throws Exception{
        System.out.println(" I am inside When"+arg0);
        GeneratedUtils.sleep(500);
        by = By.xpath("//nav[1]/ul/li/div[1]");
        driver.findElement(by).click();

    }

    @And("I click on the Manage Product Types in the Products tab")
    public void iClickOnTheManageProductTypesInTheProductsTab() throws Exception{
        System.out.println(" I am inside And");
        // 4. Click 'Manage Product Types'
        GeneratedUtils.sleep(500);
        by = By.xpath("//span[. = 'Manage Product Types']");
        driver.findElement(by).click();
    }

    @Then("I can check the product type's list")
    public void iCanCheckTheProductTypeSList() throws Exception{
        System.out.println(" I am inside Then");
        GeneratedUtils.sleep(500);
        by = By.xpath("//h1[. = 'List of product types']");
        Assertions.assertTrue(driver.findElement(by).getText().contains("List of product types"));

        if (driver != null) {
            driver.quit();
        }
    }


    @And("I click on the Create a Product Type button")
    public void iClickOnTheButton() throws Exception {
        // 5. Click 'Create a product type'
        GeneratedUtils.sleep(500);
        by = By.xpath("//button[. = 'Create a product type']");
        driver.findElement(by).click();

        // 6. Does 'Create a new product type' contain 'Create a new product type'?
        GeneratedUtils.sleep(500);
        by = By.xpath("//h1[. = 'Create a new product type']");
        Assertions.assertTrue(driver.findElement(by).getText().contains("Create a new product type"));

    }

    @And("I input a valid product type name")
    public void iInputAValidProductTypeName() throws Exception{
        GeneratedUtils.sleep(500);
        by = By.cssSelector("#inputName");
        driver.findElement(by).click();

        // 8. This action generates a random string from given characters and length
        GeneratedUtils.sleep(500);
        generateRandomStringWithFormat = Generaterandomstringwithspecificboundsandlength.generateRandomStringWithFormat("qwertyuiopasdfghjklzxcvbnm","7");
        generateRandomStringWithFormat = (Generaterandomstringwithspecificboundsandlength.GenerateRandomStringWithFormat)((ReportingDriver)driver).addons().execute(generateRandomStringWithFormat);
        ProjectParameters.TypeProductName= generateRandomStringWithFormat.output;

        // 9. Type '{{TypeProductName}}' in 'Enter the type name'
        GeneratedUtils.sleep(500);
        by = By.cssSelector("#inputName");
        driver.findElement(by).sendKeys(ProjectParameters.TypeProductName);

    }

    @Then("I check the successful message")
    public void iCheckTheSuccessfulMessage() throws Exception{
        // 11. Is 'svg' present?
        GeneratedUtils.sleep(500);
        by = By.xpath("//div[1]/*[name()='svg']");
        driver.findElement(by);

        // 12. Does 'List of product types' contain 'List of product types'?
        GeneratedUtils.sleep(500);
        by = By.xpath("//h1[. = 'List of product types']");
        Assertions.assertTrue(driver.findElement(by).getText().contains("List of product types"));
    }


    @And("I click on the Submit button")
    public void iClickOnTheSubmitButton() throws Exception {
        // 10. Click 'Submit1'
        GeneratedUtils.sleep(500);
        by = By.xpath("//button[. = 'Submit']");
        driver.findElement(by).click();
    }

}
