package com.nttdata.glue;

import com.nttdata.steps.ConsultarOrden;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ConsultarOrdenStepDef {



    @When("consulto la orden con id {int}")
    public void consultarOrden(int id){ConsultarOrden.consultarOrden(id);
    }

    @Then("el codigo de respuesta {int}")
    public void elCodigoDeRespuesta(int statusCode) {ConsultarOrden.validarCodigoRespuesta(statusCode);
    }

    @And("el type es {string}")
    public void elTypeEs(String type) {
      ConsultarOrden.validarType(type);
    }



}
