package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaFormCompra {
private WebDriver driver;
	
	public PaginaFormCompra(WebDriver driver) {
		this.driver = driver;

	}
	public PaginaConfirmacao preencherInformacoes() {
		//preencher primeiro nome
				driver.findElement(By.id("first-name")).sendKeys("Matheus");
				
				// prencher sobrenome
				driver.findElement(By.id("last-name")).sendKeys("Martinez");
				
				// preencher com cep
				driver.findElement(By.id("postal-code")).sendKeys("11223344");
				
				// clickar botão continue
				driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();

		return new PaginaConfirmacao(driver);
	} 
}

