package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class CadastroWebmotorsPage extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public CadastroWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acessaPaginaCadastro() throws InterruptedException {
		navegarAteSite("https://login.webmotors.com.br/?&r=https://www.webmotors.com.br&inst=header:webmotors::logar-ou-cadastrar");
		Thread.sleep(2000);
	}
	
	public void preencheDadosDeCadastro(String nome, String email, String senha) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nome"))).sendKeys(nome);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("senha"))).sendKeys(senha);
	}
	
	public void clicarBotaoCriarConta() {
		clicarElemento(By.id("btnNovaConta"));
	}
	
	public void validaUrlCadastro() {
		assertTrue("URL não contém o cadastro", wait.until(ExpectedConditions.urlContains("cadastrar")));
	}
}