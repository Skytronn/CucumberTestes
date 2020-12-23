package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class MenuCompraWebmotorsPage extends CommonsBasePage {
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public MenuCompraWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());

	}
	
	public void clicarMenuComprar() {
		clicarElemento(By.xpath("//*//*[@id=\"root\"]/header/nav/div/ul/li[1]"));
		
	}
	
	public void clicarPagina() {
		clicarElemento(By.xpath("//*[@id=\"navigationUsedOrNewCars\"]"));
	}
}
