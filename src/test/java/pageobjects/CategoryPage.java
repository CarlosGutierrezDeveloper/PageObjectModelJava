package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage {

    WebDriver driver;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement imagen;

    @FindBy(xpath = "//a[@title='Add to cart']")
    WebElement btnAddToCard;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement BtnProcesarPago;

    public void comprarCamiseta(){
        Actions accion = new Actions(this.driver);
        accion.moveToElement(imagen).moveToElement(btnAddToCard).click().build().perform();
        BtnProcesarPago.click();
    }

    public CategoryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
