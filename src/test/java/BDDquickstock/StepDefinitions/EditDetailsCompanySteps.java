package BDDquickstock.StepDefinitions;

import BDDquickstock.SupportClasses.GeneratedUtils;
import BDDquickstock.SupportClasses.Generaterandomstringwithspecificboundsandlength;
import BDDquickstock.SupportClasses.GenericDriver;
import BDDquickstock.SupportClasses.WebExtensions;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.web.RemoteWebDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class EditDetailsCompanySteps {
    By by;
    WebExtensions.ContainsAnyText containsAnyText;

    @And("I click on the Edit button of the {string}")
    public void iClickOnTheEditButtonOfThe(String arg0) throws Exception {
        if (arg0 == "district"){
            // 5. Click 'Change District'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change District']");
            GenericDriver.driver.findElement(by).click();

        }
        if (arg0 == "country"){
            // 5. Click 'Change Country'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Country']");
            GenericDriver.driver.findElement(by).click();


        }
        if (arg0 == "address"){

            // 5. Click 'Change Address'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Address']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "postalcode"){
            // 5. Click 'Change Postal Code'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Postal Code']");
            GenericDriver.driver.findElement(by).click();

        }
        if (arg0 == "email"){
            // 5. Click 'Change Email'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Email']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "phonenumber"){
            // 5. Click 'Change Phone Number'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Phone Number']");
            GenericDriver.driver.findElement(by).click();
        }
    }

    @And("I click in Save button of the {string}")
    public void iClickInSaveButtonOfThe(String arg0) throws Exception{
        if (arg0 == "district"){

            // 8. Click 'Change District1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change District']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangeDistrictDataToLeiria' contain 'Leiria'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Leiria']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Leiria"));

        }
        if (arg0 == "country"){
            // 9. Click 'Change Country1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Country']");
            GenericDriver.driver.findElement(by).click();

            // 10. Does 'Portugal' contain 'Portugal'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Portugal']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Portugal"));
        }
        if (arg0 == "address"){


            // 8. Click 'Change Address1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Address']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangeAddressToRua vieira' contain 'Rua vieira'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Rua vieira']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Rua vieira"));
        }
        if (arg0 == "postalcode"){

            // 8. Click 'Change Postal Code1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Postal Code']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangePostalCodeTo2495-186' contain '2495-186'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  2495-186']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("2495-186"));

        }
        if (arg0 == "email"){

            // 6. Click 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            GenericDriver.driver.findElement(by).click();

            // 7. Type 'Company@company.com' in 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            GenericDriver.driver.findElement(by).sendKeys("Company@company.com");

            // 8. Click 'Change Email1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Email']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangeEmailToCompany@company.com' contain 'Company@company.com'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Company@company.com']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Company@company.com"));
        }
        if (arg0 == "phonenumber"){
            // 8. Click 'Change Phone Number1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Phone Number']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangePhoneNumberTo918365834' contain '918365834'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' 918365834']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("918365834"));

        }
    }

    @Then("I can see the changes made on the company information of the {string}")
    public void iCanSeeTheChangesMadeOnTheCompanyInformation(String arg0) throws Exception {
        if (arg0 == "district"){

            // 9. Does 'ChangeDistrictDataToLeiria' contain 'Leiria'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Leiria']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Leiria"));

        }
        if (arg0 == "country"){
            // 10. Does 'Portugal' contain 'Portugal'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' Portugal']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Portugal"));
        }
        if (arg0 == "address"){

            // 9. Does 'ChangeAddressToRua vieira' contain 'Rua vieira'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Rua vieira']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Rua vieira"));
        }
        if (arg0 == "postalcode"){

            // 9. Does 'ChangePostalCodeTo2495-186' contain '2495-186'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  2495-186']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("2495-186"));

        }
        if (arg0 == "email"){
            // 7. Type 'Company@company.com' in 'Enter the Email'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputEmail");
            GenericDriver.driver.findElement(by).sendKeys("Company@company.com");

            // 8. Click 'Change Email1'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[2][. = 'Change Email']");
            GenericDriver.driver.findElement(by).click();

            // 9. Does 'ChangeEmailToCompany@company.com' contain 'Company@company.com'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = '  Company@company.com']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("Company@company.com"));
        }
        if (arg0 == "phonenumber"){
            // 9. Does 'ChangePhoneNumberTo918365834' contain '918365834'?
            GeneratedUtils.sleep(500);
            by = By.xpath("//h8[. = ' 918365834']");
            Assertions.assertTrue(GenericDriver.driver.findElement(by).getText().contains("918365834"));

        }
    }

    @And("I leave the {string} field empty")
    public void iLeaveTheFieldEmpty(String arg0) throws Exception{
        if (arg0 == "district"){
            // 5. Click 'Change District'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change District']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "country"){
            // 5. Click 'Change Country'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Country']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "address"){
            // 5. Click 'Change District'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change District']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "postalcode"){
            // 5. Click 'Change Postal Code'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Postal Code']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "email"){
            // 5. Click 'Change Email'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Email']");
            GenericDriver.driver.findElement(by).click();
        }
        if (arg0 == "phonenumber"){
            // 5. Click 'Change Phone Number'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Phone Number']");
            GenericDriver.driver.findElement(by).click();
        }

    }

    @Then("I can see that the Save of {string} button is disable")
    public void iCanSeeThatTheSaveButtonIsDisable(String arg0) throws Exception {
        if (arg0 == "district"){

            // 6. Click 'Change District Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change District']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change District Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "country"){
            // 6. Click 'Change Country Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Country']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Country Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "address"){
            // 6. Click 'Change District Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change District']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change District Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "postalcode"){
            // 6. Click 'Change Postal Code Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Postal Code']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Postal Code Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "email"){
            // 6. Click 'Change Email Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Email']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Email Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "phonenumber"){
            // 6. Click 'Change Phone Number1'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Phone Number']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Phone Number1'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }

    }

    @And("I input an invalid {string}")
    public void iInputAnInvalid(String arg0) throws Exception{
        if (arg0 == "postalcode"){
            // 5. Click 'Change Postal Code'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Postal Code']");
            GenericDriver.driver.findElement(by).click();

            // 6. Type '32132sad' in 'Enter the Postal Code'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPostalCode");
            GenericDriver.driver.findElement(by).sendKeys("32132sad");

            // 7. Click 'Change Postal Code Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Postal Code']");
                GenericDriver.driver.findElement(by).click();
            }
            catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Postal Code Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
        if (arg0 == "phonenumber") {

            // 5. Click 'Change Phone Number'
            GeneratedUtils.sleep(500);
            by = By.xpath("//button[. = 'Change Phone Number']");
            GenericDriver.driver.findElement(by).click();

            // 6. Click 'Enter the Phone Number'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPhoneNumber");
            GenericDriver.driver.findElement(by).click();

            // 7. Type '453563636okoij' in 'Enter the Phone Number'
            GeneratedUtils.sleep(500);
            by = By.cssSelector("#inputPhoneNumber");
            GenericDriver.driver.findElement(by).sendKeys("453563636okoij");

            // 8. Click 'Change Postal Code Locked'
            try {
                GeneratedUtils.sleep(500);
                by = By.xpath("//button[2][. = 'Change Postal Code']");
                GenericDriver.driver.findElement(by).click();
            } catch (AssertionError | RuntimeException ex) {
                getDriver().report().step("Step 'Click 'Change Postal Code Locked'' failed", ex.getMessage(), false, false);
                // FailureBehaviorType is continue test in case of failure
            }
        }
    }

    public ReportingDriver getDriver() {
        return (ReportingDriver) GenericDriver.driver;
    }
}
