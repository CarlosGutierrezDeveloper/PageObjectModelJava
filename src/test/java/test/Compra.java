package test;

import org.junit.Assert;
import org.junit.Test;

public class Compra extends BaseTestSuite {

    @Test
    public void hacer_una_compra() throws InterruptedException {

        homePage.clicSingIn();
        signInPage.Login("carlos.a@yopmail.com","123qwe1qaz");
        homePage.clicTshirts();
        categoryPage.comprarCamiseta();
        paymentPage.PaymentProcess();
        Assert.assertTrue(confirmPage.resultadoDeOrden("Your order on My Store is complete."));

        //WebElement ConfirmarCompra = chromeDriver.findElement(By.className("alert"));
        //Assert.assertTrue(ConfirmarCompra.isDisplayed());

        // coloca una espera a la prueba para evidenciar el resultado
        Thread.sleep(10000);

    }

}
