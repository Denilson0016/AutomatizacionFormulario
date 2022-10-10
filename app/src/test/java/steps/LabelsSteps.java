package steps;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.FormPage;

public class LabelsSteps {

    FormPage formPage = new FormPage();
    private String lblBarrio="";
    private String lblMensaje="";
 
    @Given("look for the neighborhood label")
    public void lookForTheNeighborhoodLabel() {
        lblBarrio= formPage.labelBarrio();
    }
    
    @And("look for the message label")
    public void lookForTheMessageLabel() {
        lblMensaje= formPage.labelMensaje();

    }
    
    @Then("the labels are well written")
    public void theLabelsAreWellWritten() {
        Assert.assertEquals("Barrio:", lblBarrio);
        Assert.assertEquals("Mensaje:", lblMensaje);
    }

}
