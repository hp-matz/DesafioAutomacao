package desafio;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CasoDeTeste {

	@Test
	public void comprarProduto() {

		// Abrindo navegador
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SempreIT\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		// tempo pro test ser executado
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// navegando para página
		driver.get("https://www.saucedemo.com/index.html");
		
		// preencher usuário
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		// preencher senha
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		// clickar no botão login
		driver.findElement(By.id("login-button")).click();
		
		 Random gerador = new Random();
		 int x;
		 x = gerador.nextInt(6)+1;
		
		// adcionar algum produto aleatorio ao carrinho
		driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])["+ x +"]")).click();
		
		// clickar no icone do carrinho
		driver.findElement(By.id("shopping_cart_container")).click();
		
		// clickar no botão checkout
		driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
		
		// preencher primeiro nome
		driver.findElement(By.id("first-name")).sendKeys("Matheus");
		
		// prencher sobrenome
		driver.findElement(By.id("last-name")).sendKeys("Martinez");
		
		// preencher com cep
		driver.findElement(By.id("postal-code")).sendKeys("11223344");
		
		// clickar botão continue
		driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();

		//clickar botão finish
		driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
		
		String confirmacao = driver.findElement(By.className("complete-header")).getText();
		assertEquals("THANK YOU FOR YOUR ORDER", confirmacao);
	}
}
