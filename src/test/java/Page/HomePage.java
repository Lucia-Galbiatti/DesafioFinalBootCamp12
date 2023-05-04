package Page;

import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends SeleniumBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }
        By btnTrenes = By.linkText("Trenes");
        By btnVuelos = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Vuelos']\"");
        By btnHotel = By.xpath("\"//div[@class='d-1ytebqy e10w470p3']//a[.='Hoteles']\"");

    By btnIdayVuelta = By.xpath("//div[@class='d-vfn33k']");
    By btnIda = By.xpath("//div[@class='d-1s1pmhl']");
    By Origen = By.xpath("//label[.='Origen']");
    By origenciu =By.xpath("//*[@id=\"mui-1\"]");
    By destino = By.xpath("//label[.='Destino']");
    By destinociu= By.xpath("//*[@id=\"mui-2\"]");

    By Pasajeros = By.xpath("/button[@class='css-1rd1vwn']");
    By addAdultos = By.xpath("//button[@aria-label=\"Aumentar el número de adultos\"]");
    By resta_addAdultos = By.xpath("//button[@aria-label=\"Reducir el número de adultos\"]");
    By addninios = By.xpath("//ul[@class='css-g93eyo']");
    By btnBusqueda = By.xpath("//button[@class='d-1jmk4ql']");

    //Funciones

        public void SeleccionarOpcionTrenes (){
            clickear(btnTrenes);
        }

        public void SeleccionaOpcionVuelos () {clickear (btnVuelos);}






    }

