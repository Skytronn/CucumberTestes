package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.an.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PesquisaWebmotorsPage;

public class PesquisaWebmotorsTestsStep {
	PesquisaWebmotorsPage pesquisaWebmotors = new PesquisaWebmotorsPage();
	
	String pesquisa = "Jetta";
	
	@E("eu digito na barra de busca")
	public void digitarCampo() {
		pesquisaWebmotors.preencheProduto(pesquisa);
		
		
	}
	@Quando("eu clico na pesquisa")
	public void clicarPesquisa() {
		pesquisaWebmotors.clicarElemento(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a"));
	}
	
	@Entao("eu sou direcionado a página seguinte")
	public void verificarPagina() {
		pesquisaWebmotors.validaUrlPesquisa(pesquisa);
	}

}
