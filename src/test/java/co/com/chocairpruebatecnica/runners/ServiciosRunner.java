package co.com.chocairpruebatecnica.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = {"co.com.chocairpruebatecnica.stepsdefinitions"}
)
public class ServiciosRunner {}
