package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class FiltrosPage extends CommonsBasePage{
	WebDriverWait wait;
	Actions builder;
	
	public FiltrosPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acionarFiltros(String filtro_1, String filtro_2) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filtro_2)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(filtro_1)));		
	}
}
