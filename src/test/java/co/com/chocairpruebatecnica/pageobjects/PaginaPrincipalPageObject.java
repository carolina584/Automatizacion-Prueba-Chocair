package co.com.chocairpruebatecnica.pageobjects;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com")
public class PaginaPrincipalPageObject extends PageObject{

	@FindBy(how = How.ID, using = "menu-item-6142")
    public WebElement opcionMenuServicios;
	
	@FindBy(how = How.ID, using = "cookie_action_close_header")
    public WebElement botonAceptarCookies;
	
	public void clickServicios() {
		botonAceptarCookies.click();
		opcionMenuServicios.click();
	}	
}
