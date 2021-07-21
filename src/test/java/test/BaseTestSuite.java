package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

     WebDriver chromeDriver;

     HomePage homePage;
     SignInPage signInPage;
     CategoryPage categoryPage;
     PaymentPage paymentPage;
     ConfirmPage confirmPage;

     private void inicializarPagina(WebDriver driver){
         homePage = new HomePage(driver);
         signInPage = new SignInPage(driver);
         categoryPage = new CategoryPage(driver);
         paymentPage = new PaymentPage(driver);
         confirmPage = new ConfirmPage(driver);
     }

    @Before
    public void abrirDriver(){
        // Ubicación del driver del navegador
        System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");

        //Creamos opciones sobre nuestro dirver
        ChromeOptions options = new ChromeOptions();
        options.setCapability("marionette",false);

        // Nueva instancia de Chrome
        chromeDriver = new ChromeDriver(options);

        // Se define tiempo de espera hasta que carguen los elementos
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        inicializarPagina(chromeDriver);
        //Abrir una URL
        chromeDriver.get("http://automationpractice.com/index.php");
        //Encontrar e interactuar con los elementos.
        // Maximiza la ventana del navegador
        chromeDriver.manage().window().maximize();
    }
    @After
    public void cerrarDriver(){

        //Cerrar el navegador
        chromeDriver.quit();
    }
}
