package pages;

import org.openqa.selenium.WebElement;

public class FormPage extends BasePage{

    private String labelNombre = "//label[contains(text(),'Tu Nombre:')]";
    private String inputNombre = "//input[@id='nombre']";
    private String labelEmail = "//label[contains(text(),'Tu Email:')]";
    private String inputEmail = "//body/div[1]/form[1]/div[2]/div[1]/input[1]";
    private String labelBarrio = "//label[contains(text(),'Varrio')]";
    private String inputBarrio = "//body/div[1]/form[1]/div[3]/div[1]/input[1]";
    private String labelAsunto = "//label[contains(text(),'Asunto:')]";
    private String inputAsunto = "//body/div[1]/form[1]/div[4]/div[1]/input[1]";
    private String labelMensaje = "//label[contains(text(),'Mensage:')]";
    private String inputMensaje = "//body/div[1]/form[1]/div[5]/textarea[1]";
    private String ButtonEnviar = "//button[contains(text(),'Enviar')]";

    private String linkCaso1 = "//a[contains(text(),'Caso 1')]";
    private String labelNotFound = "//h1[contains(text(),'Not Found')]";



    public FormPage(){
        super(driver);
    } 


    public String labelBarrio(){
        return textFromElement(labelBarrio);
    }

    public String labelMensaje(){
        return textFromElement(labelMensaje);
    }
    
    public void enterName(String nombre){
        write(inputNombre,nombre);
    }

    public void enterEmail( String email){
       
        write(inputEmail,email);
    }

    public void enterBarrio( String barrio){
       
        write(inputBarrio,barrio);
     
    }

    public void enterAsunto( String asunto ){
       
      
        write(inputAsunto,asunto);
     
    }

    public void enterMessage(String mensaje ){
       
        write(inputMensaje,mensaje);
    }
    
    public void reloadForm(){
       
        clickElement(linkCaso1);
    }

    public String notFoundText(){
        return textFromElement(labelNotFound);
    }
    

    public void send(){
       
        clickElement(ButtonEnviar);
    }
    
}
