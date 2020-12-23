package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class VerOfertasPage extends CommonsBasePage{

	WebDriverWait wait;
	Actions builder; // builder ele trabalha em cima de encontrar/mover elementos
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	//construtor padrao de inicializaçao da classe
	public VerOfertasPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acessaPaginaIncial() {
		navegarAteSite("https://www.webmotors.com.br");
		
	}
	
	public void clicarBotaoVerOfertas() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/a"))).click();
		
	}
	
	public void validaUrlPerfil(String UrlPesquisa) {
		assertTrue("URL contém ofertas", wait.until(ExpectedConditions.urlContains(UrlPesquisa)));
	}

}
