package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.pt.*;
import pages.FiltrosPage;
import pages.VerOfertasPage;

public class FiltrosWebmotorsTestsSteps {

	FiltrosPage filtros = new FiltrosPage();
	
	@E("espera um pouco")
	public void esperar() throws InterruptedException {
		filtros.esperarUmPouco(6000);
	}
	
	@Entao("o sistema filtra os produtos")
	public void escolherFiltros(){
		filtros.acionarFiltros("/html/body/div[1]/main/div[1]/div[2]/div/div[5]/div[3]/label", "/html/body/div[1]/main/div[1]/div[2]/div/div[7]/div[5]/label");
	}
	
}
