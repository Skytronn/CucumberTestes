package stepDefinitions;

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
		cadastroWebmotors.preencheDadosDeCadastro("Teste Teste", "teste4352@gmail.com", "Teste12345.");
	}
	
	@Entao("eu estou cadastrado")
	public void verificarPagina() {
		cadastroWebmotors.validaUrlCadastro();
	}
	
}
