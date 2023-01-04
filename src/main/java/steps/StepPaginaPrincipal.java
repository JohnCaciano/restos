package steps;


import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pageObjects.PaginaPrincipalPagesObject;
import utils.Excel;

import java.io.IOException;

public class StepPaginaPrincipal  {
    PaginaPrincipalPagesObject paginaPrincipalPagesObject = new PaginaPrincipalPagesObject();
    Excel excel = new Excel();


    @Step
    public  void abrir_navegador(){
        paginaPrincipalPagesObject.open();
    }

    @Step
    public void InicioSesion(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_aceptar()).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
/*
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_cerrarspan()).click();
        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

 */

        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_micuenta()).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_InicioSesion()).click();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
    @Step
    public void ingresoCorreoyContrasena ()throws IOException{
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getTxt_Email())
                .sendKeys(excel.leerDatosExcel("Terminosbusqueda.xlsx", "hojaProyecto", 0, 1));

        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getTxt_contrasena())
                .sendKeys(excel.leerDatosExcel("Terminosbusqueda.xlsx", "hojaProyecto", 1, 1));

        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_iniciar()).click();
        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Step
    public void compras(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_salas()).click();

        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_cortinas()).click();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_Producto1()).click();
        try {
            Thread.sleep(8000);
        }catch (InterruptedException e){
            e.printStackTrace();

        }
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_carrito()).click();
        paginaPrincipalPagesObject.getDriver().findElement(paginaPrincipalPagesObject.getBtn_finalizar()).click();

    }



}
