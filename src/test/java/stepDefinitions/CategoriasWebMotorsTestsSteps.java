package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CategoriasPage;

public class CategoriasWebMotorsTestsSteps {
	
	CategoriasPage categoriasPage = new CategoriasPage();
	

	@Quando("Clico na categoria")
	public void clicarCategoria() {
		categoriasPage.clicarElemento(By.xpath("//*[@id=\"home_categories_carousel\"]/div/div/div/div/div[1]/div/div/div/a"));
	}
	
	@Entao("Sou direcionado para busca por categorias")
	public void validarPaginaCategoria(){
		categoriasPage.validaUrlCategorias();
	}
	
}