package co.com.chocairpruebatecnica.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;

public class PaginaServiciosPageObject extends PageObject{
	
	
	
	@FindBy(how = How.ID, using = "menu-item-6142")
    public WebElement opcionMenuServicios;
	
	@FindBy(how = How.LINK_TEXT, using = "Portafolio de Soluciones")
    public WebElement botonPortafolio;
	
	@FindBy(how = How.XPATH, using = "(//a[@href='#cursos'])[1]")
    public WebElement botonCursosCertificaciones;
	
	@FindBy(how = How.CLASS_NAME, using = "elementor-button-text")
    public WebElement botonLeerMas;
	
	
	
    public WebElement opcionPortafolio;	
    public WebElement informacionDetallesPortafolio;


    
	public String obtenerTituloPagina() {
		return getTitle();
	}	
	
	public void seleccionaPortafolioSoluciones() {
		
		botonPortafolio.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void elegirOpcionPortafolio(String textoXpath) {
		opcionPortafolio = getDriver().findElement(By.xpath("//a[contains(text(),'"+textoXpath+"')]"));
		opcionPortafolio.click();
	}
	
	public String detallesInformacionPortafolio(String infoPortafolio) {
		
		informacionDetallesPortafolio = getDriver().findElement(By.xpath("//strong[contains(text(),'"+infoPortafolio+"')]"));
		System.out.println("mapie el titulo de detalles del portafolio" + informacionDetallesPortafolio.toString());
		return infoPortafolio;
	}
	
	public void seleccionarLeerMas() {
		
		botonLeerMas.click();
	}
	
	public void seleccionarCursosYCertificaciones() {
		
		botonCursosCertificaciones.click();
		System.out.println("le di click en cursos y certificaciones");
	}
	
}
