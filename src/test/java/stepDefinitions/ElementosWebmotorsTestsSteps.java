package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.CadastroWebmotorsPage;
import pages.ElementosWebmotorsPage;

public class ElementosWebmotorsTestsSteps {
	
	ElementosWebmotorsPage elementosWebmotors = new ElementosWebmotorsPage();
	
//	@Dado("que eu navego até a página Home do Webmotors")
///	public void navegarAteSite(){
	//	elementosWebmotors.navegarAteSite();
		
//	}
	
	@Então("valido os campos do menu")
	public void verificarElemento() {
		elementosWebmotors.verificarElemento();
	
	}
	

}
