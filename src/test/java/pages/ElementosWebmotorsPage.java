package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class ElementosWebmotorsPage extends CommonsBasePage {

	
	WebDriverWait wait;
	Actions builder;

	
	public ElementosWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	
	public void verificarElemento() {

		assertTrue("Não existe a opção comprar", _Driver().getPageSource().contains("Comprar"));
		assertTrue("Não existe a opção vender", _Driver().getPageSource().contains("Vender"));
		assertTrue("Não existe a opção serviços", _Driver().getPageSource().contains("Serviços"));
		assertTrue("Não existe a opção ajuda", _Driver().getPageSource().contains("Ajuda"));
		assertTrue("Não existe a opção entrar", _Driver().getPageSource().contains("Entrar"));
	}}
