package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmPage {

    @FindBy(className = "alert")
    WebElement ConfirmarCompra;

    public boolean resultadoDeOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(ConfirmarCompra.getText());
        return mensaje.equals(ConfirmarCompra.getText());
    }

    public ConfirmPage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }
}
