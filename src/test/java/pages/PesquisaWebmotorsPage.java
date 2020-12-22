package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class PesquisaWebmotorsPage extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder; // builder ele trabalha em cima de encontrar/mover elementos
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public PesquisaWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}

	public void navegaSite() {
		navegarAteSite("https://www.webmotors.com.br");
	}
	
	public void preencheProduto(String produto) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/a"))).sendKeys(produto);
		
	}
	
	public void clicarBotaoVerOfertas() {		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/a"))).click();
	}
	
	public void validaUrlPesquisa() {
		assertTrue("URL não contém o pesquisa", wait.until(ExpectedConditions.urlContains("pesquisa")));
	}
	
}
