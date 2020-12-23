package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.VenderMeuVeiculoPage;
import pages.VerOfertasPage;

public class VenderMeuVeiculoTestsStep {

	VenderMeuVeiculoPage venderVeiculo = new VenderMeuVeiculoPage();

	@Quando("navego até Vender Meu Veiculo")
	public void clicarEmVenderMeuVeiculo() {
		venderVeiculo.clicarElemento(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[2]"));
		venderVeiculo.clicarElemento(By.xpath("//*[@id=\"navigationSellMyCar\"]"));
	}

}
