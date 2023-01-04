package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepPaginaPrincipal;

import java.io.IOException;

public class StepDefinitions {


    @Steps
    StepPaginaPrincipal paginaPrincipal ;

    @Given("^ingreso a tu hogar online e inicio sesion$")
    public void ingreso_a_tu_hogar_online_e_inicio_sesion() {
        paginaPrincipal.abrir_navegador();
    }

    @When("^me encuentro en tu hogar online$")
    public void me_encuentro_en_tu_hogar_online() throws IOException {

       paginaPrincipal.InicioSesion();
       paginaPrincipal.ingresoCorreoyContrasena();
       paginaPrincipal.compras();


    }

    @Then("^busco producto y lo agrego al carrito$")
    public void busco_producto_y_lo_agrego_al_carrito() {

    }

}
