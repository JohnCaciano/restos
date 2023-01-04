package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.tuhogaronline.com/")
public class PaginaPrincipalPagesObject extends PageObject {
    private By Btn_aceptar=By.xpath("(//span[@class='vtex-modal-layout-0-x-closeButtonLabel vtex-modal-layout-0-x-closeButtonLabel--cookies w-100 tc ph6'])[1]");
    private By Btn_micuenta = By.xpath ("(//button[@class='vtex-button bw1 ba fw5 v-mid relative pa0 lh-solid br2 min-h-regular t-action bg-transparent b--transparent c-action-primary hover-b--transparent hover-bg-action-secondary hover-b--action-secondary pointer '])[1]");

    private By Btn_cerrarspan=By.xpath("(//i[@class='moosend-form-close-element-1a6a622b-2c85-4992-88f0-640b7e434b1a font-awesome-icon fa fa-times fa-2x'])[1]");

    private By Btn_InicioSesion = By.xpath("(//li[@class='vtex-login-2-x-optionsListItem mb3'])[2]");
    private By Txt_Email = By.xpath("//input[@placeholder='e-mail']");
    private By Txt_usuario = By.xpath("//input[@name='usuario']");
    private By Txt_contrasena = By.xpath("//input[@placeholder='password']");

    private By Btn_iniciar = By.xpath("(//div[@class='vtex-button__label flex items-center justify-center h-100 ph5 '])[2]");
    private By Btn_salas = By.xpath("(//div[@class='vtex-menu-2-x-styledLinkContent vtex-menu-2-x-styledLinkContent--departamer__main flex justify-between nowrap'])[3]");

    private By Btn_cortinas = By.xpath("(//a[@href='/decoracion/cortinas'])[2]");


    private By Btn_Producto1 = By.xpath("(//h3[@class='vtex-product-summary-2-x-productNameContainer mv0 vtex-product-summary-2-x-nameWrapper overflow-hidden c-on-base f5'])[1]");




    private By Btn_carrito = By.xpath("(//div[@class='vtex-button__label flex items-center justify-center h-100 ph6 w-100 border-box '])[3]");
    private By Btn_finalizar = By.xpath("//button[@id='proceed-to-checkout']");
    private By Txt_barraBuscar = By.xpath("(//input[@formcontrolname='buscar'])[2]");


    private By Lbl_producto = By.xpath("//h1[contains(text(),'LOS DEMONIOS DEL REICH')]");






    public By getBtn_micuenta() {
        return Btn_micuenta;
    }

    public By getBtn_InicioSesion() {
        return Btn_InicioSesion;
    }



    public By getTxt_usuario() {
        return Txt_usuario;
    }

    public By getTxt_contrasena() {
        return Txt_contrasena;
    }

    public By getBtn_iniciar() {
        return Btn_iniciar;
    }



    public By getBtn_salas() {
        return Btn_salas;
    }

    public By getBtn_cortinas() {
        return Btn_cortinas;
    }

    public By getBtn_Producto1() {
        return Btn_Producto1;
    }

    public By getBtn_finalizar() {
        return Btn_finalizar;
    }



    public By getBtn_carrito() {
        return Btn_carrito;
    }

    public By getTxt_barraBuscar() {
        return Txt_barraBuscar;
    }

    /*

    public By getBtn_Producto2() {
        return Btn_Producto2;
    }

     */

    public By getLbl_producto() {
        return Lbl_producto;
    }

    public By getBtn_aceptar() {
        return Btn_aceptar;
    }

    public By getBtn_cerrarspan() {
        return Btn_cerrarspan;
    }

    public By getTxt_Email() {
        return Txt_Email;
    }
}
