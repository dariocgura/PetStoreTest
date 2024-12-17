package com.nttdata.glue;

import com.nttdata.steps.CrearOrden;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CrearOrdenStepDef {

    @Steps
    CrearOrden crearOrden;

    @When("creo la orden con id {int}, petId {int}, quantity {int}")
    public void crearUsuario(int id, int petId, int quantity){
        crearOrden.crearOrden(id, petId, quantity);
    }

    @Then("el código de respuesta es {int}")
    public void elCódigoDeRespuestaEs(int statusCode) {
       crearOrden.validarCodigoRespuesta(statusCode);
    }


    @And("el campo {string} es {int}")
    public void elCampoEs(String campo, int valorEsperado) {crearOrden.elCampoEs(campo,valorEsperado);
    }


    @And("el campo {string} es {string}")
    public void elStatusEs(String status, String statusEsperado) {crearOrden.elStatusEs(status,statusEsperado);
    }


    @And("el petId {string} es {int}")
    public void elPetIdEs(String campo, int IdEsperado) {crearOrden.elPetIdEs(campo,
            IdEsperado);
    }


}
