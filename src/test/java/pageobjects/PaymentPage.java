package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    @FindBy(xpath = "//p//*[contains(text(),'Proceed to checkout')]")
    WebElement BtnSummary;

    @FindBy(xpath = "//button[@name='processAddress']")
    WebElement BtnAddress;

    @FindBy(id = "cgv")
    WebElement Checkbox;

    @FindBy(name = "processCarrier")
    WebElement BtnShipping;

    @FindBy(xpath = "//a[@title='Pay by check.']")
    WebElement PagoCheque;

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement BtnPayment;

    private void clicSummary(){
        BtnSummary.click();
    }

    private void clicAddress(){
        BtnAddress.click();
    }

    private void clicCheckbox(){
        Checkbox.click();
    }

    private void clicShipping(){
        BtnShipping.click();
    }

    private void clicPagoCheque(){
        PagoCheque.click();
    }

    private void clicPayment(){
        BtnPayment.click();
    }

    public void PaymentProcess(){
        clicSummary();
        clicAddress();
        clicCheckbox();
        clicShipping();
        clicPagoCheque();
        clicPayment();
    }

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
