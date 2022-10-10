package steps;
import org.junit.Assert;


import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;

import pages.FormPage;

public class ReloadFormSteps {

    FormPage formPage = new FormPage();

    @Given("I enter in the option Caso1, in the header")
public void iEnterInTheOptionCasoInTheHeader() {
    formPage.reloadForm();
}

@But("I should not see a page not found error")
public void iShouldNotSeeAPageNotFoundError() {

    Assert.assertNotEquals("Not Found", formPage.notFoundText());
}
    
}
