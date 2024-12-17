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





}
