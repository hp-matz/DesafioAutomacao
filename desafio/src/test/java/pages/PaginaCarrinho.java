package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaCarrinho {
private WebDriver driver;
	
	public PaginaCarrinho(WebDriver driver) {
		this.driver = driver;

	}
	
	public PaginaFormCompra clickarCheckout() {
		// clickar no botão checkout
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		
		return new PaginaFormCompra(driver);
	} 
}
