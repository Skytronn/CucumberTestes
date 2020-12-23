package stepDefinitions;


import io.cucumber.java.an.E;
import io.cucumber.java.pt.Então;
import pages.MenuCompraWebmotorsPage;

public class MenuCompraWebmotorsTestSteps {
	
	MenuCompraWebmotorsPage menuWebmotors = new MenuCompraWebmotorsPage();

	
	@E("clico no campo do menu Comprar")
	public void clicarEntrar() {
		menuWebmotors.clicarMenuComprar();
	}
	
	@Então("eu sou direcionado a outra página")
	public void clicarAparecer() {
		menuWebmotors.clicarPagina();
	}

}
