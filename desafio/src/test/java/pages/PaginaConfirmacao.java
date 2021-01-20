package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaConfirmacao {
private WebDriver driver;
	
	public PaginaConfirmacao(WebDriver driver) {
		this.driver = driver;

	}
	
	public void clickarFinish() {
		//clickar botão finish
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
				
	} 
}
