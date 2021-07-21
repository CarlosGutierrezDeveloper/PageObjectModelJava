package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    @FindBy(className = "login")
    private WebElement botonSignIn;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    private WebElement camisetas;

    public void clicSingIn(){
        botonSignIn.click();
    }

    public void clicTshirts(){
        camisetas.click();
    }

    public HomePage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }
}
