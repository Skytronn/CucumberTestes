package stepDefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PesquisaWebmotorsPage;

public class PesquisaWebmotorsTestsStep {
	PesquisaWebmotorsPage pesquisaWebmotors = new PesquisaWebmotorsPage();
	
	
	@E("eu digito na barra de busca")
	public void digitarCampo() {
		pesquisaWebmotors.preencheProduto("Jetta");
	}
	
	
	@Entao("eu sou direcionado a página seguinte")
	public void verificarPagina() {
		pesquisaWebmotors.validaUrlPesquisa();
		
	}

}
