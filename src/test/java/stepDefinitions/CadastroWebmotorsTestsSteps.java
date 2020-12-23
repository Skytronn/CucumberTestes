package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;

import io.cucumber.java.pt.*;
import pages.CadastroWebmotorsPage;

public class CadastroWebmotorsTestsSteps {
	
CadastroWebmotorsPage cadastroWebmotors = new CadastroWebmotorsPage();
	
	@Dado("que eu navego até a página de Cadastro do webmotors")
	public void navegarAteCadastro() throws InterruptedException{
		cadastroWebmotors.acessaPaginaCadastro();
		
	}
	
	@E("clico no botão criar conta")
	public void clicarCriarConta() {
		cadastroWebmotors.clicarBotaoCriarConta();
	}
	
	@Quando("eu preencho os meus dados de cadastro")
	public void preenchoDados() {
		Random random = new Random();
		int testeEmail = random.nextInt(45362);
		cadastroWebmotors.preencheDadosDeCadastro("Teste Teste", "teste"+ testeEmail + "@gmail.com", "Teste12345.");
	}
	
	@E("Clico para criar minha conta")
	public void CriarMinhaConta() {
		cadastroWebmotors.clicarElemento(By.id("btnEntrarNovaConta"));
	}
	
	@E("Aceito os Termos")
	public void AceitarTermos() {
		cadastroWebmotors.clicarElemento(By.xpath("//*[@id=\"modal\"]/div/div[1]/div[2]/label[1]/div"));
		cadastroWebmotors.clicarElemento(By.xpath("//*[@id=\"modal\"]/div/div[1]/div[3]/button[2]"));
	}
	
	@Entao("eu estou cadastrado")
	public void verificarPagina() {
		cadastroWebmotors.validaUrlCadastro();
	}
	
}
