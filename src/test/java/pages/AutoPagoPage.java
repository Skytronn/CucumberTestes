package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class AutoPagoPage extends CommonsBasePage{
	WebDriverWait wait;
	Actions builder;
	
	public AutoPagoPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
}
