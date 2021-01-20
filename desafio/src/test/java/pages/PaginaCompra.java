package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCompra {

	private WebDriver driver;
	
	public PaginaCompra(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public PaginaCarrinho selecionarProdutoAleatorio() {
		 Random gerador = new Random();
		 int x;
		 x = gerador.nextInt(6)+1;
		
		// adcionar algum produto aleatorio ao carrinho
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])["+ x +"]")).click();
		
		// clickar no icone do carrinho
		driver.findElement(By.id("shopping_cart_container")).click();
		
		return new PaginaCarrinho(driver);
	}
}
