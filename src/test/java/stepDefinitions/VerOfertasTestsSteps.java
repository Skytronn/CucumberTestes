package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.VerOfertasPage;

public class VerOfertasTestsSteps {

	VerOfertasPage ofertaWebmotors = new VerOfertasPage();
	
	@Dado("que eu navego do webmotors")
	public void navegarAtePagina(){
		ofertaWebmotors.acessaPaginaIncial();
	}
	@Entao("clico no botão ver ofertas")
	public void clicarVerOfertas() {
		ofertaWebmotors.clicarBotaoVerOfertas();
	}
	
//	@Entao("eu vai para pagina de ofertas")
	//public void verificarPagina() {
	//	ofertaWebmotors.clicarElemento(by);
		
	//}
}
