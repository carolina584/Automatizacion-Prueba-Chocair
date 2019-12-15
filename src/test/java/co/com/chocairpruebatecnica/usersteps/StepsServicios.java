package co.com.chocairpruebatecnica.usersteps;

import co.com.chocairpruebatecnica.pageobjects.PaginaPrincipalPageObject;
import co.com.chocairpruebatecnica.pageobjects.PaginaServiciosPageObject;
import net.thucydides.core.annotations.Step;

public class StepsServicios {

	PaginaPrincipalPageObject pagina;
	PaginaServiciosPageObject servicios;

	@Step("Abrir la pagina principal de chocair")
	public void abrePaginaDeChocair() {
		pagina.open();
	}
	
	@Step("Seleccionar la opcion Servicios")
	public void seleccionaOpcionServicios() {
		pagina.clickServicios();
	}
	
	@Step("Verificar Titulo")
	public boolean visualizaElTituloDeLaPagina(String esperado) {
		String actual = servicios.obtenerTituloPagina();
		boolean resultado = actual.equalsIgnoreCase(esperado);
		System.out.println("paso el primer escenario");
		return resultado;
		
	}
	
	@Step("Navega Hacia Pagina Servicios")
	public void navegaHaciaPaginaServicios() {
		pagina.open();
		pagina.clickServicios();
	}
	
	@Step("Seleccionar Opcion Portafolio")
	public void seleccionarOpcionDelPortafolio(String textoOpcionPortafolio) {
		servicios.seleccionaPortafolioSoluciones();
		servicios.elegirOpcionPortafolio(textoOpcionPortafolio);
	}
	
	@Step("visualiza la informacion de opciones de portafolio")
	public String visualizaLaInformacionDelPortafolio() {
		
		String pruebasUsabilidad = servicios.detallesInformacionPortafolio("Pruebas de Usabilidad");
		return pruebasUsabilidad;

		}
	@Step("Seleccionar la opcion cursos y certificaciones")
	public void seleccionarOpcionCursosCertificaciones() {
		System.out.println("Select portf");
		servicios.seleccionaPortafolioSoluciones();
		System.out.println("Select cursos");
		servicios.seleccionarCursosYCertificaciones();
	}
	
	@Step("Seleccionar la opcion de leer mas")
	public void seleccionarOpcionLeerMas() {
		
		servicios.seleccionarLeerMas();
	}
	
	}

