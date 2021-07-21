package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement SubmitLogin;

    private void ingresarCampoEmail(String txtEmail){
        email.clear();
        email.sendKeys(txtEmail);
    }

    private void ingresarCampoPasswd(String txtPassword){
        password.clear();
        password.sendKeys(txtPassword);
    }

    private void clicLogin(){
        SubmitLogin.click();
    }

    public void Login(String txtEmail, String txtPassword){
        ingresarCampoEmail(txtEmail);
        ingresarCampoPasswd(txtPassword);
        clicLogin();
    }

    public SignInPage(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
}
