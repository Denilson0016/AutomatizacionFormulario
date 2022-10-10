package pages;

public class BackgroundPage extends BasePage{


    public BackgroundPage(){
        super(driver);
    } 


    private String labelNombre = "//label[contains(text(),'Tu Nombre:')]";

    private String ButtonOptions = "//*[contains(@id,'details-button')]";
    private String linkContinue = "//*[contains(@id,'proceed-link')]";


    public void navigateToPage(){
        navigateTo("https://178.128.77.104/Softesting/Frontend/Caso1.html");

    }
    public void ToContinue(){
       
        clickElement(ButtonOptions);
        clickElement(linkContinue);
    }

    public boolean home(){
    
        if(Find(labelNombre)!=null){
            return true;
        }
        return false;
        
    }


    
}
