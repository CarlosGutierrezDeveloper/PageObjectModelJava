import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class PruebaTest {

    private WebDriver chromeDriver;

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

    }

    @Test
    public void hacer_una_busqueda(){

        // Abrimos la pagina que vamos a probar
        chromeDriver.get("https://www.google.com/");

        //Encontrar e interactuar con los elementos.
        // Maximiza la ventana del navegador
        chromeDriver.manage().window().maximize();
        // Ingresar el valor a buscar
        chromeDriver.findElement(By.name("q")).sendKeys("Cantidad de paises en America");
        // Se presiona ENTER
        chromeDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        // Se hace clic en el primer resultado
        chromeDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[5]/div/div/div[1]/a/h3")).click();

        // Se crea un elemento web para reutilizar la variable
        WebElement texto = chromeDriver.findElement(By.id("listado"));

        //Verificar que la palabra aparezca en la pagina
        Assert.assertTrue(texto.getText().contains("AMÉRICA"));


    }

    @After
    public void cerrarDriver(){

        //Cerrar el navegador
        chromeDriver.quit();
    }
}
