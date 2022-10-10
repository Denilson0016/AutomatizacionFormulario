package steps;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FormPage;

public class CleanFieldsSteps {

    FormPage formPage = new FormPage();
    


    
    @Given("I send the form, without filling the text fields")
    public void iSendTheFormWithoutFillingTheTextFields() {
        formPage.send();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        Assert.assertEquals("UPPPPS ALGO HA FALLADO :(", formPage.alertaChrome());
        formPage.closeAlert();
    }   
}
