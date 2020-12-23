package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.pt.*;
import pages.LoginWebmotorsPage;

public class LoginWebmotorsTestsSteps {
	
LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();
	
	@Dado("que eu navego até a página de login do Webmotors")
	public void navegarAteLogin(){
		loginWebmotors.acessaPaginaLogin();
	}
	
	@Quando("eu preencho os meus dados de login")
	public void preenchoDados() {
		loginWebmotors.preencheDadosDeLogin("teste76549@gmail.com", "123456789");
	}
	
	@E("clico no botão entrar")
	public void clicarEntrar() {
		loginWebmotors.clicarElemento(By.id("btnEntrar"));
	}
	
	@Entao("eu estou logado")
	public void verificarPagina() {
		loginWebmotors.validaUrl();
	}
	
	
}
