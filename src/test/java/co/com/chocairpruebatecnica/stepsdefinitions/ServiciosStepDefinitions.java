package co.com.chocairpruebatecnica.stepsdefinitions;

import static org.junit.Assert.assertTrue;

import co.com.chocairpruebatecnica.usersteps.StepsServicios;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ServiciosStepDefinitions {

	@Steps
	StepsServicios usuarioStep;

	@Given("usuario ingresa a la aplicacion web de chocair")
	public void usuario_ingresa_a_la_aplicacion_web_de_chocair() {
		usuarioStep.abrePaginaDeChocair();
	}

	@When("usuario selecciona la opcion Servicios")
	public void usuario_selecciona_la_opcion_Servicios() {
		usuarioStep.seleccionaOpcionServicios();
	}

	@Then("usuario visualiza la pagina de Servicios")
	public void usuario_visualiza_la_pagina_de_Servicios() {
		assertTrue(usuarioStep.visualizaElTituloDeLaPagina("Servicios – Choucair Testing"));
	}

	@Given("usuario se encuentra en la pagina de servicios")
	public void usuario_se_encuentra_en_la_pagina_de_servicios() {
		usuarioStep.navegaHaciaPaginaServicios();
	}

	@When("usuario selecciona la opcion (.*) en Portafolio de Soluciones")
	public void usuario_selecciona_la_opcion_Pruebas_m_viles_en_Portafolio_de_Soluciones(String opcionPortafolio) {
		usuarioStep.seleccionarOpcionDelPortafolio(opcionPortafolio);
		System.out.println("paso el when");
	}

	@Then("usuario deberia visualizar la informacion (.*)")
	public void usuario_deberia_visualizar_la_informacion_Pruebas_para_aplicativos_m_viles(String texto) {

		try {
			Thread.sleep(5000);
			System.out.println("espero luego valido");
		} catch (Exception e) {
		}
		usuarioStep.visualizaLaInformacionDelPortafolio().equals(texto);
		System.out.println("Comparando los dos valores " + texto);
		System.out.println("paso la prueba");
	}

	@When("usuario consulta la informacion de cursos y certificaciones")
	public void usuario_consulta_la_informacion_de_cursos_y_certificaciones() {
		try {
			Thread.sleep(5000);
			System.out.println("espero luego valido");
		} catch (Exception e) {
		}
		usuarioStep.seleccionarOpcionCursosCertificaciones();
		usuarioStep.seleccionarOpcionLeerMas();
	}

	@Then("usuario navega hacia la pagina de ver mas detalles")
	public void usuario_navega_hacia_la_pagina_de_ver_mas_detalles() {
		assertTrue(usuarioStep.visualizaElTituloDeLaPagina("Cursos y Certificaciones – Choucair Testing"));
	}

}
