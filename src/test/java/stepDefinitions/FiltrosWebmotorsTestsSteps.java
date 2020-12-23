package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.FiltrosPage;
import pages.VerOfertasPage;

public class FiltrosWebmotorsTestsSteps {

	FiltrosPage filtros = new FiltrosPage();
	
	@Entao("o sistema filtra os produtos")
	public void escolherFiltros(){
		filtros.acionarFiltros("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[5]/div[3]/label", "//*[@id=\"root\"]/main/div[1]/div[2]/div/div[7]/div[5]/label");
	}
	
}
