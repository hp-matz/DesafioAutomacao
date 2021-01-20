package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaLogin {

protected WebDriver driver;
	
	public PaginaLogin(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaCompra logarSite(String login, String senha) {
		// preencher usuário
		driver.findElement(By.id("user-name")).sendKeys(login);
		
		// preencher senha
		driver.findElement(By.id("password")).sendKeys(senha);
		
		// clickar no botão login
		driver.findElement(By.id("login-button")).click();
		
		return new PaginaCompra(driver);
	}
}
