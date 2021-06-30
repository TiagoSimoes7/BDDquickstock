package BDDquickstock;


import BDDquickstock.SupportClasses.GeneratedUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class StepDefinitions {

    public static WebDriver driver;
    public static String appURL = "http://34.116.153.60:3000/";
    By by;


    @Given("I have the website open on the dashboard of the company")
    public void iHaveTheWebsiteOpenOnTheDashboardOfTheCompany() throws Exception{
        System.out.println(" I am inside GIVEN");

        driver = new RemoteWebDriver("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1", new ChromeOptions(),
                "QS_QuickStock", "ProductType Feature");

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
        System.out.println(" I am inside When");
        GeneratedUtils.sleep(500);
        by = By.xpath("//nav[1]/ul/li/div[1]");
        driver.findElement(by).click();

    }

    @And("I click on the {string} in the {string} tab")
    public void iClickOnTheInTheTab(String arg0, String arg1) throws Exception{
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

        GeneratedUtils.sleep(1000);
        if (driver != null) {
            driver.close();
        }
    }


}