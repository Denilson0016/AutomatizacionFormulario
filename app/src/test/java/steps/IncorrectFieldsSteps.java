package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FormPage;

public class IncorrectFieldsSteps {

    FormPage formPage = new FormPage();

   

    @Given("^I write incorrectly the data in the field of nombre(.+)$")
    public void iWriteInCorrectlyName(String data) {
        formPage.enterName(data);
    }

    @And("^I write incorrectly the data in the field of correo(.+)$")
    public void iWriteInCorrectlyEmail(String data) {
        formPage.enterEmail(data);
    }

    @And("^I write incorrectly the data in the field of barrio(.+)$")
    public void writeInCorrectlyBarrio(String data) {
        formPage.enterBarrio(data);
    }

    @And("^I write incorrectly the data in the field of asunto(.+)$")
    public void iWriteInCorrectlyAsunto(String data) {
        formPage.enterAsunto(data);
    }

    @And("^I write incorrectly the data in the field of mensaje(.+)$")
    public void WriteInCorrectlyMensaje(String data) {
        formPage.enterMessage(data);
    }



@When("^I send the incorrect information$")
    public void iSendTheInformation() {
        formPage.send();
    }

    @Then("^I should see an error alert on$")
    public void iShouldNotSeeAnErrorMessage() {
        
        Assert.assertEquals("UPPPPS ALGO HA FALLADO :(", formPage.alertaChrome());
        formPage.closeAlert();
    }
    
}
