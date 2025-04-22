package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver = Hooks.driver;
    tc_001Page page = new tc_001Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        driver.get("https://example.com/upload");
    }

    @When("el usuario selecciona la opción 'cargar documentos'")
    public void el_usuario_selecciona_la_opción_cargar_documentos() {
        page.selectUploadOption();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opción_para_carga_única_y_carga_múltiple() {
        Assert.assertTrue(page.isSingleAndMultipleOptionDisplayed());
    }

    @When("el usuario elige 'carga en un solo archivo'")
    public void el_usuario_elige_carga_en_un_solo_archivo() {
        page.chooseSingleFileUpload();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.isSingleFileUploadBoxEnabled());
    }

    @When("el usuario elige 'cargar documentos por separado'")
    public void el_usuario_elige_cargar_documentos_por_separado() {
        page.chooseMultipleFilesUpload();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.areMultipleFileUploadBoxesDisplayed());
    }
}