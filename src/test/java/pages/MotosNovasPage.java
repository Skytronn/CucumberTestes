package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class MotosNovasPage extends CommonsBasePage{
	WebDriverWait wait;
	Actions builder;
	
	public MotosNovasPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void VerificarUrlMotos() {
		assertTrue("URL contem motos", wait.until(ExpectedConditions.urlContains("motos")));
	}
}
