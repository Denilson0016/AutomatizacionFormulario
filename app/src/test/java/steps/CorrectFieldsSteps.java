package steps;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.FormPage;

public class CorrectFieldsSteps {

    FormPage formPage = new FormPage();
    

    @Given("^I write correctly the data in the field of nombre(.+)$")
    public void iWriteCorrectlyName(String data) {
        formPage.enterName(data);
    }

    @And("^I write correctly the data in the field of correo(.+)$")
    public void iWriteCorrectlyEmail(String data) {
        formPage.enterEmail(data);
    }

    @And("^I write correctly the data in the field of barrio(.+)$")
    public void writeCorrectlyBarrio(String data) {
        formPage.enterBarrio(data);
    }

    @And("^I write correctly the data in the field of asunto(.+)$")
    public void iWriteCorrectlyAsunto(String data) {
        formPage.enterAsunto(data);
    }

    @And("^I write correctly the data in the field of mensaje(.+)$")
    public void WriteCorrectlyMensaje(String data) {
        formPage.enterMessage(data);
    }

    @When("^I send the information$")
    public void iSendTheInformation() {
        formPage.send();
    }

    @But("^I should not see an error message$")
    public void iShouldNotSeeAnErrorMessage() {
        
        Assert.assertNotEquals("UPPPPS ALGO HA FALLADO :(", formPage.alertaChrome());
        formPage.closeAlert();
    }

}
