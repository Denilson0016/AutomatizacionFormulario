package steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundPage;

public class BackgroundSteps {

   
    BackgroundPage background = new BackgroundPage();

    @Given("^entry to the page$")
    public void navigateToPage()throws InterruptedException{
        background.navigateToPage();
    }

    @When("ignore security restriction")
    public void ignoreSecurityRestriction() {
        
        background.ToContinue();
    }
    
    @Then("can i go to the form page")
    public void canIGoToTheFormPage() {
    
        Assert.assertTrue(background.home());
        
}


    
}
