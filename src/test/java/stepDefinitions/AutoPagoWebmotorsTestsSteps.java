package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

import io.cucumber.java.it.Quando;
import pages.AutoPagoPage;

public class AutoPagoWebmotorsTestsSteps{
	AutoPagoPage autoPago = new AutoPagoPage();
	
	@Quando("Navego até Auto Pago")
	public void autoPago() {
		autoPago.clicarElemento(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[2]"));
		autoPago.clicarElemento(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[2]/div/ul/li[3]"));
	}
}
