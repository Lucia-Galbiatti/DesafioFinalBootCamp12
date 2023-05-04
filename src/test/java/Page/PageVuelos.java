package Page;

import Base.SeleniumBase;
import Base.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageVuelos extends SeleniumBase {
    public PageVuelos(WebDriver driver) {
        super(driver);


        //Mejor vuelo
        By btn_ElMejor = By.xpath("///*[@id=\"top-listing-container\"]/div[10]/div/ul/li[1]");
        By btn_Mprecio = By.xpath ("//div[@class='trip-view__react with-badge']//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot']");
        //Mas Baratos
        By btn_Mbarato = By.xpath("//ul[@class='Tabs__UlElement-cncr__sc-61rlvo-0 evvvUR']/li[2]");
        By btn_barato$ = By.xpath ("//div[@class='trip-view__react with-badge']//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 cbaIot']");
        By companias= By.xpath("//span[.='Compañías']");
        By btn_comptodas= By.xpath("//button[.='Todas']");
        By btn_aeroliarg = By.xpath("//input[@id='id-Aerolineas Argentinas']");
        By alert_addCiudad= By.xpath("//span[.='Introduce ciudad o aeropuerto de origen']");
        By alert_addCiudadD = By.xpath("//span[.='Introduce ciudad o aeropuerto de destino']");
        By btn_vbuscarv = By.xpath("//button[@class='Button-sc-1bbve8d-0 gwmrSi']");







    }
}