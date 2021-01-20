package desafio;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.PaginaLogin;
import suporte.Web;

public class CasoDeTestePageObjects {
	private WebDriver driver;
	
	@Before
	public void preedefinicao( ) {
		driver = Web.createDriver();
	}
	
	@Test
	public void comprarProduto() {
		new PaginaLogin(driver)
			.logarSite("standard_user", "secret_sauce")
			.selecionarProdutoAleatorio()
			.clickarCheckout()
			.preencherInformacoes()
			.clickarFinish();
		
	String confirmacao = driver.findElement(By.className("complete-header")).getText();
	assertEquals("THANK YOU FOR YOUR ORDER", confirmacao);
	}
	
	@After
	public void finalizacao() {
		driver.quit();
	}
}
