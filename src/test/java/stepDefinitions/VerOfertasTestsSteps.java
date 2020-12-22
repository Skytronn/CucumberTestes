package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.VerOfertasPage;

public class VerOfertasTestsSteps {

	VerOfertasPage ofertaWebmotors = new VerOfertasPage();
	
	@Dado("que eu navego até a página do webmotors")
	public void navegarAtePagina(){
		ofertaWebmotors.acessaPaginaIncial();
	}
	@Entao("eu clico no botão ver ofertas")
	public void clicarVerOfertas() {
		ofertaWebmotors.clicarBotaoVerOfertas();
	}
	
	@Entao("eu sou direcionado a página de ofertas")
	public void verificarPagina() {
		ofertaWebmotors.validaUrlPerfil();
		
	}
}
