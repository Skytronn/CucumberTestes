package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.VerOfertasPage;

public class PesquisaWebmotorsTestsStep {
	PesquisaWebmotorsTestsStep pesquisaWebmotors = new PesquisaWebmotorsTestsStep();
	
	@Dado("que eu navego até a página do webmotors")
	public void navegarAtePagina(){
		pesquisaWebmotors.navegarAtePagina();
	}
	@Entao("eu digito na barra de busca")
	public void clicarVerOfertas() {
		pesquisaWebmotors.clicarVerOfertas();
	}
	
	@E("")
	
	@Entao("eu sou direcionado a página seguinte")
	public void verificarPagina() {
		pesquisaWebmotors.verificarPagina();
		
	}

}
