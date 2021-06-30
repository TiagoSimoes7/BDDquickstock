package BDDquickstock.StepDefinitions;

import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.WebExtensions;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class EditDetailsCompanySteps {
    public static WebDriver driver;
    public static String appURL = "http://34.116.153.60:3000/";
    By by;
    WebExtensions.ContainsAnyText containsAnyText;

    @Given("that I have the app open on the dashboard of the company")
    public void thatIHaveTheAppOpenOnTheDashboardOfTheCompany() throws Exception{
        System.out.println(" I am inside GIVEN");

        driver = new RemoteWebDriver("J-mUGKFif_vlwJIdRx1oKtVXq7E_dCwaElhto-eZ76g1", new ChromeOptions(),
                "QS_QuickStock", "ChangeManageCompanyDetails");

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

    @When("I click on the Administration tab in the sidebar")
    public void iClickOnTheAdministrationTabInTheSidebar() throws Exception {

        System.out.println(" I am inside When");
        GeneratedUtils.sleep(500);
        by = By.xpath("//nav[3]/ul/li/div[1]");
        driver.findElement(by).click();

    }


    @And("I click on the Manage Company button")
    public void iClickOnTheManageCompanyButton() throws Exception {
        // 4. Click 'Manage Company'
        GeneratedUtils.sleep(500);
        by = By.xpath("//span[. = 'Manage Company']");
        driver.findElement(by).click();
    }

    @And("I click on the Edit button of the {string}")
    public void iClickOnTheEditButtonOfThe(String arg0) throws Exception {
        if (arg0 == "district"){
            // 5. Click 'Change District'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change District']");
            driver.findElement(by).click();

        }
        if (arg0 == "country"){
            // 5. Click 'Change Country'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Country']");
            driver.findElement(by).click();


        }
        if (arg0 == "address"){

            // 5. Click 'Change Address'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Address']");
            driver.findElement(by).click();
        }
        if (arg0 == "postalcode"){
            // 5. Click 'Change Postal Code'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Postal Code']");
            driver.findElement(by).click();

        }
        if (arg0 == "email"){
            // 5. Click 'Change Email'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Email']");
            driver.findElement(by).click();
        }
        if (arg0 == "phonenumber"){
            // 5. Click 'Change Phone Number'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Phone Number']");
            driver.findElement(by).click();
        }
    }

    @And("I input a valid {string}")
    public void iInputAValid(String arg0) throws Exception {
        if (arg0 == "district"){

            // 6. Click 'Enter the District'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputDistrict");
            driver.findElement(by).click();

            // 7. Type 'Leiria' in 'Enter the District'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputDistrict");
            driver.findElement(by).sendKeys("Leiria");


        }
        if (arg0 == "country"){

            // 6. Click 'inputCountry'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputCountry");
            driver.findElement(by).click();

            // 7. Select the 'Portugal' option in 'inputCountry'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputCountry");
            (new Select(driver.findElement(by))).selectByValue("Portugal");

            // 8. Click 'inputCountry'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputCountry");
            driver.findElement(by).click();
        }
        if (arg0 == "address"){


            // 6. Click 'Enter the Address'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputAddress");
            driver.findElement(by).click();

            // 7. Type 'Rua Vieira' in 'Enter the Address'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputAddress");
            driver.findElement(by).sendKeys("Rua Vieira");
        }
        if (arg0 == "postalcode"){


            // 6. Click 'Enter the Postal Code'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPostalCode");
            driver.findElement(by).click();

            // 7. Type '2495-186' in 'Enter the Postal Code'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPostalCode");
            driver.findElement(by).sendKeys("2495-186");

        }
        if (arg0 == "email"){

            // 6. Click 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            driver.findElement(by).click();

            // 7. Type 'Company@company.com' in 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            driver.findElement(by).sendKeys("Company@company.com");

        }
        if (arg0 == "phonenumber"){
            // 6. Click 'Enter the Phone Number'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPhoneNumber");
            driver.findElement(by).click();

            // 7. Type '918365834' in 'Enter the Phone Number'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPhoneNumber");
            driver.findElement(by).sendKeys("918365834");

        }
    }

    @And("I click in Save button of the {string}")
    public void iClickInSaveButtonOfThe(String arg0) throws Exception{
        if (arg0 == "district"){

            // 8. Click 'Change District1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change District']");
            driver.findElement(by).click();

            // 9. Does 'ChangeDistrictDataToLeiria' contain 'Leiria'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Leiria']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Leiria"));

        }
        if (arg0 == "country"){
            // 9. Click 'Change Country1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Country']");
            driver.findElement(by).click();

            // 10. Does 'Portugal' contain 'Portugal'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Portugal']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Portugal"));
        }
        if (arg0 == "address"){


            // 8. Click 'Change Address1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Address']");
            driver.findElement(by).click();

            // 9. Does 'ChangeAddressToRua vieira' contain 'Rua vieira'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Rua vieira']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Rua vieira"));
        }
        if (arg0 == "postalcode"){

            // 8. Click 'Change Postal Code1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Postal Code']");
            driver.findElement(by).click();

            // 9. Does 'ChangePostalCodeTo2495-186' contain '2495-186'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  2495-186']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("2495-186"));

        }
        if (arg0 == "email"){

            // 6. Click 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            driver.findElement(by).click();

            // 7. Type 'Company@company.com' in 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            driver.findElement(by).sendKeys("Company@company.com");

            // 8. Click 'Change Email1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Email']");
            driver.findElement(by).click();

            // 9. Does 'ChangeEmailToCompany@company.com' contain 'Company@company.com'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Company@company.com']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Company@company.com"));
        }
        if (arg0 == "phonenumber"){
            // 8. Click 'Change Phone Number1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Phone Number']");
            driver.findElement(by).click();

            // 9. Does 'ChangePhoneNumberTo918365834' contain '918365834'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' 918365834']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("918365834"));

        }
    }

    @Then("I can see the changes made on the company information of the {string}")
    public void iCanSeeTheChangesMadeOnTheCompanyInformation(String arg0) throws Exception {
        if (arg0 == "district"){

            // 9. Does 'ChangeDistrictDataToLeiria' contain 'Leiria'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Leiria']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Leiria"));

        }
        if (arg0 == "country"){
            // 10. Does 'Portugal' contain 'Portugal'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Portugal']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Portugal"));
        }
        if (arg0 == "address"){

            // 9. Does 'ChangeAddressToRua vieira' contain 'Rua vieira'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Rua vieira']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Rua vieira"));
        }
        if (arg0 == "postalcode"){

            // 9. Does 'ChangePostalCodeTo2495-186' contain '2495-186'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  2495-186']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("2495-186"));

        }
        if (arg0 == "email"){
            // 7. Type 'Company@company.com' in 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            driver.findElement(by).sendKeys("Company@company.com");

            // 8. Click 'Change Email1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Email']");
            driver.findElement(by).click();

            // 9. Does 'ChangeEmailToCompany@company.com' contain 'Company@company.com'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Company@company.com']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("Company@company.com"));
        }
        if (arg0 == "phonenumber"){
            // 9. Does 'ChangePhoneNumberTo918365834' contain '918365834'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' 918365834']");
            Assertions.assertTrue(driver.findElement(by).getText().contains("918365834"));

        }
    }

    @And("I leave the {string} field empty")
    public void iLeaveTheFieldEmpty(String arg0) {
    }

    @Then("I can see that the Save button is disable")
    public void iCanSeeThatTheSaveButtonIsDisable() {
    }

    @And("I can see a warning saying that I need to input a {string}")
    public void iCanSeeAWarningSayingThatINeedToInputA(String arg0) {
    }

    @And("I input an invalid {string}")
    public void iInputAnInvalid(String arg0) {
    }

    @And("I can see a warning saying that I need to input a valid {string}")
    public void iCanSeeAWarningSayingThatINeedToInputAValid(String arg0) {
    }
}
