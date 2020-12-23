package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.an.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.MotosNovasPage;
import pages.VerOfertasPage;

public class MotosNovasWebmotorsTestsSteps {

	MotosNovasPage motosNovas = new MotosNovasPage();
	
	@E("clico em comprar motos")
	public void comprarMotos() {
		motosNovas.clicarElemento(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[1]/h2[1]"));
	}
	
	@Entao("vou para a pagina de motos novas ou usadas")
	public void verificarPaginaMotos() {
		motosNovas.VerificarUrlMotos();
	}
}
